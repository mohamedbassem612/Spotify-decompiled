package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.scrollsita.v1.Section;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bzm extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bzm(ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                long j = ((Offset) obj).a;
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 1:
                yr80 yr80Var = (yr80) obj;
                long j2 = yr80Var.a;
                ven0Var.setValue(yr80Var);
                return rih1Var;
            case 2:
                long j3 = ((Offset) obj).a;
                kaa0.j(0L, ven0Var);
                return rih1Var;
            case 3:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 4:
                kaa0.j(((elb0) obj).p(0L), ven0Var);
                return rih1Var;
            case 5:
                ven0Var.setValue((jy2) obj);
                return rih1Var;
            case 6:
                pzm.k(((p3v) obj).a + 16.0f + 4.0f, ven0Var);
                return rih1Var;
            case 7:
                p3v p3vVar = (p3v) obj;
                float f = p3vVar.a;
                ven0Var.setValue(p3vVar);
                return rih1Var;
            case 8:
                pzm.k(((p3v) obj).a + 16.0f + 4.0f, ven0Var);
                return rih1Var;
            case 9:
                ven0Var.setValue(Integer.valueOf((int) (((elb0) obj).b() & 4294967295L)));
                return rih1Var;
            case 10:
                long j4 = ((Offset) obj).a;
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 11:
                oq70 oq70Var = ((li7) obj).b.a;
                ven0Var.setValue((oq70Var.getWidth() == -1 || oq70Var.getHeight() == -1) ? new mmr0(1, 1) : new mmr0(Integer.valueOf(oq70Var.getWidth()), Integer.valueOf(oq70Var.getHeight())));
                return rih1Var;
            case 12:
                ((g660) ven0Var.getValue()).a = (cl70) obj;
                return rih1Var;
            case 13:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 3));
                return rih1Var;
            case 14:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 4));
                return rih1Var;
            case 15:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 4));
                return rih1Var;
            case 16:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 3));
                return rih1Var;
            case 17:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 4));
                return rih1Var;
            case 18:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 3));
                return rih1Var;
            case 19:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 3));
                return rih1Var;
            case 20:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 3));
                return rih1Var;
            case 21:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).b.f > 4));
                return rih1Var;
            case 22:
                ven0Var.setValue((ur80) obj);
                return rih1Var;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case 24:
                int iOrdinal = ((yd10) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        ((iu30) ven0Var.getValue()).invoke(r130.a);
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        ((iu30) ven0Var.getValue()).invoke(r130.b);
                    }
                }
                return rih1Var;
            case 25:
                ven0Var.setValue((elb0) obj);
                return rih1Var;
            case 26:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ven0Var.setValue(bool2);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((iu30) ven0Var.getValue()).invoke((hr3) obj);
                return rih1Var;
            case 28:
                int iOrdinal2 = ((yd10) obj).ordinal();
                if (iOrdinal2 == 0) {
                    ((iu30) ven0Var.getValue()).invoke(mvm1.a);
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    ((iu30) ven0Var.getValue()).invoke(mvm1.b);
                }
                return rih1Var;
            default:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
        }
    }
}
