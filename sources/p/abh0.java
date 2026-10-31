package p;

import com.spotify.scrollsita.v1.Section;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class abh0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ abh0(ven0 ven0Var, byte b) {
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
                String str = (String) obj;
                ven0Var.setValue(u890.j((String) ven0Var.getValue(), str) ? null : str);
                return rih1Var;
            case 1:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new vk1(ven0Var, (lnm) null, (byte) 17);
                abc0Var.d = new c470(ven0Var, (byte) 27);
                return rih1Var;
            case 2:
                return new ij6(ven0Var, (byte) 3);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ven0Var.setValue(bool);
                return rih1Var;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ven0Var.setValue(bool2);
                return rih1Var;
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ven0Var.setValue(bool3);
                return rih1Var;
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                ven0Var.setValue(bool4);
                return rih1Var;
            case 7:
                return new ij6(ven0Var, (byte) 4);
            case 8:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                ven0Var.setValue(bool5);
                return rih1Var;
            case 9:
                ven0Var.setValue((s201) obj);
                return rih1Var;
            case 10:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 11:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 12:
                yr80 yr80Var = (yr80) obj;
                long j = yr80Var.a;
                ven0Var.setValue(yr80Var);
                return rih1Var;
            case 13:
                ven0Var.setValue((iek0) obj);
                return rih1Var;
            case 14:
                ven0Var.setValue((mfk0) obj);
                return rih1Var;
            case 15:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                ven0Var.setValue(bool6);
                return rih1Var;
            case 16:
                ven0Var.setValue(obj);
                return rih1Var;
            case 17:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 18:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 19:
                AtomicLong atomicLong = bcn0.a;
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 20:
                ((iu30) ven0Var.getValue()).invoke(new ohn0((shn0) obj));
                return rih1Var;
            case 21:
                ven0Var.setValue(new fzn0((Function0) obj));
                return rih1Var;
            case 22:
                kaa0.j(nho1.A((elb0) obj), ven0Var);
                return rih1Var;
            case 23:
                ven0Var.setValue(o7h.y0((List) obj, "", (String) null, (String) null, (iu30) null, 62));
                return rih1Var;
            case 24:
                yr80 yr80Var2 = (yr80) obj;
                long j2 = yr80Var2.a;
                ven0Var.setValue(yr80Var2);
                return rih1Var;
            case 25:
                yr80 yr80Var3 = (yr80) obj;
                long j3 = yr80Var3.a;
                ven0Var.setValue(yr80Var3);
                return rih1Var;
            case 26:
                ((iu30) ven0Var.getValue()).invoke((s3t0) obj);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((iu30) ven0Var.getValue()).invoke((s3t0) obj);
                return rih1Var;
            case 28:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            default:
                ven0Var.setValue(Long.valueOf(((Number) obj).longValue()));
                return rih1Var;
        }
    }
}
