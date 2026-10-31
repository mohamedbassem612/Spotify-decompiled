package p;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b1c1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1c1(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        and1 cnd1Var;
        cje1 cje1Var;
        byte b = this.a;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke((gax) obj);
                return rih1Var;
            case 1:
                iu30Var.invoke((v6d1) obj);
                return rih1Var;
            case 2:
                iu30Var.invoke(new nbd1((gax) obj));
                return rih1Var;
            case 3:
                iu30Var.invoke(((qnc0) obj).b);
                return rih1Var;
            case 4:
                knd1 knd1Var = (knd1) obj;
                if (knd1Var instanceof hnd1) {
                    cnd1Var = new and1(((hnd1) knd1Var).a);
                } else if (knd1Var instanceof ind1) {
                    cnd1Var = new bnd1(((ind1) knd1Var).a);
                } else {
                    if (!(knd1Var instanceof jnd1)) {
                        eg.o();
                        return null;
                    }
                    jnd1 jnd1Var = (jnd1) knd1Var;
                    cnd1Var = new cnd1(jnd1Var.b, jnd1Var.a);
                }
                iu30Var.invoke(cnd1Var);
                return rih1Var;
            case 5:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 6:
                iu30Var.invoke(new r0e1((chf0) obj));
                return rih1Var;
            case 7:
                iu30Var.invoke(new pbe1((String) obj));
                return rih1Var;
            case 8:
                iu30Var.invoke((lde1) obj);
                return rih1Var;
            case 9:
                iu30Var.invoke((View) obj);
                return rih1Var;
            case 10:
                ite1 ite1Var = (ite1) obj;
                if (ite1Var.equals(gte1.a)) {
                    cje1Var = cje1.a;
                } else {
                    if (!ite1Var.equals(hte1.a)) {
                        eg.o();
                        return null;
                    }
                    cje1Var = dje1.a;
                }
                iu30Var.invoke(cje1Var);
                return rih1Var;
            case 11:
                iu30Var.invoke(new bje1((String) obj));
                return rih1Var;
            case 12:
                sse1 sse1Var = (sse1) obj;
                if (sse1Var instanceof qse1) {
                    iu30Var.invoke(ase1.a);
                } else if (sse1Var instanceof pse1) {
                    iu30Var.invoke(xre1.a);
                } else if (!(sse1Var instanceof rse1)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 13:
                iu30Var.invoke(new mz(((Number) obj).floatValue()));
                return rih1Var;
            case 14:
                iu30Var.invoke(new j00(((Number) obj).floatValue()));
                return rih1Var;
            case 15:
                iu30Var.invoke(new k00(Float.intBitsToFloat((int) (((Offset) obj).a >> 32))));
                return rih1Var;
            case 16:
                long j = ((Offset) obj).a;
                iu30Var.invoke(t00.a);
                return rih1Var;
            case 17:
                ((Number) obj).longValue();
                iu30Var.invoke(gz.a);
                return rih1Var;
            case 18:
                iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a >> 32)));
                return rih1Var;
            case 19:
                iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a >> 32)));
                return rih1Var;
            case 20:
                iu30Var.invoke(new hef1((String) obj));
                return rih1Var;
            case 21:
                iu30Var.invoke(new ref1((String) obj));
                return rih1Var;
            case 22:
                cff1 cff1Var = (cff1) obj;
                if (cff1Var instanceof aff1) {
                    aff1 aff1Var = (aff1) cff1Var;
                    iu30Var.invoke(new pff1(aff1Var.a, aff1Var.b));
                } else {
                    if (!(cff1Var instanceof bff1)) {
                        eg.o();
                        return null;
                    }
                    bff1 bff1Var = (bff1) cff1Var;
                    iu30Var.invoke(new tff1(bff1Var.a, bff1Var.b));
                }
                return rih1Var;
            case 23:
                ((qtr) obj).b(new q7a1(iu30Var, lnmVar, (byte) 2));
                return rih1Var;
            case 24:
                iu30Var.invoke(new hmf1(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 25:
                iu30Var.invoke(new rrf1((String) obj));
                return rih1Var;
            case 26:
                iu30Var.invoke(new bsf1((String) obj));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((qtr) obj).b(new q7a1(iu30Var, lnmVar, (byte) 4));
                return rih1Var;
            case 28:
                iu30Var.invoke((sp21) obj);
                return rih1Var;
            default:
                yon1.K5((mxc) obj, new b1c1(iu30Var, (byte) 28));
                return rih1Var;
        }
    }
}
