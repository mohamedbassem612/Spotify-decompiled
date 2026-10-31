package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ke8 extends tv30 implements vu30 {
    public static final ke8 a = new ke8(2, ba8.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0);

    public final Object invoke(Object obj, Object obj2) {
        ba8 ba8Var = (ba8) obj;
        String str = (String) obj2;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ba8Var.a, ba8Var.b.a, System.currentTimeMillis());
    }
}
