package p;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aml1 implements ec10 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final yve1 b;
    public final jqc1 d;
    public final boolean e;
    public gc10 f;
    public int h;
    public final izr0 c = new izr0();
    public byte[] g = new byte[SemanticState.ReadOnly];

    public aml1(String str, yve1 yve1Var, jqc1 jqc1Var, boolean z) {
        this.a = str;
        this.b = yve1Var;
        this.d = jqc1Var;
        this.e = z;
    }

    @Override // p.ec10
    public final void a(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        if (this.e) {
            gc10Var = new wh41(gc10Var, this.d);
        }
        this.f = gc10Var;
        gc10Var.c(new bc9(-9223372036854775807L));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        String strR;
        this.f.getClass();
        int length = (int) fc10Var.getLength();
        int i2 = this.h;
        byte[] bArrCopyOf = this.g;
        if (i2 == bArrCopyOf.length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, ((length != -1 ? length : bArrCopyOf.length) * 3) / 2);
            this.g = bArrCopyOf;
        }
        int i3 = this.h;
        int i4 = fc10Var.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
        if (i4 != -1) {
            int i5 = this.h + i4;
            this.h = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        izr0 izr0Var = new izr0(this.g);
        cml1.d(izr0Var);
        String strR2 = izr0Var.r(StandardCharsets.UTF_8);
        long jG0 = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strR2)) {
                while (true) {
                    String strR3 = izr0Var.r(StandardCharsets.UTF_8);
                    if (strR3 == null) {
                        break;
                    }
                    if (cml1.a.matcher(strR3).matches()) {
                        do {
                            strR = izr0Var.r(StandardCharsets.UTF_8);
                            if (strR == null) {
                                break;
                            }
                        } while (!strR.isEmpty());
                    } else {
                        Matcher matcher2 = zll1.a.matcher(strR3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    f(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = cml1.c(strGroup);
                String str = zoi1.a;
                long jB = this.b.b(zoi1.g0((jG0 + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                gtf1 gtf1VarF = f(jB - jC2);
                byte[] bArr = this.g;
                int i6 = this.h;
                izr0 izr0Var2 = this.c;
                izr0Var2.P(bArr, i6);
                gtf1VarF.f(this.h, izr0Var2);
                gtf1VarF.b(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strR2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strR2);
                if (!matcher3.find()) {
                    throw ParserException.a((RuntimeException) null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strR2));
                }
                Matcher matcher4 = j.matcher(strR2);
                if (!matcher4.find()) {
                    throw ParserException.a((RuntimeException) null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strR2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = cml1.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = zoi1.a;
                jG0 = zoi1.g0(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strR2 = izr0Var.r(StandardCharsets.UTF_8);
        }
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        uyr uyrVar = (uyr) fc10Var;
        uyrVar.d(this.g, 0, 6, false);
        byte[] bArr = this.g;
        izr0 izr0Var = this.c;
        izr0Var.P(bArr, 6);
        if (cml1.a(izr0Var)) {
            return true;
        }
        uyrVar.d(this.g, 6, 3, false);
        izr0Var.P(this.g, 9);
        return cml1.a(izr0Var);
    }

    public final gtf1 f(long j2) {
        gtf1 gtf1VarW = this.f.w(0, 3);
        ge30 ge30Var = new ge30();
        ge30Var.o = asj0.p("text/vtt");
        ge30Var.d = this.a;
        ge30Var.t = j2;
        xvj1.q(ge30Var, gtf1VarW);
        this.f.s();
        return gtf1VarW;
    }

    @Override // p.ec10
    public final void release() {
    }
}
