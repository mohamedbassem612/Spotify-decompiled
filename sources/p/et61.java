package p;

import android.graphics.Rect;
import android.view.View;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class et61 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et61(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                return new it61(iu30Var.invoke(obj));
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    iu30Var.invoke(m071.a);
                }
                return rih1Var;
            case 2:
                iu30Var.invoke(new hk71(((Number) obj).intValue()));
                return rih1Var;
            case 3:
                tn71 tn71Var = (tn71) obj;
                tn71Var.a = new iuy0(iu30Var, (byte) 15);
                tn71Var.b = new iuy0(iu30Var, (byte) 16);
                tn71Var.c = new iuy0(iu30Var, (byte) 17);
                tn71Var.d = new et61(iu30Var, (byte) 2);
                return tn71Var;
            case 4:
                iu30Var.invoke(new fm71(((Number) obj).intValue()));
                return rih1Var;
            case 5:
                iu30Var.invoke(new fm71(((Number) obj).intValue()));
                return rih1Var;
            case 6:
                iu30Var.invoke(new xo71((tv80) obj));
                return rih1Var;
            case 7:
                if (((dr71) obj).equals(dr71.a)) {
                    iu30Var.invoke(mr71.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                iu30Var.invoke(Integer.valueOf(((y9e1) obj).b.f));
                return rih1Var;
            case 9:
                cd81 cd81VarR = j541.r((c700) obj);
                if (cd81VarR != null) {
                    iu30Var.invoke(cd81VarR);
                }
                return rih1Var;
            case 10:
                cd81 cd81VarR2 = j541.r((c700) obj);
                if (cd81VarR2 != null) {
                    iu30Var.invoke(cd81VarR2);
                }
                return rih1Var;
            case 11:
                iu30Var.invoke(te81.a);
                return rih1Var;
            case 12:
                iu30Var.invoke((ebt0) obj);
                return rih1Var;
            case 13:
                iu30Var.invoke(o991.a);
                return rih1Var;
            case 14:
                iu30Var.invoke(new mw91((hx91) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a & 4294967295L)));
                return rih1Var;
            case 16:
                iu30Var.invoke(Float.valueOf(Float.intBitsToFloat((int) (((elb0) obj).p(0L) & 4294967295L))));
                return rih1Var;
            case 17:
                iu30Var.invoke(new qga1((eia1) obj));
                return rih1Var;
            case 18:
                iu30Var.invoke(new oga1((bb20) obj));
                return rih1Var;
            case 19:
                Rect rect = new Rect();
                ((View) obj).getGlobalVisibleRect(rect);
                iu30Var.invoke(new csa1(new bsa1(rect.left, rect.top, rect.right, rect.bottom)));
                return rih1Var;
            case 20:
                iu30Var.invoke(new msa1(((pqa1) obj) == pqa1.a));
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                iu30Var.invoke((dta1) obj);
                return rih1Var;
            case 22:
                iu30Var.invoke((dta1) obj);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                iu30Var.invoke(new msa1(((uva1) obj) == uva1.a));
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                iu30Var.invoke((dta1) obj);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                iu30Var.invoke((dta1) obj);
                return rih1Var;
            case 26:
                iu30Var.invoke(isb1.a);
                return rih1Var;
            case 27:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                b261.g(e261Var, (String) null, new pba1(iu30Var, (byte) 18));
                return rih1Var;
            case 28:
                iu30Var.invoke(new vwb1((String) obj));
                return rih1Var;
            default:
                iu30Var.invoke(new f6g0((i7g0) obj));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et61(od81 od81Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }
}
