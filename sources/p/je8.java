package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class je8 extends tv30 implements vu30 {
    public static final je8 a = new je8(2, aa8.class, "hitNavigateToWebviewUri", "hitNavigateToWebviewUri(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0);

    public final Object invoke(Object obj, Object obj2) {
        aa8 aa8Var = (aa8) obj;
        String str = (String) obj2;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), aa8Var.a, aa8Var.b.a, System.currentTimeMillis());
    }
}
