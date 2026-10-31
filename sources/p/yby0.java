package p;

import android.content.Context;
import android.text.format.DateFormat;
import j$.time.Instant;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yby0 implements xpw {
    public final yqg a;
    public final bpb1 b;
    public final rey0 c = k1o1.p();
    public final eih1 d = new eih1();
    public final psw e;

    public yby0(yqg yqgVar, bpb1 bpb1Var) {
        this.a = yqgVar;
        this.b = bpb1Var;
        j2i j2iVar = new j2i(-1569140827, new qsu0(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static String h(Context context, Instant instant) {
        Locale localeB = yoi1.A(context.getResources().getConfiguration()).b(0);
        if (localeB == null) {
            localeB = Locale.US;
        }
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeB, "MMMd"), localeB).format(new Date(instant.toEpochMilli()));
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final void e(List list, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1388734155);
        int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        byte b = 18;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            boolean zI = x340Var.i(err0Var) | (i3 == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xby0(list, err0Var, null, (byte) 0);
                x340Var.s0(objT2);
            }
            qxd0.t(list, x340Var, (vu30) objT2);
            uwr uwrVar = cbx.a;
            int iH = (int) jfv.h(cbx.c(x340Var).b.a);
            Integer numValueOf = Integer.valueOf(err0Var.s());
            boolean zE = x340Var.e(iH);
            Object objT3 = x340Var.T();
            if (zE || objT3 == m4cVar) {
                objT3 = new po60(iH, (byte) 21);
                x340Var.s0(objT3);
            }
            hm5.a(numValueOf, qim0Var, (iu30) objT3, (tl3) null, "generating_message", (iu30) null, apo.r(-361041237, new ixt0(list, b), x340Var), x340Var, (i2 & 112) | 1597440, 40);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(this, list, qim0Var, i, (byte) 4);
        }
    }

    public final boolean f(long j) {
        yqg yqgVar = this.a;
        Calendar calendarD = yqgVar.d();
        Calendar calendarD2 = yqgVar.d();
        calendarD2.setTimeInMillis(j);
        return calendarD.get(1) == calendarD2.get(1) && calendarD.get(6) == calendarD2.get(6);
    }

    public final String g(Context context, Instant instant) {
        if (f(instant.toEpochMilli())) {
            String string = context.getString(2131956537, DateFormat.getTimeFormat(context).format(new Date(instant.toEpochMilli())));
            string.getClass();
            return string;
        }
        String string2 = context.getString(2131956538, h(context, instant));
        string2.getClass();
        return string2;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
