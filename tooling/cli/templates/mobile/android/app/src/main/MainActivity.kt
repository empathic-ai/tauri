package {{reverse-domain app.domain}}.{{snake-case app.name}}

class MainActivity : TauriActivity() {
  override fun onStart() {
    super.onStart()
    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
      android.webkit.WebView.setWebContentsDebuggingEnabled(true);
    }
  }
}
