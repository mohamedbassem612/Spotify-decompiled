package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yi80 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;

    public /* synthetic */ yi80(y7e1 y7e1Var, byte b) {
        this.a = b;
        this.b = y7e1Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y7e1 y7e1Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                String strC1 = ihc1.c1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, str);
                if (!strC1.equals(str)) {
                    c4p1.E(strC1, y7e1Var);
                }
                break;
            default:
                m251 m251Var = (m251) obj;
                if (!u890.j(y7e1Var.d().d.toString(), m251Var.a)) {
                    c4p1.E(m251Var.a, y7e1Var);
                }
                break;
        }
        return rih1Var;
    }
}
