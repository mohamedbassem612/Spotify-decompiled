package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kmj1 {
    public final ju4 a;

    public kmj1(ju4 ju4Var) {
        this.a = ju4Var;
    }

    public static imj1 b(iu30 iu30Var) {
        return new imj1(new l4r(v061.d, 2, egj1.d1, new j4r(new ceg1(iu30Var, (byte) 28)), egj1.e1), new l4r(pwc0.b, 2, jmj1.b, new j4r(new ceg1(iu30Var, (byte) 29)), jmj1.c));
    }

    public final o3r a(String str) {
        imj1 imj1VarB = b(new ysf1(str, (byte) 26));
        return w3p1.n(imj1VarB.a, imj1VarB.b, new lda1(2, this, kmj1.class, "resolve", "resolve(Ljava/lang/Boolean;Lcom/spotify/listplatform/endpoints/kodiak/ListMetadataTable$Entity;)Lcom/spotify/musicvideos/listvideofirst/VideoFirstMode;", 0, (byte) 12));
    }

    public final cmj1 c(Boolean bool, qxc0 qxc0Var) {
        Map map = qxc0Var != null ? qxc0Var.X : null;
        if (map == null) {
            map = b7x.a;
        }
        if (this.a.a() && Boolean.parseBoolean((String) map.get("is_video_first"))) {
            return cmj1.c;
        }
        return u890.j(bool, Boolean.TRUE) ? cmj1.b : cmj1.a;
    }
}
