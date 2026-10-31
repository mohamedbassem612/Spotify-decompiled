package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wck0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wck0(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        g9q0 o9q0Var;
        byte b = this.a;
        boolean zBooleanValue = false;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new dck0((String) obj));
                return rih1Var;
            case 1:
                if (xck0.a[((mdk0) obj).ordinal()] == 1) {
                    iu30Var.invoke(ock0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                iu30Var.invoke(new fck0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 3:
                iu30Var.invoke((ebt0) obj);
                return rih1Var;
            case 4:
                iu30Var.invoke((ebt0) obj);
                return rih1Var;
            case 5:
                iu30Var.invoke(new bxm0(((Number) obj).intValue()));
                return rih1Var;
            case 6:
                iu30Var.invoke(Integer.valueOf((int) (((Number) obj).floatValue() * 100.0f)));
                return rih1Var;
            case 7:
                iu30Var.invoke(new kgn0((jgn0) obj));
                return rih1Var;
            case 8:
                jix jixVar = (mix) obj;
                if (jixVar instanceof jix) {
                    iu30Var.invoke(new uhn0(shn0.valueOf(jixVar.a.a)));
                } else if (jixVar instanceof iix) {
                    iu30Var.invoke(new thn0(shn0.valueOf(((iix) jixVar).a.a)));
                } else if (jixVar instanceof gix) {
                    iu30Var.invoke(vhn0.a);
                }
                return rih1Var;
            case 9:
                iu30Var.invoke((p5o0) obj);
                return rih1Var;
            case 10:
                iu30Var.invoke(new xo71((tv80) obj));
                return rih1Var;
            case 11:
                iu30Var.invoke(new i200((String) obj));
                return rih1Var;
            case 12:
                wz20 wz20Var = (wz20) obj;
                if (iu30Var != null) {
                    iu30Var.invoke(Boolean.valueOf(wz20Var.b()));
                }
                return rih1Var;
            case 13:
                iu30Var.invoke(ulo0.a);
                return rih1Var;
            case 14:
                iu30Var.invoke(npo0.a);
                return rih1Var;
            case 15:
                iu30Var.invoke(new hro0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 16:
                fmp0 fmp0Var = (fmp0) obj;
                if (fmp0Var.equals(cmp0.a)) {
                    iu30Var.invoke(tlp0.a);
                } else if (fmp0Var.equals(emp0.a)) {
                    iu30Var.invoke(rlp0.a);
                } else {
                    if (!fmp0Var.equals(dmp0.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(qlp0.a);
                }
                return rih1Var;
            case 17:
                jaq0 jaq0Var = (jaq0) obj;
                if (jaq0Var instanceof baq0) {
                    o9q0Var = new g9q0(((baq0) jaq0Var).a);
                } else if (jaq0Var instanceof caq0) {
                    o9q0Var = new h9q0(((caq0) jaq0Var).a);
                } else if (jaq0Var instanceof daq0) {
                    o9q0Var = new i9q0(((daq0) jaq0Var).a);
                } else if (jaq0Var instanceof eaq0) {
                    o9q0Var = new j9q0(((eaq0) jaq0Var).a);
                } else if (jaq0Var instanceof faq0) {
                    faq0 faq0Var = (faq0) jaq0Var;
                    o9q0Var = new k9q0(faq0Var.a, faq0Var.b);
                } else if (jaq0Var instanceof gaq0) {
                    gaq0 gaq0Var = (gaq0) jaq0Var;
                    o9q0Var = new l9q0(gaq0Var.a, gaq0Var.b);
                } else if (jaq0Var instanceof haq0) {
                    o9q0Var = new m9q0(((haq0) jaq0Var).a);
                } else {
                    if (!(jaq0Var instanceof iaq0)) {
                        eg.o();
                        return null;
                    }
                    o9q0Var = new o9q0(((iaq0) jaq0Var).a);
                }
                iu30Var.invoke(o9q0Var);
                return rih1Var;
            case 18:
                iu30Var.invoke(new geq0((String) obj));
                return rih1Var;
            case 19:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 20:
                iu30Var.invoke(new hgq0((String) obj));
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                iu30Var.invoke(new esq0((haw0) obj));
                return rih1Var;
            case 22:
                CompositeException compositeException = (Throwable) obj;
                if (compositeException instanceof CompositeException) {
                    List<Throwable> list = compositeException.a;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        zBooleanValue = true;
                    } else {
                        for (Throwable th : list) {
                            th.getClass();
                            if (!((Boolean) iu30Var.invoke(th)).booleanValue()) {
                            }
                        }
                        zBooleanValue = true;
                    }
                } else {
                    zBooleanValue = ((Boolean) iu30Var.invoke(compositeException)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf(((Boolean) iu30Var.invoke(rwq0.E((qwq0) obj).b)).booleanValue());
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                iu30Var.invoke(new aym0((gax) obj));
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(new txn0((gax) obj));
                return rih1Var;
            case 26:
                iu30Var.invoke(new nbd1((gax) obj));
                return rih1Var;
            case 27:
                iu30Var.invoke(new eyz((e6r) obj));
                return rih1Var;
            case 28:
                ((Boolean) obj).getClass();
                iu30Var.invoke(vwr0.a);
                return rih1Var;
            default:
                ((Boolean) obj).getClass();
                iu30Var.invoke(zwr0.a);
                return rih1Var;
        }
    }
}
