package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzad;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzag;
import com.google.android.recaptcha.internal.zzah;
import com.google.android.recaptcha.internal.zzao;
import com.google.android.recaptcha.internal.zzap;
import com.google.android.recaptcha.internal.zzx;
import com.google.android.recaptcha.internal.zzy;
import com.google.android.recaptcha.internal.zzz;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class z7p1 implements ghn1 {
    public static final /* synthetic */ z7p1 b;
    public static final /* synthetic */ z7p1 c;
    public static final /* synthetic */ z7p1 d;
    public static final /* synthetic */ z7p1 e;
    public static final /* synthetic */ z7p1 f;
    public static final /* synthetic */ z7p1 g;
    public static final /* synthetic */ z7p1 h;
    public static final /* synthetic */ z7p1 i;
    public static final /* synthetic */ z7p1 j;
    public static final /* synthetic */ z7p1 k;
    public static final /* synthetic */ z7p1 l;
    public static final /* synthetic */ z7p1 m;
    public static final /* synthetic */ z7p1 n;
    public static final /* synthetic */ z7p1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ z7p1 f43p;
    public static final /* synthetic */ z7p1 q;
    public final /* synthetic */ int a;

    static {
        int i2 = (((((~386839851) & 502322068) | 1879579667) + ((386839851 & 1341449093) | 1376723995)) - (-1804183289)) ^ (2118801173 % 1119399015);
        int i3 = (((((~310242589) & 1847460522) | 916960512) + ((310242589 & 1486357226) | 346393668)) - 2000278179) ^ (2125023787 % 550804899);
        int i4 = (((((~2025251990) & 688917531) | 1994836270) + ((2025251990 & 152053269) | 883831534)) - (-1390790891)) ^ (1069117832 % 942581876);
        int i5 = (((((~1650994571) & 1371186185) | 1050017619) + ((1650994571 & 1227505800) | 205643505)) - (-1965943233)) ^ (1992865128 % 986478257);
        int i6 = (((((~1199680559) & 1141516237) | 463752220) + ((1199680559 & 1150952403) | 43369530)) - 1260832081) ^ (1435001171 % 1047196295);
        int i7 = (((((~1456339643) & 675645608) | 1411114002) + ((1456339643 & 693897896) | 1427718916)) - (-1019776501)) ^ (1561812722 % 1322623287);
        int i8 = (((((~1978701535) & 466139520) | 1762924265) + ((1978701535 & 315141952) | 1765037774)) - (-506179056)) ^ (1934660183 % 1880346039);
        int i9 = (((((~222028828) & 1142841824) | 166034459) + ((222028828 & 1142555104) | 723801104)) - 1805567702) ^ (829570037 % 301373537);
        int i10 = (((((~1396918184) & 1248054849) | 133905852) + ((1396918184 & 1770570357) | 870268086)) - 2138058592) ^ (1934392735 % 620089368);
        int i11 = (((((~1889804310) & 69748736) | 707083889) + ((1889804310 & 604795188) | 951435263)) - 1284100921) ^ (1663080928 % 610506582);
        int i12 = (((((~672139932) & 1821026947) | 1629321417) + ((672139932 & 214090242) | 828986457)) - (-2020274916)) ^ (1579068977 % 395191309);
        int i13 = (((((~99568484) & 3432473) | 44796710) + ((99568484 & 403994653) | 1028298918)) - 934561551) ^ (1076919591 % 234262547);
        q = new z7p1((((((~1759592334) & 1334334268) | 1043988652) + ((1759592334 & 1099191056) | 509413516)) - (-1669029722)) ^ (599529154 % 33713861));
        f43p = new z7p1((((((~1160063179) & 1841305796) | 575720514) + ((1160063179 & 1300254868) | 1886521)) - 1545499812) ^ (1060494695 % 728149010));
        o = new z7p1(i13);
        n = new z7p1(i4);
        m = new z7p1(i5);
        l = new z7p1(i6);
        k = new z7p1(i3);
        j = new z7p1(i7);
        i = new z7p1(i8);
        h = new z7p1(i9);
        g = new z7p1(i2);
        f = new z7p1(i10);
        e = new z7p1(i11);
        d = new z7p1(i12);
        c = new z7p1(1);
        b = new z7p1(0);
    }

    public /* synthetic */ z7p1(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ctn1 ctn1Var;
        nnn1 nnn1VarF;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.a) {
                                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                    return ((ejn1) obj).a();
                                case 1:
                                    try {
                                        jw91 jw91Var = ((ejn1) obj).a;
                                        long jM = jw91Var.f().m();
                                        nnn1 nnn1VarF2 = jw91Var.f();
                                        List listO = nnn1VarF2.o();
                                        if (jM < 0) {
                                            jM += (long) ((ArrayList) listO).size();
                                        }
                                        if (jM >= 0) {
                                            ArrayList arrayList = (ArrayList) listO;
                                            if (jM < arrayList.size()) {
                                                arrayList.remove((int) jM);
                                                jw91Var.e(nnn1VarF2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new zzap();
                                    } catch (zzap unused) {
                                        ctn1Var = ctn1.j1;
                                    }
                                    break;
                                case 2:
                                    ejn1 ejn1Var = (ejn1) obj;
                                    jw91 jw91Var2 = ejn1Var.a;
                                    nnn1 nnn1VarF3 = jw91Var2.f();
                                    tdp1 tdp1VarN = jw91Var2.f().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    nnn1VarF3.k(byteArrayOutputStream);
                                    ejn1Var.a.e(nnn1.d(tdp1VarN.d(tdp1.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    ejn1 ejn1Var2 = (ejn1) obj;
                                    jw91 jw91Var3 = ejn1Var2.a;
                                    nnn1 nnn1VarF4 = jw91Var3.f();
                                    tdp1 tdp1VarN2 = jw91Var3.f().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    ccm1.b(nnn1VarF4.m(), new yrg0(byteArrayOutputStream2, (byte) 26), false);
                                    ejn1Var2.a.e(nnn1.d(tdp1VarN2.d(tdp1.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    ejn1 ejn1Var3 = (ejn1) obj;
                                    b8p1 b8p1Var = ejn1Var3.c;
                                    jw91 jw91Var4 = ejn1Var3.a;
                                    ((ArrayList) jw91Var4.c).set(jw91Var4.d(-(ejn1Var3.b.b().b + b8p1Var.J())), jw91Var4.f());
                                    return Optional.empty();
                                case 5:
                                    jw91 jw91Var5 = ((ejn1) obj).a;
                                    jw91Var5.e(nnn1.b(jw91Var5.f().m() << ((int) jw91Var5.f().m())));
                                    return Optional.empty();
                                case 6:
                                    jw91 jw91Var6 = ((ejn1) obj).a;
                                    jw91Var6.e(nnn1.b(jw91Var6.f().m() >>> ((int) jw91Var6.f().m())));
                                    return Optional.empty();
                                case 7:
                                    jw91 jw91Var7 = ((ejn1) obj).a;
                                    jw91Var7.e(nnn1.c(jw91Var7.f().q() - jw91Var7.f().q()));
                                    return Optional.empty();
                                case 8:
                                    jw91 jw91Var8 = ((ejn1) obj).a;
                                    jw91Var8.e(nnn1.b(jw91Var8.f().m() - jw91Var8.f().m()));
                                    return Optional.empty();
                                case 9:
                                    ejn1 ejn1Var4 = (ejn1) obj;
                                    jw91 jw91Var9 = ejn1Var4.a;
                                    long jM2 = jw91Var9.f().m();
                                    nnn1 nnn1VarF5 = jw91Var9.f();
                                    jw91 jw91Var10 = ejn1Var4.a;
                                    nnn1 nnn1VarG = jw91Var10.g(jM2);
                                    ((ArrayList) jw91Var10.c).set(jw91Var10.d(jM2), nnn1VarF5);
                                    jw91Var10.e(nnn1VarG);
                                    return Optional.empty();
                                case 10:
                                    ejn1 ejn1Var5 = (ejn1) obj;
                                    jw91 jw91Var11 = ejn1Var5.a;
                                    long jM3 = ejn1Var5.b.b().b + jw91Var11.f().m();
                                    nnn1 nnn1VarF6 = jw91Var11.f();
                                    jw91 jw91Var12 = ejn1Var5.a;
                                    long j2 = -jM3;
                                    nnn1 nnn1VarG2 = jw91Var12.g(j2);
                                    ((ArrayList) jw91Var12.c).set(jw91Var12.d(j2), nnn1VarF6);
                                    jw91Var12.e(nnn1VarG2);
                                    return Optional.empty();
                                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                                    ejn1 ejn1Var6 = (ejn1) obj;
                                    b8p1 b8p1Var2 = ejn1Var6.c;
                                    jw91 jw91Var13 = ejn1Var6.a;
                                    long J = ejn1Var6.b.b().b + b8p1Var2.J();
                                    nnn1 nnn1VarF7 = jw91Var13.f();
                                    long j3 = -J;
                                    nnn1 nnn1VarG3 = jw91Var13.g(j3);
                                    ((ArrayList) jw91Var13.c).set(jw91Var13.d(j3), nnn1VarF7);
                                    jw91Var13.e(nnn1VarG3);
                                    return Optional.empty();
                                case grn1.d /* 12 */:
                                    ejn1 ejn1Var7 = (ejn1) obj;
                                    long jM4 = ejn1Var7.a.f().m();
                                    try {
                                        jw91 jw91Var14 = ejn1Var7.a;
                                        if (jM4 == 0) {
                                            nnn1VarF = jw91Var14.f();
                                        } else {
                                            int iD = jw91Var14.d(jM4);
                                            jw91Var14.b--;
                                            nnn1VarF = (nnn1) ((ArrayList) jw91Var14.c).remove(iD);
                                        }
                                        jw91Var14.e(nnn1VarF);
                                        return Optional.empty();
                                    } catch (zzag unused2) {
                                        ctn1Var = ctn1.h;
                                    }
                                    break;
                                case 13:
                                    ejn1 ejn1Var8 = (ejn1) obj;
                                    try {
                                        jw91 jw91Var15 = ejn1Var8.a;
                                        long jM5 = jw91Var15.f().m();
                                        long jM6 = jw91Var15.f().m();
                                        h0n1 h0n1Var = ejn1Var8.b;
                                        b8p1 b8p1Var3 = ejn1Var8.c;
                                        h0n1Var.a(b8p1Var3.D(), jM6, h0n1Var.b().b);
                                        b8p1Var3.C(jM5);
                                        return Optional.empty();
                                    } catch (zzad unused3) {
                                        ctn1Var = ctn1.c1;
                                    } catch (zzae unused4) {
                                        ctn1Var = ctn1.X0;
                                    } catch (zzy | zzz unused5) {
                                        ctn1Var = ctn1.S0;
                                    }
                                    break;
                                case 14:
                                    ejn1 ejn1Var9 = (ejn1) obj;
                                    try {
                                        ejn1Var9.a.e(nnn1.g(ejn1Var9.a.f().l()));
                                        return Optional.empty();
                                    } catch (zzao unused6) {
                                        ctn1Var = ctn1.Q0;
                                    }
                                    break;
                                default:
                                    try {
                                        jw91 jw91Var16 = ((ejn1) obj).a;
                                        Iterator it = ((ArrayList) jw91Var16.f().o()).iterator();
                                        while (it.hasNext()) {
                                            jw91Var16.e((nnn1) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzah unused7) {
                                        ctn1Var = ctn1.b;
                                    }
                                    break;
                            }
                        } catch (zzag | zzae unused8) {
                            ctn1Var = ctn1.Y0;
                        }
                    } catch (zzag unused9) {
                        ctn1Var = ctn1.i;
                    }
                } catch (zzao | zzx | zzz unused10) {
                    ctn1Var = ctn1.Z0;
                }
            } catch (zzah e2) {
                e = e2;
                throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzao unused11) {
            ctn1Var = ctn1.Y;
        } catch (IOException e3) {
            e = e3;
            throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(ctn1Var);
    }
}
