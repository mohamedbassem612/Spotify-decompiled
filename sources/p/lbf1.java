package p;

import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class lbf1 {
    public static String a(Paragraph paragraph) {
        String strU = ror0.a(paragraph).u();
        if (paragraph.u() == 3) {
            int i = 0;
            for (Object obj : paragraph.q().u()) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                strU = nhc1.W(strU, f4i1.c(i2, "$"), ((Paragraph.TextStyle) obj).u());
                i = i2;
            }
        }
        return strU;
    }
}
