package {{reverse-domain app.domain}}.{{snake-case app.name}}

class MainActivity : TauriActivity() {
  override fun onStart() {
    super.onStart()
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      WebView.setWebContentsDebuggingEnabled(true);
    }
  }
}
