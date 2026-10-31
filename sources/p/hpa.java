package p;

import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import com.spotify.messages.BetamaxTranscoderSession;
import com.spotify.messages.BetamaxTranscoderSessionItem;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hpa {
    public final t2j0 a;
    public final r3b1 b;
    public final yqg c;
    public final ied1 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public hpa(t2j0 t2j0Var, r3b1 r3b1Var, yqg yqgVar, ied1 ied1Var) {
        this.a = t2j0Var;
        this.b = r3b1Var;
        this.c = yqgVar;
        this.d = ied1Var;
    }

    public final void a(long j, long j2, long j3) {
        gpa gpaVar = (gpa) this.e.remove(Long.valueOf(j));
        if (gpaVar == null) {
            return;
        }
        c(gpaVar, "cancelled", null, j2, j3);
    }

    public final void b(long j, int i, x7g1 x7g1Var, boolean z) {
        gpa gpaVar = (gpa) this.e.get(Long.valueOf(j));
        if (gpaVar == null) {
            return;
        }
        boolean z2 = x7g1Var instanceof x7g1;
        if (!z2) {
            eg.o();
            return;
        }
        String string = "";
        if (z2) {
            Locale locale = x7g1Var.c;
            if (!u890.j(locale, Locale.ROOT)) {
                string = locale.toString();
            }
        }
        string.getClass();
        ArrayList arrayList = new ArrayList();
        n5f0 n5f0Var = x7g1Var.b;
        long j2 = n5f0Var.a;
        long j3 = n5f0Var.b;
        gpaVar.e = (j3 - j2) + gpaVar.e;
        Long lValueOf = Long.valueOf(j2);
        Long lValueOf2 = Long.valueOf(j3);
        long jLongValue = lValueOf.longValue();
        long jLongValue2 = lValueOf2.longValue();
        rpa rpaVarO = BetamaxTranscoderSessionItem.o();
        rpaVarO.x(gpaVar.a);
        rpaVarO.y(UUID.randomUUID().toString());
        rpaVarO.t(i);
        rpaVarO.u();
        rpaVarO.v(x7g1Var.a);
        rpaVarO.s(z);
        rpaVarO.w(string);
        rpaVarO.n(arrayList);
        rpaVarO.r(jLongValue);
        rpaVarO.q(jLongValue2);
        BetamaxTranscoderSessionItem betamaxTranscoderSessionItemBuild = rpaVarO.build();
        betamaxTranscoderSessionItemBuild.getClass();
        this.a.a(betamaxTranscoderSessionItemBuild);
    }

    public final void c(gpa gpaVar, String str, BetamaxTranscoderException betamaxTranscoderException, long j, long j2) {
        String str2;
        long jB = this.c.b();
        String strZ = zod.z(this.b.a());
        guq0 guq0Var = gpaVar.b;
        long j3 = gpaVar.d;
        zax zaxVar = guq0Var.c;
        int i = zaxVar.b;
        Integer num = zaxVar.c;
        int iIntValue = num != null ? num.intValue() : xvj1.h(i);
        Integer num2 = zaxVar.d;
        int iIntValue2 = num2 != null ? num2.intValue() : xvj1.d(i);
        int i2 = guq0Var.b;
        long jB2 = td6.b(zaxVar.a) * StoryCard.CLASSIC_CONTENT_FIELD_NUMBER;
        qpa qpaVarN = BetamaxTranscoderSession.n();
        qpaVarN.E(gpaVar.a);
        qpaVarN.y(j3);
        qpaVarN.z(j3);
        qpaVarN.x(jB);
        qpaVarN.A(str);
        qpaVarN.s(j);
        qpaVarN.r(j2);
        qpaVarN.q(jB2);
        qpaVarN.C(iIntValue);
        qpaVarN.B(iIntValue2);
        if (i2 == 1) {
            str2 = "H264";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str2 = "H265";
        }
        qpaVarN.F(str2);
        qpaVarN.u(gpaVar.c);
        qpaVarN.t(strZ);
        if (betamaxTranscoderException != null) {
            qpaVarN.v(betamaxTranscoderException.a.a);
            String message = betamaxTranscoderException.getMessage();
            if (message == null) {
                message = "";
            }
            qpaVarN.w(message);
        }
        fsi0 fsi0Var = gpaVar.f;
        if (fsi0Var != null) {
            qpaVarN.n(fsi0Var.a);
            qpaVarN.D(fsi0Var.b);
        }
        BetamaxTranscoderSession betamaxTranscoderSessionBuild = qpaVarN.build();
        betamaxTranscoderSessionBuild.getClass();
        this.a.a(betamaxTranscoderSessionBuild);
    }
}
