package p;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Debug;
import android.os.RemoteException;
import android.os.UserManager;
import android.provider.Settings;
import android.security.advancedprotection.AdvancedProtectionManager;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.ravelin.core.model.BiometricProperties;
import com.ravelin.core.model.CarrierInfo;
import com.ravelin.core.model.Connectivity;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.DeviceInfo;
import com.ravelin.core.model.DeviceProperties;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.Fingerprint;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.NetworkInfo;
import com.ravelin.core.model.Permissions;
import com.ravelin.core.model.ScreenInfo;
import com.ravelin.core.model.TimezoneInfo;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.ZipFile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zug implements u6n1, xug {
    public static final String i;
    public final Application a;
    public final o9b0 b;
    public final e7n1 c;
    public final sug d;
    public final b7n1 e;
    public final t6n1 f;
    public final v6n1 g;
    public final xug h;

    static {
        String canonicalName = Fingerprint.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "Fingerprint";
        }
        i = canonicalName;
    }

    public zug(Application application, o9b0 o9b0Var, e7n1 e7n1Var, ydp0 ydp0Var, sug sugVar, b7n1 b7n1Var, t6n1 t6n1Var, v6n1 v6n1Var, xug xugVar) {
        this.a = application;
        this.b = o9b0Var;
        this.c = e7n1Var;
        this.d = sugVar;
        this.e = b7n1Var;
        this.f = t6n1Var;
        this.g = v6n1Var;
        this.h = xugVar;
    }

    public static String p(TelephonyManager telephonyManager) {
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType == 0) {
            return "NONE";
        }
        if (phoneType == 1) {
            return "GSM";
        }
        if (phoneType != 2) {
            return phoneType != 3 ? "UNKNOWN" : "SIP";
        }
        return "CDMA";
    }

    public static String q(sug sugVar, Application application, TelephonyManager telephonyManager) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if (((x6n1) sugVar).a(application, "android.hardware.telephony.subscription")) {
                return String.valueOf(telephonyManager.getSimCarrierId());
            }
            return null;
        }
        if (28 > i2 || i2 >= 33) {
            return null;
        }
        return String.valueOf(telephonyManager.getSimCarrierId());
    }

    public final Float a() {
        return this.h.a();
    }

    public final Float b() {
        return this.h.b();
    }

    public final String c() {
        return this.h.c();
    }

    public final Float d() {
        return this.h.d();
    }

    public final Integer f() {
        return this.h.f();
    }

    public final String g(sug sugVar, TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 33) {
            return telephonyManager.getNetworkCountryIso();
        }
        if (((x6n1) sugVar).a(this.a, "android.hardware.telephony.radio.access")) {
            return telephonyManager.getNetworkCountryIso();
        }
        return null;
    }

    public final String h(sug sugVar, TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 33) {
            return telephonyManager.getNetworkOperatorName();
        }
        if (((x6n1) sugVar).a(this.a, "android.hardware.telephony.radio.access")) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    public final Boolean i(TelephonyManager telephonyManager) {
        x6n1 x6n1Var = (x6n1) this.d;
        Application application = this.a;
        if (!x6n1Var.a(application, "android.hardware.telephony")) {
            return null;
        }
        if (x74.j(application, "android.permission.READ_PHONE_STATE") != 0 && (Build.VERSION.SDK_INT < 33 || x74.j(application, "android.permission.READ_BASIC_PHONE_STATE") != 0)) {
            return null;
        }
        return Boolean.valueOf(telephonyManager.isWorldPhone());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j(long j, onm onmVar) {
        kug kugVar;
        if (onmVar instanceof kug) {
            kugVar = (kug) onmVar;
            int i2 = kugVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kugVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kugVar = new kug(this, onmVar);
            }
        } else {
            kugVar = new kug(this, onmVar);
        }
        Object objM = kugVar.a;
        int i3 = kugVar.c;
        try {
            if (i3 == 0) {
                hm5.M(objM);
                mx mxVar = new mx(this, (lnm) null, (byte) 7);
                kugVar.c = 1;
                objM = rc2.M(j, mxVar, kugVar);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objM);
            }
            return (Connectivity) objM;
        } catch (Exception e) {
            this.b.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(301, "Connectivity", "A connectivity error occurred while trying to read the device network transport type", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
            return new Connectivity((String) null, (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    public final String k(Application application, TelephonyManager telephonyManager) {
        int i2 = Build.VERSION.SDK_INT;
        Integer numValueOf = null;
        if (i2 >= 33) {
            if (((x6n1) this.d).a(application, "android.hardware.telephony.radio.access") && (x74.j(application, "android.permission.READ_PHONE_STATE") == 0 || (i2 >= 33 && x74.j(application, "android.permission.READ_BASIC_PHONE_STATE") == 0))) {
                numValueOf = Integer.valueOf(telephonyManager.getDataNetworkType());
            }
        } else if (30 > i2 || i2 >= 33) {
            numValueOf = Integer.valueOf(telephonyManager.getNetworkType());
        } else if (x74.j(application, "android.permission.READ_PHONE_STATE") == 0) {
            numValueOf = Integer.valueOf(telephonyManager.getDataNetworkType());
        }
        if (numValueOf != null && numValueOf.intValue() == 7) {
            return "1xRTT";
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return "CDMA";
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return "EDGE";
        }
        if (numValueOf != null && numValueOf.intValue() == 14) {
            return "EHRPD";
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            return "EVDO revision 0";
        }
        if (numValueOf != null && numValueOf.intValue() == 6) {
            return "EVDO revision A";
        }
        if (numValueOf != null && numValueOf.intValue() == 12) {
            return "EVDO revision B";
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return "GPRS";
        }
        if (numValueOf != null && numValueOf.intValue() == 16) {
            return "GSM";
        }
        if (numValueOf != null && numValueOf.intValue() == 8) {
            return "HSDPA";
        }
        if (numValueOf != null && numValueOf.intValue() == 10) {
            return "HSPA";
        }
        if (numValueOf != null && numValueOf.intValue() == 15) {
            return "HSPA+";
        }
        if (numValueOf != null && numValueOf.intValue() == 9) {
            return "HSUPA";
        }
        if (numValueOf != null && numValueOf.intValue() == 11) {
            return "iDen";
        }
        if (numValueOf != null && numValueOf.intValue() == 18) {
            return "IWLAN";
        }
        if (numValueOf != null && numValueOf.intValue() == 13) {
            return "LTE";
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return "UMTS";
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return "UNKNOWN";
        }
        if (numValueOf != null && numValueOf.intValue() == 20) {
            return "NR";
        }
        return (numValueOf != null && numValueOf.intValue() == 17) ? "TD_SCDMA" : "UNKNOWN";
    }

    public final String l(sug sugVar, TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 33) {
            return telephonyManager.getNetworkOperator();
        }
        if (((x6n1) sugVar).a(this.a, "android.hardware.telephony.radio.access")) {
            return telephonyManager.getNetworkOperator();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(long j, onm onmVar) {
        jug jugVar;
        if (onmVar instanceof jug) {
            jugVar = (jug) onmVar;
            int i2 = jugVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jugVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jugVar = new jug(this, onmVar);
            }
        } else {
            jugVar = new jug(this, onmVar);
        }
        Object objJ = jugVar.b;
        int i3 = jugVar.d;
        String string = null;
        if (i3 == 0) {
            hm5.M(objJ);
            jugVar.a = this;
            jugVar.d = 1;
            objJ = j(j, jugVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = jugVar.a;
            hm5.M(objJ);
        }
        Connectivity connectivity = (Connectivity) objJ;
        this.getClass();
        try {
            string = Settings.Global.getString(this.a.getContentResolver(), "http_proxy");
        } catch (Exception unused) {
        }
        connectivity.lpt2(string);
        return connectivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(sug sugVar, onm onmVar) {
        qug qugVar;
        if (onmVar instanceof qug) {
            qugVar = (qug) onmVar;
            int i2 = qugVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qugVar.c = i2 - Integer.MIN_VALUE;
            } else {
                qugVar = new qug(this, onmVar);
            }
        } else {
            qugVar = new qug(this, onmVar);
        }
        Object objR = qugVar.a;
        int i3 = qugVar.c;
        if (i3 == 0) {
            hm5.M(objR);
            ((x6n1) sugVar).getClass();
            if (x74.j(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                b7n1 b7n1Var = this.e;
                qugVar.c = 1;
                ohd ohdVar = new ohd(1, aym.t(qugVar));
                ohdVar.t();
                boolean z = ohdVar.s() instanceof ago0;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (!z) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    try {
                        Context context = b7n1Var.a;
                        int i4 = sne0.a;
                        o9n1 o9n1Var = new o9n1(context, (Activity) null, o9n1.o, mh5.k, jz40.c);
                        asd1 asd1VarB = asd1.b();
                        asd1VarB.d = oen1.d;
                        asd1VarB.c = (char) 2414;
                        hfp1 hfp1VarE = o9n1Var.e(0, asd1VarB.a());
                        hfp1VarE.n(new y1t0((Object) new gla0((Object) ohdVar, (byte) 3), (byte) 20));
                        hfp1VarE.a(dsd1.a, new yrg0(ohdVar, (byte) 23));
                        hfp1VarE.m(new utw0(ohdVar));
                    } catch (Exception e) {
                        String str = b7n1.b;
                        String strI = ktd.i("Error getting last location: ", e);
                        utw0 utw0Var = ike1.a;
                        utw0Var.y(str);
                        utw0Var.o(strI, new Object[0]);
                        ohdVar.resumeWith(null);
                    }
                }
                objR = ohdVar.r();
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objR);
        Location location = (Location) objR;
        if (location != null) {
            return new com.ravelin.core.model.Location(location);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x033f A[ADDED_TO_REGION, Catch: SecurityException -> 0x033b, RemoteException -> 0x033d, REMOVE, TRY_LEAVE, TryCatch #34 {RemoteException -> 0x033d, SecurityException -> 0x033b, blocks: (B:93:0x0329, B:95:0x0333, B:102:0x033f), top: B:447:0x0327 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:171:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:174:0x0582  */
    /* JADX WARN: Code duplicated, block: B:175:0x0584 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:224:0x0687  */
    /* JADX WARN: Code duplicated, block: B:233:0x06de  */
    /* JADX WARN: Code duplicated, block: B:235:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:237:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:239:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:241:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:246:0x0704  */
    /* JADX WARN: Code duplicated, block: B:249:0x070d  */
    /* JADX WARN: Code duplicated, block: B:250:0x0710  */
    /* JADX WARN: Code duplicated, block: B:253:0x0719  */
    /* JADX WARN: Code duplicated, block: B:254:0x071c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0725  */
    /* JADX WARN: Code duplicated, block: B:258:0x0728  */
    /* JADX WARN: Code duplicated, block: B:333:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:334:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:337:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:338:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:340:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:344:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:345:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:349:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:350:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:354:0x091a A[Catch: Exception -> 0x0922, TRY_LEAVE, TryCatch #25 {Exception -> 0x0922, blocks: (B:352:0x090c, B:354:0x091a), top: B:417:0x090c }] */
    /* JADX WARN: Code duplicated, block: B:357:0x0922  */
    /* JADX WARN: Code duplicated, block: B:360:0x0930  */
    /* JADX WARN: Code duplicated, block: B:366:0x0946  */
    /* JADX WARN: Code duplicated, block: B:372:0x095c  */
    /* JADX WARN: Code duplicated, block: B:379:0x0976  */
    /* JADX WARN: Code duplicated, block: B:380:0x0978  */
    /* JADX WARN: Code duplicated, block: B:382:0x097b  */
    /* JADX WARN: Code duplicated, block: B:392:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:399:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:403:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:439:0x0304 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x03f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x017f  */
    /* JADX WARN: Code duplicated, block: B:78:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0312 A[Catch: SecurityException -> 0x035c, RemoteException -> 0x0360, TRY_ENTER, TryCatch #46 {RemoteException -> 0x0360, SecurityException -> 0x035c, blocks: (B:84:0x030c, B:87:0x0312, B:89:0x031c, B:91:0x0323), top: B:436:0x030c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0323 A[ADDED_TO_REGION, Catch: SecurityException -> 0x035c, RemoteException -> 0x0360, REMOVE, TRY_LEAVE, TryCatch #46 {RemoteException -> 0x0360, SecurityException -> 0x035c, blocks: (B:84:0x030c, B:87:0x0312, B:89:0x031c, B:91:0x0323), top: B:436:0x030c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0329 A[Catch: SecurityException -> 0x033b, RemoteException -> 0x033d, TRY_ENTER, TryCatch #34 {RemoteException -> 0x033d, SecurityException -> 0x033b, blocks: (B:93:0x0329, B:95:0x0333, B:102:0x033f), top: B:447:0x0327 }] */
    /* JADX WARN: Type inference failed for: r0v138, types: [int, short] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int, short] */
    public final Object o(cnr cnrVar, boolean z, long j, onm onmVar) {
        iug iugVar;
        Boolean bool;
        boolean z2;
        Fingerprint fingerprint;
        sug sugVar;
        boolean z3;
        long j2;
        int i2;
        com.ravelin.core.model.Location location;
        int i3;
        int i4;
        cnr cnrVar2;
        boolean z4;
        Fingerprint fingerprint2;
        zug zugVar;
        Fingerprint fingerprint3;
        Object objN;
        Fingerprint fingerprint4;
        Fingerprint fingerprint5;
        int i5;
        int i6;
        r7n1 r7n1Var;
        sug sugVar2;
        Application application;
        TimeZone timeZone;
        int i7;
        String str;
        String id;
        boolean z5;
        String displayName;
        long j3;
        Integer numValueOf;
        Integer numValueOf2;
        TelephonyManager telephonyManager;
        String strR;
        String strQ;
        String str2;
        String simCountryIso;
        String str3;
        String str4;
        String str5;
        String str6;
        int i8;
        String simOperator;
        Boolean boolI;
        String strG;
        String strP;
        String strL;
        String strH;
        String str7;
        String str8;
        String str9;
        String str10;
        String strK;
        String strCON;
        xug xugVar;
        p7n1 p7n1Var;
        String str11;
        boolean z6;
        boolean z7;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        String strA;
        String str12;
        String str13;
        Boolean bool2;
        cnr cnrVar3;
        Fingerprint fingerprint6;
        iug iugVar2;
        TelephonyManager telephonyManager2;
        Fingerprint fingerprint7;
        boolean z8;
        int i9;
        boolean zCanRequestPackageInstalls;
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        String string;
        Boolean boolValueOf4;
        boolean zJ;
        Fingerprint fingerprint8;
        Fingerprint fingerprint9;
        zug zugVar2;
        Fingerprint fingerprint10;
        Fingerprint fingerprint11;
        PackageManager packageManager;
        PackageManager packageManager2;
        PackageManager packageManager3;
        int i11;
        int iHashCode;
        zug zugVar3 = this;
        cnr cnrVar4 = cnrVar;
        if (onmVar instanceof iug) {
            iugVar = (iug) onmVar;
            int i12 = iugVar.P0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iugVar.P0 = i12 - Integer.MIN_VALUE;
            } else {
                iugVar = new iug(zugVar3, onmVar);
            }
        } else {
            iugVar = new iug(zugVar3, onmVar);
        }
        Object objM = iugVar.N0;
        int i13 = iugVar.P0;
        d9n d9nVar = d9n.a;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                if (i13 != 0) {
                                    if (i13 == 1) {
                                        int i14 = iugVar.Z;
                                        boolean z12 = iugVar.i;
                                        int i15 = iugVar.Y;
                                        int i16 = iugVar.X;
                                        j2 = iugVar.t;
                                        z3 = iugVar.h;
                                        Fingerprint fingerprint12 = (Fingerprint) iugVar.f;
                                        sugVar = iugVar.e;
                                        fingerprint5 = iugVar.d;
                                        Fingerprint fingerprint13 = iugVar.c;
                                        zug zugVar4 = iugVar.b;
                                        cnr cnrVar5 = iugVar.a;
                                        hm5.M(objM);
                                        i5 = i14;
                                        zugVar3 = zugVar4;
                                        objN = objM;
                                        z2 = z12;
                                        cnrVar4 = cnrVar5;
                                        fingerprint4 = fingerprint12;
                                        fingerprint = fingerprint13;
                                        i2 = i16;
                                        i6 = i15;
                                    } else {
                                        if (i13 != 2) {
                                            eg.m("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        fingerprint10 = iugVar.g;
                                        fingerprint11 = iugVar.d;
                                        fingerprint9 = iugVar.c;
                                        zugVar2 = iugVar.b;
                                        hm5.M(objM);
                                    }
                                    fingerprint10.lpt2((Connectivity) objM);
                                    fingerprint11.lpt2(Permissions.Companion.lpt2(zugVar2.a));
                                    return fingerprint9;
                                }
                                hm5.M(objM);
                                if (cnrVar4 != null) {
                                    Object objB = cnrVar4.b("location group", "user location collection enabled");
                                    if (!(objB instanceof Boolean)) {
                                        objB = null;
                                    }
                                    bool = (Boolean) objB;
                                } else {
                                    bool = null;
                                }
                                z2 = !u890.j(bool, Boolean.FALSE);
                                fingerprint = new Fingerprint(false, (CarrierInfo) null, (NetworkInfo) null, (Connectivity) null, (ScreenInfo) null, (DeviceInfo) null, (TimezoneInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (com.ravelin.core.model.Location) null, (DeviceProperties) null, (Permissions) null, 131071, (DefaultConstructorMarker) null);
                                fingerprint.lpt2(z);
                                sugVar = zugVar3.d;
                                if (z2) {
                                    iugVar.a = cnrVar4;
                                    iugVar.b = zugVar3;
                                    iugVar.c = fingerprint;
                                    iugVar.d = fingerprint;
                                    iugVar.e = sugVar;
                                    iugVar.f = fingerprint;
                                    iugVar.h = z;
                                    iugVar.t = (int) j;
                                    iugVar.X = 0;
                                    iugVar.Y = 0;
                                    iugVar.i = z2;
                                    iugVar.Z = 0;
                                    iugVar.P0 = 1;
                                    objN = zugVar3.n(sugVar, iugVar);
                                    if (objN == d9nVar) {
                                        return d9nVar;
                                    }
                                    z3 = z;
                                    j2 = j;
                                    fingerprint4 = fingerprint;
                                    fingerprint5 = fingerprint4;
                                    i5 = 0;
                                    i6 = 0;
                                    i2 = 0;
                                } else {
                                    z3 = z;
                                    j2 = j;
                                    i2 = 0;
                                    location = null;
                                    i3 = 0;
                                    i4 = 0;
                                    cnrVar2 = cnrVar4;
                                    z4 = z2;
                                    fingerprint2 = fingerprint;
                                    zugVar = zugVar3;
                                    fingerprint3 = fingerprint2;
                                }
                                fingerprint3.lpt2(location);
                                r7n1Var = zugVar.b;
                                sugVar2 = zugVar.d;
                                application = zugVar.a;
                                timeZone = TimeZone.getDefault();
                                i7 = i4;
                                str = i;
                                if (timeZone != null) {
                                    try {
                                        id = timeZone.getID();
                                    } catch (AssertionError e) {
                                        e = e;
                                        z5 = z4;
                                        String strM = l1d.m("Error while discovering timeZone with: ", e.getLocalizedMessage());
                                        AssertionError assertionError = e;
                                        utw0 utw0Var = ike1.a;
                                        utw0Var.y(str);
                                        utw0Var.o(strM, new Object[0]);
                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", assertionError.getMessage(), new ErrorMetadata(604, "JVM", "An assertion failed", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                        displayName = null;
                                        j3 = j2;
                                        long rawOffset = new GregorianCalendar().getTimeZone().getRawOffset();
                                        numValueOf = Integer.valueOf((int) (rawOffset / 3600000));
                                        numValueOf2 = Integer.valueOf((int) (rawOffset / 60000));
                                        fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                        if (((x6n1) sugVar2).a(application, "android.hardware.telephony")) {
                                            telephonyManager = (TelephonyManager) application.getApplicationContext().getSystemService("phone");
                                        } else {
                                            telephonyManager = null;
                                        }
                                        if (telephonyManager != null) {
                                            try {
                                                strR = zugVar.r(sugVar, telephonyManager);
                                                try {
                                                    strQ = q(sugVar, application, telephonyManager);
                                                    try {
                                                        i8 = Build.VERSION.SDK_INT;
                                                        if (i8 < 33) {
                                                            simCountryIso = telephonyManager.getSimCountryIso();
                                                        }
                                                        try {
                                                            if (i8 >= 33) {
                                                                simOperator = telephonyManager.getSimOperator();
                                                            } else {
                                                                simOperator = telephonyManager.getSimOperator();
                                                            }
                                                            str2 = simOperator;
                                                            try {
                                                                boolI = zugVar.i(telephonyManager);
                                                                str3 = strR;
                                                                str4 = strQ;
                                                                str5 = str2;
                                                                str6 = simCountryIso;
                                                            } catch (RemoteException e2) {
                                                                e = e2;
                                                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                str3 = strR;
                                                                str4 = strQ;
                                                                str5 = str2;
                                                                str6 = simCountryIso;
                                                                boolI = null;
                                                            } catch (SecurityException e3) {
                                                                e = e3;
                                                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                str3 = strR;
                                                                str4 = strQ;
                                                                str5 = str2;
                                                                str6 = simCountryIso;
                                                                boolI = null;
                                                            }
                                                        } catch (RemoteException e4) {
                                                            e = e4;
                                                            str2 = null;
                                                        } catch (SecurityException e5) {
                                                            e = e5;
                                                            str2 = null;
                                                        }
                                                    } catch (RemoteException e6) {
                                                        e = e6;
                                                        str2 = null;
                                                        simCountryIso = null;
                                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                        str3 = strR;
                                                        str4 = strQ;
                                                        str5 = str2;
                                                        str6 = simCountryIso;
                                                        boolI = null;
                                                        fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                                        if (telephonyManager != null) {
                                                            try {
                                                                strG = zugVar.g(sugVar, telephonyManager);
                                                                try {
                                                                    strP = p(telephonyManager);
                                                                    try {
                                                                        strL = zugVar.l(sugVar, telephonyManager);
                                                                        try {
                                                                            strH = zugVar.h(sugVar, telephonyManager);
                                                                            try {
                                                                                strK = zugVar.k(application, telephonyManager);
                                                                                str7 = strG;
                                                                                str8 = strP;
                                                                                str9 = strL;
                                                                                str10 = strH;
                                                                            } catch (RemoteException e7) {
                                                                                e = e7;
                                                                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                str7 = strG;
                                                                                str8 = strP;
                                                                                str9 = strL;
                                                                                str10 = strH;
                                                                                strK = null;
                                                                            } catch (SecurityException e8) {
                                                                                e = e8;
                                                                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                str7 = strG;
                                                                                str8 = strP;
                                                                                str9 = strL;
                                                                                str10 = strH;
                                                                                strK = null;
                                                                            } catch (UnsupportedOperationException e9) {
                                                                                e = e9;
                                                                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(202, "Telephony", "A telephony UnsupportedOperation error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                                str7 = strG;
                                                                                str8 = strP;
                                                                                str9 = strL;
                                                                                str10 = strH;
                                                                                strK = null;
                                                                            }
                                                                        } catch (RemoteException e10) {
                                                                            e = e10;
                                                                            strH = null;
                                                                            r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                            str7 = strG;
                                                                            str8 = strP;
                                                                            str9 = strL;
                                                                            str10 = strH;
                                                                            strK = null;
                                                                            fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                            DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
                                                                            fingerprint.lpt2(new ScreenInfo(displayMetrics.densityDpi, displayMetrics.heightPixels, displayMetrics.widthPixels));
                                                                            DeviceId.CoM4 coM4 = DeviceId.Companion;
                                                                            fingerprint.lpt2(new DeviceInfo(coM4.Lpt5().COM7(), coM4.Lpt5().cOM4(), coM4.Lpt5().COM5(), coM4.Lpt5().COM6(), coM4.Lpt5().Lpt5(), coM4.Lpt5().prN()));
                                                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                            fingerprint.lpt2(application.getPackageName());
                                                                            strCON = coM4.Lpt5().cON();
                                                                            if (u890.j(strCON, application.getPackageName())) {
                                                                                strCON = "self provider";
                                                                            } else {
                                                                                strCON = "self provider";
                                                                            }
                                                                            fingerprint.COM7(strCON);
                                                                            String str14 = Build.MANUFACTURER;
                                                                            fingerprint.cON(str14);
                                                                            String str15 = Build.MODEL;
                                                                            fingerprint.LPT3(str15);
                                                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                            xugVar = zugVar.h;
                                                                            p7n1Var = zugVar.c;
                                                                            str11 = Build.FINGERPRINT;
                                                                            if (!nhc1.Y(str11, "generic", false)) {
                                                                                z6 = z3;
                                                                                z7 = true;
                                                                            } else {
                                                                                z6 = z3;
                                                                                z7 = true;
                                                                            }
                                                                            String str16 = p7n1.c;
                                                                            utw0 utw0Var2 = ike1.a;
                                                                            utw0Var2.y(str16);
                                                                            utw0Var2.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                            boolValueOf = Boolean.valueOf(z7);
                                                                            boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                            strA = p7n1.a(application);
                                                                            if (strA == null) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                iHashCode = strA.hashCode();
                                                                                if (iHashCode != -1859733809) {
                                                                                    if (iHashCode != -1637701853) {
                                                                                        if (iHashCode != -1225090538) {
                                                                                            if (iHashCode == -1046965711) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "non valid source";
                                                                                            }
                                                                                        } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                            str12 = "Samsung Galaxy Store";
                                                                                        } else {
                                                                                            str12 = "non valid source";
                                                                                        }
                                                                                    } else if (strA.equals("com.huawei.appmarket")) {
                                                                                        str12 = "Huawei App Gallery";
                                                                                    } else {
                                                                                        str12 = "non valid source";
                                                                                    }
                                                                                } else if (strA.equals("com.amazon.venezia")) {
                                                                                    str12 = "Amazon Appstore";
                                                                                } else {
                                                                                    str12 = "non valid source";
                                                                                }
                                                                            }
                                                                            str13 = str12;
                                                                            bool2 = Boolean.TRUE;
                                                                            throw new Exception("Verifying use of hookup tools");
                                                                        } catch (SecurityException e11) {
                                                                            e = e11;
                                                                            strH = null;
                                                                            r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                            str7 = strG;
                                                                            str8 = strP;
                                                                            str9 = strL;
                                                                            str10 = strH;
                                                                            strK = null;
                                                                            fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                            DisplayMetrics displayMetrics2 = application.getResources().getDisplayMetrics();
                                                                            fingerprint.lpt2(new ScreenInfo(displayMetrics2.densityDpi, displayMetrics2.heightPixels, displayMetrics2.widthPixels));
                                                                            DeviceId.CoM4 coM5 = DeviceId.Companion;
                                                                            fingerprint.lpt2(new DeviceInfo(coM5.Lpt5().COM7(), coM5.Lpt5().cOM4(), coM5.Lpt5().COM5(), coM5.Lpt5().COM6(), coM5.Lpt5().Lpt5(), coM5.Lpt5().prN()));
                                                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                            fingerprint.lpt2(application.getPackageName());
                                                                            strCON = coM5.Lpt5().cON();
                                                                            if (u890.j(strCON, application.getPackageName())) {
                                                                                strCON = "self provider";
                                                                            } else {
                                                                                strCON = "self provider";
                                                                            }
                                                                            fingerprint.COM7(strCON);
                                                                            String str17 = Build.MANUFACTURER;
                                                                            fingerprint.cON(str17);
                                                                            String str18 = Build.MODEL;
                                                                            fingerprint.LPT3(str18);
                                                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                            xugVar = zugVar.h;
                                                                            p7n1Var = zugVar.c;
                                                                            str11 = Build.FINGERPRINT;
                                                                            if (!nhc1.Y(str11, "generic", false)) {
                                                                                z6 = z3;
                                                                                z7 = true;
                                                                            } else {
                                                                                z6 = z3;
                                                                                z7 = true;
                                                                            }
                                                                            String str19 = p7n1.c;
                                                                            utw0 utw0Var3 = ike1.a;
                                                                            utw0Var3.y(str19);
                                                                            utw0Var3.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                            boolValueOf = Boolean.valueOf(z7);
                                                                            boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                            strA = p7n1.a(application);
                                                                            if (strA == null) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                iHashCode = strA.hashCode();
                                                                                if (iHashCode != -1859733809) {
                                                                                    if (iHashCode != -1637701853) {
                                                                                        if (iHashCode != -1225090538) {
                                                                                            if (iHashCode == -1046965711) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "non valid source";
                                                                                            }
                                                                                        } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "Samsung Galaxy Store";
                                                                                        }
                                                                                    } else if (strA.equals("com.huawei.appmarket")) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "Huawei App Gallery";
                                                                                    }
                                                                                } else if (strA.equals("com.amazon.venezia")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Amazon Appstore";
                                                                                }
                                                                            }
                                                                            str13 = str12;
                                                                            bool2 = Boolean.TRUE;
                                                                            throw new Exception("Verifying use of hookup tools");
                                                                        } catch (UnsupportedOperationException e12) {
                                                                            e = e12;
                                                                            strH = null;
                                                                            r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(202, "Telephony", "A telephony UnsupportedOperation error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                            str7 = strG;
                                                                            str8 = strP;
                                                                            str9 = strL;
                                                                            str10 = strH;
                                                                            strK = null;
                                                                            fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                            DisplayMetrics displayMetrics3 = application.getResources().getDisplayMetrics();
                                                                            fingerprint.lpt2(new ScreenInfo(displayMetrics3.densityDpi, displayMetrics3.heightPixels, displayMetrics3.widthPixels));
                                                                            DeviceId.CoM4 coM6 = DeviceId.Companion;
                                                                            fingerprint.lpt2(new DeviceInfo(coM6.Lpt5().COM7(), coM6.Lpt5().cOM4(), coM6.Lpt5().COM5(), coM6.Lpt5().COM6(), coM6.Lpt5().Lpt5(), coM6.Lpt5().prN()));
                                                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                            fingerprint.lpt2(application.getPackageName());
                                                                            strCON = coM6.Lpt5().cON();
                                                                            if (u890.j(strCON, application.getPackageName())) {
                                                                                strCON = "self provider";
                                                                            } else {
                                                                                strCON = "self provider";
                                                                            }
                                                                            fingerprint.COM7(strCON);
                                                                            String str110 = Build.MANUFACTURER;
                                                                            fingerprint.cON(str110);
                                                                            String str111 = Build.MODEL;
                                                                            fingerprint.LPT3(str111);
                                                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                            xugVar = zugVar.h;
                                                                            p7n1Var = zugVar.c;
                                                                            str11 = Build.FINGERPRINT;
                                                                            if (!nhc1.Y(str11, "generic", false)) {
                                                                                z6 = z3;
                                                                                z7 = true;
                                                                            } else {
                                                                                z6 = z3;
                                                                                z7 = true;
                                                                            }
                                                                            String str112 = p7n1.c;
                                                                            utw0 utw0Var4 = ike1.a;
                                                                            utw0Var4.y(str112);
                                                                            utw0Var4.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                            boolValueOf = Boolean.valueOf(z7);
                                                                            boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                            strA = p7n1.a(application);
                                                                            if (strA == null) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                iHashCode = strA.hashCode();
                                                                                if (iHashCode != -1859733809) {
                                                                                    if (iHashCode != -1637701853) {
                                                                                        if (iHashCode != -1225090538) {
                                                                                            if (iHashCode == -1046965711) {
                                                                                                str12 = "non valid source";
                                                                                            } else {
                                                                                                str12 = "non valid source";
                                                                                            }
                                                                                        } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "Samsung Galaxy Store";
                                                                                        }
                                                                                    } else if (strA.equals("com.huawei.appmarket")) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "Huawei App Gallery";
                                                                                    }
                                                                                } else if (strA.equals("com.amazon.venezia")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Amazon Appstore";
                                                                                }
                                                                            }
                                                                            str13 = str12;
                                                                            bool2 = Boolean.TRUE;
                                                                            throw new Exception("Verifying use of hookup tools");
                                                                        }
                                                                    } catch (RemoteException e13) {
                                                                        e = e13;
                                                                        strL = null;
                                                                        strH = null;
                                                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                        str7 = strG;
                                                                        str8 = strP;
                                                                        str9 = strL;
                                                                        str10 = strH;
                                                                        strK = null;
                                                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                        DisplayMetrics displayMetrics4 = application.getResources().getDisplayMetrics();
                                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics4.densityDpi, displayMetrics4.heightPixels, displayMetrics4.widthPixels));
                                                                        DeviceId.CoM4 coM7 = DeviceId.Companion;
                                                                        fingerprint.lpt2(new DeviceInfo(coM7.Lpt5().COM7(), coM7.Lpt5().cOM4(), coM7.Lpt5().COM5(), coM7.Lpt5().COM6(), coM7.Lpt5().Lpt5(), coM7.Lpt5().prN()));
                                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                        fingerprint.lpt2(application.getPackageName());
                                                                        strCON = coM7.Lpt5().cON();
                                                                        if (u890.j(strCON, application.getPackageName())) {
                                                                            strCON = "self provider";
                                                                        } else {
                                                                            strCON = "self provider";
                                                                        }
                                                                        fingerprint.COM7(strCON);
                                                                        String str113 = Build.MANUFACTURER;
                                                                        fingerprint.cON(str113);
                                                                        String str114 = Build.MODEL;
                                                                        fingerprint.LPT3(str114);
                                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                        xugVar = zugVar.h;
                                                                        p7n1Var = zugVar.c;
                                                                        str11 = Build.FINGERPRINT;
                                                                        if (!nhc1.Y(str11, "generic", false)) {
                                                                            z6 = z3;
                                                                            z7 = true;
                                                                        } else {
                                                                            z6 = z3;
                                                                            z7 = true;
                                                                        }
                                                                        String str115 = p7n1.c;
                                                                        utw0 utw0Var5 = ike1.a;
                                                                        utw0Var5.y(str115);
                                                                        utw0Var5.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                        boolValueOf = Boolean.valueOf(z7);
                                                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                        strA = p7n1.a(application);
                                                                        if (strA == null) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            iHashCode = strA.hashCode();
                                                                            if (iHashCode != -1859733809) {
                                                                                if (iHashCode != -1637701853) {
                                                                                    if (iHashCode != -1225090538) {
                                                                                        if (iHashCode == -1046965711) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "non valid source";
                                                                                        }
                                                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "Samsung Galaxy Store";
                                                                                    }
                                                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Huawei App Gallery";
                                                                                }
                                                                            } else if (strA.equals("com.amazon.venezia")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Amazon Appstore";
                                                                            }
                                                                        }
                                                                        str13 = str12;
                                                                        bool2 = Boolean.TRUE;
                                                                        throw new Exception("Verifying use of hookup tools");
                                                                    } catch (SecurityException e14) {
                                                                        e = e14;
                                                                        strL = null;
                                                                        strH = null;
                                                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                        str7 = strG;
                                                                        str8 = strP;
                                                                        str9 = strL;
                                                                        str10 = strH;
                                                                        strK = null;
                                                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                        DisplayMetrics displayMetrics5 = application.getResources().getDisplayMetrics();
                                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics5.densityDpi, displayMetrics5.heightPixels, displayMetrics5.widthPixels));
                                                                        DeviceId.CoM4 coM8 = DeviceId.Companion;
                                                                        fingerprint.lpt2(new DeviceInfo(coM8.Lpt5().COM7(), coM8.Lpt5().cOM4(), coM8.Lpt5().COM5(), coM8.Lpt5().COM6(), coM8.Lpt5().Lpt5(), coM8.Lpt5().prN()));
                                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                        fingerprint.lpt2(application.getPackageName());
                                                                        strCON = coM8.Lpt5().cON();
                                                                        if (u890.j(strCON, application.getPackageName())) {
                                                                            strCON = "self provider";
                                                                        } else {
                                                                            strCON = "self provider";
                                                                        }
                                                                        fingerprint.COM7(strCON);
                                                                        String str116 = Build.MANUFACTURER;
                                                                        fingerprint.cON(str116);
                                                                        String str117 = Build.MODEL;
                                                                        fingerprint.LPT3(str117);
                                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                        xugVar = zugVar.h;
                                                                        p7n1Var = zugVar.c;
                                                                        str11 = Build.FINGERPRINT;
                                                                        if (!nhc1.Y(str11, "generic", false)) {
                                                                            z6 = z3;
                                                                            z7 = true;
                                                                        } else {
                                                                            z6 = z3;
                                                                            z7 = true;
                                                                        }
                                                                        String str118 = p7n1.c;
                                                                        utw0 utw0Var6 = ike1.a;
                                                                        utw0Var6.y(str118);
                                                                        utw0Var6.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                        boolValueOf = Boolean.valueOf(z7);
                                                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                        strA = p7n1.a(application);
                                                                        if (strA == null) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            iHashCode = strA.hashCode();
                                                                            if (iHashCode != -1859733809) {
                                                                                if (iHashCode != -1637701853) {
                                                                                    if (iHashCode != -1225090538) {
                                                                                        if (iHashCode == -1046965711) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "non valid source";
                                                                                        }
                                                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "Samsung Galaxy Store";
                                                                                    }
                                                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Huawei App Gallery";
                                                                                }
                                                                            } else if (strA.equals("com.amazon.venezia")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Amazon Appstore";
                                                                            }
                                                                        }
                                                                        str13 = str12;
                                                                        bool2 = Boolean.TRUE;
                                                                        throw new Exception("Verifying use of hookup tools");
                                                                    } catch (UnsupportedOperationException e15) {
                                                                        e = e15;
                                                                        strL = null;
                                                                        strH = null;
                                                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(202, "Telephony", "A telephony UnsupportedOperation error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                        str7 = strG;
                                                                        str8 = strP;
                                                                        str9 = strL;
                                                                        str10 = strH;
                                                                        strK = null;
                                                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                        DisplayMetrics displayMetrics6 = application.getResources().getDisplayMetrics();
                                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics6.densityDpi, displayMetrics6.heightPixels, displayMetrics6.widthPixels));
                                                                        DeviceId.CoM4 coM9 = DeviceId.Companion;
                                                                        fingerprint.lpt2(new DeviceInfo(coM9.Lpt5().COM7(), coM9.Lpt5().cOM4(), coM9.Lpt5().COM5(), coM9.Lpt5().COM6(), coM9.Lpt5().Lpt5(), coM9.Lpt5().prN()));
                                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                        fingerprint.lpt2(application.getPackageName());
                                                                        strCON = coM9.Lpt5().cON();
                                                                        if (u890.j(strCON, application.getPackageName())) {
                                                                            strCON = "self provider";
                                                                        } else {
                                                                            strCON = "self provider";
                                                                        }
                                                                        fingerprint.COM7(strCON);
                                                                        String str119 = Build.MANUFACTURER;
                                                                        fingerprint.cON(str119);
                                                                        String str1110 = Build.MODEL;
                                                                        fingerprint.LPT3(str1110);
                                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                        xugVar = zugVar.h;
                                                                        p7n1Var = zugVar.c;
                                                                        str11 = Build.FINGERPRINT;
                                                                        if (!nhc1.Y(str11, "generic", false)) {
                                                                            z6 = z3;
                                                                            z7 = true;
                                                                        } else {
                                                                            z6 = z3;
                                                                            z7 = true;
                                                                        }
                                                                        String str1111 = p7n1.c;
                                                                        utw0 utw0Var7 = ike1.a;
                                                                        utw0Var7.y(str1111);
                                                                        utw0Var7.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                        boolValueOf = Boolean.valueOf(z7);
                                                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                        strA = p7n1.a(application);
                                                                        if (strA == null) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            iHashCode = strA.hashCode();
                                                                            if (iHashCode != -1859733809) {
                                                                                if (iHashCode != -1637701853) {
                                                                                    if (iHashCode != -1225090538) {
                                                                                        if (iHashCode == -1046965711) {
                                                                                            str12 = "non valid source";
                                                                                        } else {
                                                                                            str12 = "non valid source";
                                                                                        }
                                                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "Samsung Galaxy Store";
                                                                                    }
                                                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Huawei App Gallery";
                                                                                }
                                                                            } else if (strA.equals("com.amazon.venezia")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Amazon Appstore";
                                                                            }
                                                                        }
                                                                        str13 = str12;
                                                                        bool2 = Boolean.TRUE;
                                                                        throw new Exception("Verifying use of hookup tools");
                                                                    }
                                                                } catch (RemoteException e16) {
                                                                    e = e16;
                                                                    strP = null;
                                                                    strL = null;
                                                                    strH = null;
                                                                    r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                    str7 = strG;
                                                                    str8 = strP;
                                                                    str9 = strL;
                                                                    str10 = strH;
                                                                    strK = null;
                                                                    fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                    DisplayMetrics displayMetrics7 = application.getResources().getDisplayMetrics();
                                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics7.densityDpi, displayMetrics7.heightPixels, displayMetrics7.widthPixels));
                                                                    DeviceId.CoM4 coM10 = DeviceId.Companion;
                                                                    fingerprint.lpt2(new DeviceInfo(coM10.Lpt5().COM7(), coM10.Lpt5().cOM4(), coM10.Lpt5().COM5(), coM10.Lpt5().COM6(), coM10.Lpt5().Lpt5(), coM10.Lpt5().prN()));
                                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                    fingerprint.lpt2(application.getPackageName());
                                                                    strCON = coM10.Lpt5().cON();
                                                                    if (u890.j(strCON, application.getPackageName())) {
                                                                        strCON = "self provider";
                                                                    } else {
                                                                        strCON = "self provider";
                                                                    }
                                                                    fingerprint.COM7(strCON);
                                                                    String str1112 = Build.MANUFACTURER;
                                                                    fingerprint.cON(str1112);
                                                                    String str1113 = Build.MODEL;
                                                                    fingerprint.LPT3(str1113);
                                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                    xugVar = zugVar.h;
                                                                    p7n1Var = zugVar.c;
                                                                    str11 = Build.FINGERPRINT;
                                                                    if (!nhc1.Y(str11, "generic", false)) {
                                                                        z6 = z3;
                                                                        z7 = true;
                                                                    } else {
                                                                        z6 = z3;
                                                                        z7 = true;
                                                                    }
                                                                    String str1114 = p7n1.c;
                                                                    utw0 utw0Var8 = ike1.a;
                                                                    utw0Var8.y(str1114);
                                                                    utw0Var8.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                    boolValueOf = Boolean.valueOf(z7);
                                                                    boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                    strA = p7n1.a(application);
                                                                    if (strA == null) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        iHashCode = strA.hashCode();
                                                                        if (iHashCode != -1859733809) {
                                                                            if (iHashCode != -1637701853) {
                                                                                if (iHashCode != -1225090538) {
                                                                                    if (iHashCode == -1046965711) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "non valid source";
                                                                                    }
                                                                                } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Samsung Galaxy Store";
                                                                                }
                                                                            } else if (strA.equals("com.huawei.appmarket")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Huawei App Gallery";
                                                                            }
                                                                        } else if (strA.equals("com.amazon.venezia")) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "Amazon Appstore";
                                                                        }
                                                                    }
                                                                    str13 = str12;
                                                                    bool2 = Boolean.TRUE;
                                                                    throw new Exception("Verifying use of hookup tools");
                                                                } catch (SecurityException e17) {
                                                                    e = e17;
                                                                    strP = null;
                                                                    strL = null;
                                                                    strH = null;
                                                                    r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                    str7 = strG;
                                                                    str8 = strP;
                                                                    str9 = strL;
                                                                    str10 = strH;
                                                                    strK = null;
                                                                    fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                    DisplayMetrics displayMetrics8 = application.getResources().getDisplayMetrics();
                                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics8.densityDpi, displayMetrics8.heightPixels, displayMetrics8.widthPixels));
                                                                    DeviceId.CoM4 coM11 = DeviceId.Companion;
                                                                    fingerprint.lpt2(new DeviceInfo(coM11.Lpt5().COM7(), coM11.Lpt5().cOM4(), coM11.Lpt5().COM5(), coM11.Lpt5().COM6(), coM11.Lpt5().Lpt5(), coM11.Lpt5().prN()));
                                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                    fingerprint.lpt2(application.getPackageName());
                                                                    strCON = coM11.Lpt5().cON();
                                                                    if (u890.j(strCON, application.getPackageName())) {
                                                                        strCON = "self provider";
                                                                    } else {
                                                                        strCON = "self provider";
                                                                    }
                                                                    fingerprint.COM7(strCON);
                                                                    String str1115 = Build.MANUFACTURER;
                                                                    fingerprint.cON(str1115);
                                                                    String str1116 = Build.MODEL;
                                                                    fingerprint.LPT3(str1116);
                                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                    xugVar = zugVar.h;
                                                                    p7n1Var = zugVar.c;
                                                                    str11 = Build.FINGERPRINT;
                                                                    if (!nhc1.Y(str11, "generic", false)) {
                                                                        z6 = z3;
                                                                        z7 = true;
                                                                    } else {
                                                                        z6 = z3;
                                                                        z7 = true;
                                                                    }
                                                                    String str1117 = p7n1.c;
                                                                    utw0 utw0Var9 = ike1.a;
                                                                    utw0Var9.y(str1117);
                                                                    utw0Var9.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                    boolValueOf = Boolean.valueOf(z7);
                                                                    boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                    strA = p7n1.a(application);
                                                                    if (strA == null) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        iHashCode = strA.hashCode();
                                                                        if (iHashCode != -1859733809) {
                                                                            if (iHashCode != -1637701853) {
                                                                                if (iHashCode != -1225090538) {
                                                                                    if (iHashCode == -1046965711) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "non valid source";
                                                                                    }
                                                                                } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Samsung Galaxy Store";
                                                                                }
                                                                            } else if (strA.equals("com.huawei.appmarket")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Huawei App Gallery";
                                                                            }
                                                                        } else if (strA.equals("com.amazon.venezia")) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "Amazon Appstore";
                                                                        }
                                                                    }
                                                                    str13 = str12;
                                                                    bool2 = Boolean.TRUE;
                                                                    throw new Exception("Verifying use of hookup tools");
                                                                } catch (UnsupportedOperationException e18) {
                                                                    e = e18;
                                                                    strP = null;
                                                                    strL = null;
                                                                    strH = null;
                                                                    r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(202, "Telephony", "A telephony UnsupportedOperation error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                                    str7 = strG;
                                                                    str8 = strP;
                                                                    str9 = strL;
                                                                    str10 = strH;
                                                                    strK = null;
                                                                    fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                                    DisplayMetrics displayMetrics9 = application.getResources().getDisplayMetrics();
                                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics9.densityDpi, displayMetrics9.heightPixels, displayMetrics9.widthPixels));
                                                                    DeviceId.CoM4 coM12 = DeviceId.Companion;
                                                                    fingerprint.lpt2(new DeviceInfo(coM12.Lpt5().COM7(), coM12.Lpt5().cOM4(), coM12.Lpt5().COM5(), coM12.Lpt5().COM6(), coM12.Lpt5().Lpt5(), coM12.Lpt5().prN()));
                                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                                    fingerprint.lpt2(application.getPackageName());
                                                                    strCON = coM12.Lpt5().cON();
                                                                    if (u890.j(strCON, application.getPackageName())) {
                                                                        strCON = "self provider";
                                                                    } else {
                                                                        strCON = "self provider";
                                                                    }
                                                                    fingerprint.COM7(strCON);
                                                                    String str1118 = Build.MANUFACTURER;
                                                                    fingerprint.cON(str1118);
                                                                    String str1119 = Build.MODEL;
                                                                    fingerprint.LPT3(str1119);
                                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                                    xugVar = zugVar.h;
                                                                    p7n1Var = zugVar.c;
                                                                    str11 = Build.FINGERPRINT;
                                                                    if (!nhc1.Y(str11, "generic", false)) {
                                                                        z6 = z3;
                                                                        z7 = true;
                                                                    } else {
                                                                        z6 = z3;
                                                                        z7 = true;
                                                                    }
                                                                    String str11110 = p7n1.c;
                                                                    utw0 utw0Var10 = ike1.a;
                                                                    utw0Var10.y(str11110);
                                                                    utw0Var10.o("isProbablyEmulator = " + z7, new Object[0]);
                                                                    boolValueOf = Boolean.valueOf(z7);
                                                                    boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                                    strA = p7n1.a(application);
                                                                    if (strA == null) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        iHashCode = strA.hashCode();
                                                                        if (iHashCode != -1859733809) {
                                                                            if (iHashCode != -1637701853) {
                                                                                if (iHashCode != -1225090538) {
                                                                                    if (iHashCode == -1046965711) {
                                                                                        str12 = "non valid source";
                                                                                    } else {
                                                                                        str12 = "non valid source";
                                                                                    }
                                                                                } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                                    str12 = "non valid source";
                                                                                } else {
                                                                                    str12 = "Samsung Galaxy Store";
                                                                                }
                                                                            } else if (strA.equals("com.huawei.appmarket")) {
                                                                                str12 = "non valid source";
                                                                            } else {
                                                                                str12 = "Huawei App Gallery";
                                                                            }
                                                                        } else if (strA.equals("com.amazon.venezia")) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "Amazon Appstore";
                                                                        }
                                                                    }
                                                                    str13 = str12;
                                                                    bool2 = Boolean.TRUE;
                                                                    throw new Exception("Verifying use of hookup tools");
                                                                }
                                                            } catch (RemoteException e19) {
                                                                e = e19;
                                                                strG = null;
                                                            } catch (SecurityException e20) {
                                                                e = e20;
                                                                strG = null;
                                                            } catch (UnsupportedOperationException e21) {
                                                                e = e21;
                                                                strG = null;
                                                            }
                                                        } else {
                                                            str7 = null;
                                                            strK = null;
                                                            str9 = null;
                                                            str10 = null;
                                                            str8 = null;
                                                        }
                                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                        DisplayMetrics displayMetrics10 = application.getResources().getDisplayMetrics();
                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics10.densityDpi, displayMetrics10.heightPixels, displayMetrics10.widthPixels));
                                                        DeviceId.CoM4 coM13 = DeviceId.Companion;
                                                        fingerprint.lpt2(new DeviceInfo(coM13.Lpt5().COM7(), coM13.Lpt5().cOM4(), coM13.Lpt5().COM5(), coM13.Lpt5().COM6(), coM13.Lpt5().Lpt5(), coM13.Lpt5().prN()));
                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                        fingerprint.lpt2(application.getPackageName());
                                                        strCON = coM13.Lpt5().cON();
                                                        if (u890.j(strCON, application.getPackageName())) {
                                                            strCON = "self provider";
                                                        } else {
                                                            strCON = "self provider";
                                                        }
                                                        fingerprint.COM7(strCON);
                                                        String str11111 = Build.MANUFACTURER;
                                                        fingerprint.cON(str11111);
                                                        String str11112 = Build.MODEL;
                                                        fingerprint.LPT3(str11112);
                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                        xugVar = zugVar.h;
                                                        p7n1Var = zugVar.c;
                                                        str11 = Build.FINGERPRINT;
                                                        if (!nhc1.Y(str11, "generic", false)) {
                                                            z6 = z3;
                                                            z7 = true;
                                                        } else {
                                                            z6 = z3;
                                                            z7 = true;
                                                        }
                                                        String str11113 = p7n1.c;
                                                        utw0 utw0Var11 = ike1.a;
                                                        utw0Var11.y(str11113);
                                                        utw0Var11.o("isProbablyEmulator = " + z7, new Object[0]);
                                                        boolValueOf = Boolean.valueOf(z7);
                                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                        strA = p7n1.a(application);
                                                        if (strA == null) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            iHashCode = strA.hashCode();
                                                            if (iHashCode != -1859733809) {
                                                                if (iHashCode != -1637701853) {
                                                                    if (iHashCode != -1225090538) {
                                                                        if (iHashCode == -1046965711) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "non valid source";
                                                                        }
                                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "Samsung Galaxy Store";
                                                                    }
                                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Huawei App Gallery";
                                                                }
                                                            } else if (strA.equals("com.amazon.venezia")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Amazon Appstore";
                                                            }
                                                        }
                                                        str13 = str12;
                                                        bool2 = Boolean.TRUE;
                                                        throw new Exception("Verifying use of hookup tools");
                                                    } catch (SecurityException e22) {
                                                        e = e22;
                                                        str2 = null;
                                                        simCountryIso = null;
                                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                        str3 = strR;
                                                        str4 = strQ;
                                                        str5 = str2;
                                                        str6 = simCountryIso;
                                                        boolI = null;
                                                        fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                                        if (telephonyManager != null) {
                                                            strG = zugVar.g(sugVar, telephonyManager);
                                                            strP = p(telephonyManager);
                                                            strL = zugVar.l(sugVar, telephonyManager);
                                                            strH = zugVar.h(sugVar, telephonyManager);
                                                            strK = zugVar.k(application, telephonyManager);
                                                            str7 = strG;
                                                            str8 = strP;
                                                            str9 = strL;
                                                            str10 = strH;
                                                        } else {
                                                            str7 = null;
                                                            strK = null;
                                                            str9 = null;
                                                            str10 = null;
                                                            str8 = null;
                                                        }
                                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                        DisplayMetrics displayMetrics11 = application.getResources().getDisplayMetrics();
                                                        fingerprint.lpt2(new ScreenInfo(displayMetrics11.densityDpi, displayMetrics11.heightPixels, displayMetrics11.widthPixels));
                                                        DeviceId.CoM4 coM14 = DeviceId.Companion;
                                                        fingerprint.lpt2(new DeviceInfo(coM14.Lpt5().COM7(), coM14.Lpt5().cOM4(), coM14.Lpt5().COM5(), coM14.Lpt5().COM6(), coM14.Lpt5().Lpt5(), coM14.Lpt5().prN()));
                                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                        fingerprint.lpt2(application.getPackageName());
                                                        strCON = coM14.Lpt5().cON();
                                                        if (u890.j(strCON, application.getPackageName())) {
                                                            strCON = "self provider";
                                                        } else {
                                                            strCON = "self provider";
                                                        }
                                                        fingerprint.COM7(strCON);
                                                        String str11114 = Build.MANUFACTURER;
                                                        fingerprint.cON(str11114);
                                                        String str11115 = Build.MODEL;
                                                        fingerprint.LPT3(str11115);
                                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                        xugVar = zugVar.h;
                                                        p7n1Var = zugVar.c;
                                                        str11 = Build.FINGERPRINT;
                                                        if (!nhc1.Y(str11, "generic", false)) {
                                                            z6 = z3;
                                                            z7 = true;
                                                        } else {
                                                            z6 = z3;
                                                            z7 = true;
                                                        }
                                                        String str11116 = p7n1.c;
                                                        utw0 utw0Var12 = ike1.a;
                                                        utw0Var12.y(str11116);
                                                        utw0Var12.o("isProbablyEmulator = " + z7, new Object[0]);
                                                        boolValueOf = Boolean.valueOf(z7);
                                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                        strA = p7n1.a(application);
                                                        if (strA == null) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            iHashCode = strA.hashCode();
                                                            if (iHashCode != -1859733809) {
                                                                if (iHashCode != -1637701853) {
                                                                    if (iHashCode != -1225090538) {
                                                                        if (iHashCode == -1046965711) {
                                                                            str12 = "non valid source";
                                                                        } else {
                                                                            str12 = "non valid source";
                                                                        }
                                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "Samsung Galaxy Store";
                                                                    }
                                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Huawei App Gallery";
                                                                }
                                                            } else if (strA.equals("com.amazon.venezia")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Amazon Appstore";
                                                            }
                                                        }
                                                        str13 = str12;
                                                        bool2 = Boolean.TRUE;
                                                        throw new Exception("Verifying use of hookup tools");
                                                    }
                                                } catch (RemoteException e23) {
                                                    e = e23;
                                                    strQ = null;
                                                    str2 = null;
                                                    simCountryIso = null;
                                                    r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(201, "Telephony", "A telephony remote error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                    str3 = strR;
                                                    str4 = strQ;
                                                    str5 = str2;
                                                    str6 = simCountryIso;
                                                    boolI = null;
                                                    fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                                    if (telephonyManager != null) {
                                                        strG = zugVar.g(sugVar, telephonyManager);
                                                        strP = p(telephonyManager);
                                                        strL = zugVar.l(sugVar, telephonyManager);
                                                        strH = zugVar.h(sugVar, telephonyManager);
                                                        strK = zugVar.k(application, telephonyManager);
                                                        str7 = strG;
                                                        str8 = strP;
                                                        str9 = strL;
                                                        str10 = strH;
                                                    } else {
                                                        str7 = null;
                                                        strK = null;
                                                        str9 = null;
                                                        str10 = null;
                                                        str8 = null;
                                                    }
                                                    fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                    DisplayMetrics displayMetrics12 = application.getResources().getDisplayMetrics();
                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics12.densityDpi, displayMetrics12.heightPixels, displayMetrics12.widthPixels));
                                                    DeviceId.CoM4 coM15 = DeviceId.Companion;
                                                    fingerprint.lpt2(new DeviceInfo(coM15.Lpt5().COM7(), coM15.Lpt5().cOM4(), coM15.Lpt5().COM5(), coM15.Lpt5().COM6(), coM15.Lpt5().Lpt5(), coM15.Lpt5().prN()));
                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                    fingerprint.lpt2(application.getPackageName());
                                                    strCON = coM15.Lpt5().cON();
                                                    if (u890.j(strCON, application.getPackageName())) {
                                                        strCON = "self provider";
                                                    } else {
                                                        strCON = "self provider";
                                                    }
                                                    fingerprint.COM7(strCON);
                                                    String str11117 = Build.MANUFACTURER;
                                                    fingerprint.cON(str11117);
                                                    String str11118 = Build.MODEL;
                                                    fingerprint.LPT3(str11118);
                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                    xugVar = zugVar.h;
                                                    p7n1Var = zugVar.c;
                                                    str11 = Build.FINGERPRINT;
                                                    if (!nhc1.Y(str11, "generic", false)) {
                                                        z6 = z3;
                                                        z7 = true;
                                                    } else {
                                                        z6 = z3;
                                                        z7 = true;
                                                    }
                                                    String str11119 = p7n1.c;
                                                    utw0 utw0Var13 = ike1.a;
                                                    utw0Var13.y(str11119);
                                                    utw0Var13.o("isProbablyEmulator = " + z7, new Object[0]);
                                                    boolValueOf = Boolean.valueOf(z7);
                                                    boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                    strA = p7n1.a(application);
                                                    if (strA == null) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        iHashCode = strA.hashCode();
                                                        if (iHashCode != -1859733809) {
                                                            if (iHashCode != -1637701853) {
                                                                if (iHashCode != -1225090538) {
                                                                    if (iHashCode == -1046965711) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "non valid source";
                                                                    }
                                                                } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Samsung Galaxy Store";
                                                                }
                                                            } else if (strA.equals("com.huawei.appmarket")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Huawei App Gallery";
                                                            }
                                                        } else if (strA.equals("com.amazon.venezia")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Amazon Appstore";
                                                        }
                                                    }
                                                    str13 = str12;
                                                    bool2 = Boolean.TRUE;
                                                    throw new Exception("Verifying use of hookup tools");
                                                } catch (SecurityException e24) {
                                                    e = e24;
                                                    strQ = null;
                                                    str2 = null;
                                                    simCountryIso = null;
                                                    r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(200, "Telephony", "A telephony security error occurred", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                                    str3 = strR;
                                                    str4 = strQ;
                                                    str5 = str2;
                                                    str6 = simCountryIso;
                                                    boolI = null;
                                                    fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                                    if (telephonyManager != null) {
                                                        strG = zugVar.g(sugVar, telephonyManager);
                                                        strP = p(telephonyManager);
                                                        strL = zugVar.l(sugVar, telephonyManager);
                                                        strH = zugVar.h(sugVar, telephonyManager);
                                                        strK = zugVar.k(application, telephonyManager);
                                                        str7 = strG;
                                                        str8 = strP;
                                                        str9 = strL;
                                                        str10 = strH;
                                                    } else {
                                                        str7 = null;
                                                        strK = null;
                                                        str9 = null;
                                                        str10 = null;
                                                        str8 = null;
                                                    }
                                                    fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                                    DisplayMetrics displayMetrics13 = application.getResources().getDisplayMetrics();
                                                    fingerprint.lpt2(new ScreenInfo(displayMetrics13.densityDpi, displayMetrics13.heightPixels, displayMetrics13.widthPixels));
                                                    DeviceId.CoM4 coM16 = DeviceId.Companion;
                                                    fingerprint.lpt2(new DeviceInfo(coM16.Lpt5().COM7(), coM16.Lpt5().cOM4(), coM16.Lpt5().COM5(), coM16.Lpt5().COM6(), coM16.Lpt5().Lpt5(), coM16.Lpt5().prN()));
                                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                                    fingerprint.lpt2(application.getPackageName());
                                                    strCON = coM16.Lpt5().cON();
                                                    if (u890.j(strCON, application.getPackageName())) {
                                                        strCON = "self provider";
                                                    } else {
                                                        strCON = "self provider";
                                                    }
                                                    fingerprint.COM7(strCON);
                                                    String str111110 = Build.MANUFACTURER;
                                                    fingerprint.cON(str111110);
                                                    String str111111 = Build.MODEL;
                                                    fingerprint.LPT3(str111111);
                                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                                    xugVar = zugVar.h;
                                                    p7n1Var = zugVar.c;
                                                    str11 = Build.FINGERPRINT;
                                                    if (!nhc1.Y(str11, "generic", false)) {
                                                        z6 = z3;
                                                        z7 = true;
                                                    } else {
                                                        z6 = z3;
                                                        z7 = true;
                                                    }
                                                    String str111112 = p7n1.c;
                                                    utw0 utw0Var14 = ike1.a;
                                                    utw0Var14.y(str111112);
                                                    utw0Var14.o("isProbablyEmulator = " + z7, new Object[0]);
                                                    boolValueOf = Boolean.valueOf(z7);
                                                    boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                                    strA = p7n1.a(application);
                                                    if (strA == null) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        iHashCode = strA.hashCode();
                                                        if (iHashCode != -1859733809) {
                                                            if (iHashCode != -1637701853) {
                                                                if (iHashCode != -1225090538) {
                                                                    if (iHashCode == -1046965711) {
                                                                        str12 = "non valid source";
                                                                    } else {
                                                                        str12 = "non valid source";
                                                                    }
                                                                } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                                    str12 = "non valid source";
                                                                } else {
                                                                    str12 = "Samsung Galaxy Store";
                                                                }
                                                            } else if (strA.equals("com.huawei.appmarket")) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "Huawei App Gallery";
                                                            }
                                                        } else if (strA.equals("com.amazon.venezia")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Amazon Appstore";
                                                        }
                                                    }
                                                    str13 = str12;
                                                    bool2 = Boolean.TRUE;
                                                    throw new Exception("Verifying use of hookup tools");
                                                }
                                            } catch (RemoteException e25) {
                                                e = e25;
                                                strR = null;
                                            } catch (SecurityException e26) {
                                                e = e26;
                                                strR = null;
                                            }
                                            fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                            if (telephonyManager != null) {
                                                strG = zugVar.g(sugVar, telephonyManager);
                                                strP = p(telephonyManager);
                                                strL = zugVar.l(sugVar, telephonyManager);
                                                strH = zugVar.h(sugVar, telephonyManager);
                                                strK = zugVar.k(application, telephonyManager);
                                                str7 = strG;
                                                str8 = strP;
                                                str9 = strL;
                                                str10 = strH;
                                            } else {
                                                str7 = null;
                                                strK = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                            DisplayMetrics displayMetrics14 = application.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics14.densityDpi, displayMetrics14.heightPixels, displayMetrics14.widthPixels));
                                            DeviceId.CoM4 coM17 = DeviceId.Companion;
                                            fingerprint.lpt2(new DeviceInfo(coM17.Lpt5().COM7(), coM17.Lpt5().cOM4(), coM17.Lpt5().COM5(), coM17.Lpt5().COM6(), coM17.Lpt5().Lpt5(), coM17.Lpt5().prN()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(application.getPackageName());
                                            strCON = coM17.Lpt5().cON();
                                            if (u890.j(strCON, application.getPackageName())) {
                                                strCON = "self provider";
                                            } else {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str111113 = Build.MANUFACTURER;
                                            fingerprint.cON(str111113);
                                            String str111114 = Build.MODEL;
                                            fingerprint.LPT3(str111114);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            xugVar = zugVar.h;
                                            p7n1Var = zugVar.c;
                                            str11 = Build.FINGERPRINT;
                                            if (!nhc1.Y(str11, "generic", false)) {
                                                z6 = z3;
                                                z7 = true;
                                            } else {
                                                z6 = z3;
                                                z7 = true;
                                            }
                                            String str111115 = p7n1.c;
                                            utw0 utw0Var15 = ike1.a;
                                            utw0Var15.y(str111115);
                                            utw0Var15.o("isProbablyEmulator = " + z7, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z7);
                                            boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strA = p7n1.a(application);
                                            if (strA == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strA.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strA.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strA.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        }
                                        str3 = null;
                                        str4 = null;
                                        str6 = null;
                                        str5 = null;
                                        boolI = null;
                                        fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                        if (telephonyManager != null) {
                                            strG = zugVar.g(sugVar, telephonyManager);
                                            strP = p(telephonyManager);
                                            strL = zugVar.l(sugVar, telephonyManager);
                                            strH = zugVar.h(sugVar, telephonyManager);
                                            strK = zugVar.k(application, telephonyManager);
                                            str7 = strG;
                                            str8 = strP;
                                            str9 = strL;
                                            str10 = strH;
                                        } else {
                                            str7 = null;
                                            strK = null;
                                            str9 = null;
                                            str10 = null;
                                            str8 = null;
                                        }
                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                        DisplayMetrics displayMetrics15 = application.getResources().getDisplayMetrics();
                                        fingerprint.lpt2(new ScreenInfo(displayMetrics15.densityDpi, displayMetrics15.heightPixels, displayMetrics15.widthPixels));
                                        DeviceId.CoM4 coM18 = DeviceId.Companion;
                                        fingerprint.lpt2(new DeviceInfo(coM18.Lpt5().COM7(), coM18.Lpt5().cOM4(), coM18.Lpt5().COM5(), coM18.Lpt5().COM6(), coM18.Lpt5().Lpt5(), coM18.Lpt5().prN()));
                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                        fingerprint.lpt2(application.getPackageName());
                                        strCON = coM18.Lpt5().cON();
                                        if (u890.j(strCON, application.getPackageName())) {
                                            strCON = "self provider";
                                        } else {
                                            strCON = "self provider";
                                        }
                                        fingerprint.COM7(strCON);
                                        String str111116 = Build.MANUFACTURER;
                                        fingerprint.cON(str111116);
                                        String str111117 = Build.MODEL;
                                        fingerprint.LPT3(str111117);
                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                        xugVar = zugVar.h;
                                        p7n1Var = zugVar.c;
                                        str11 = Build.FINGERPRINT;
                                        if (!nhc1.Y(str11, "generic", false)) {
                                            z6 = z3;
                                            z7 = true;
                                        } else {
                                            z6 = z3;
                                            z7 = true;
                                        }
                                        String str111118 = p7n1.c;
                                        utw0 utw0Var16 = ike1.a;
                                        utw0Var16.y(str111118);
                                        utw0Var16.o("isProbablyEmulator = " + z7, new Object[0]);
                                        boolValueOf = Boolean.valueOf(z7);
                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                        strA = p7n1.a(application);
                                        if (strA == null) {
                                            str12 = "non valid source";
                                        } else {
                                            iHashCode = strA.hashCode();
                                            if (iHashCode != -1859733809) {
                                                if (iHashCode != -1637701853) {
                                                    if (iHashCode != -1225090538) {
                                                        if (iHashCode == -1046965711) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "non valid source";
                                                        }
                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Samsung Galaxy Store";
                                                    }
                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Huawei App Gallery";
                                                }
                                            } else if (strA.equals("com.amazon.venezia")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Amazon Appstore";
                                            }
                                        }
                                        str13 = str12;
                                        bool2 = Boolean.TRUE;
                                        throw new Exception("Verifying use of hookup tools");
                                    } catch (IllegalArgumentException e27) {
                                        e = e27;
                                        z5 = z4;
                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(603, "JVM", "An illegal argument was passed to a method", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                        displayName = null;
                                        j3 = j2;
                                        long rawOffset2 = new GregorianCalendar().getTimeZone().getRawOffset();
                                        numValueOf = Integer.valueOf((int) (rawOffset2 / 3600000));
                                        numValueOf2 = Integer.valueOf((int) (rawOffset2 / 60000));
                                        fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                        if (((x6n1) sugVar2).a(application, "android.hardware.telephony")) {
                                            telephonyManager = (TelephonyManager) application.getApplicationContext().getSystemService("phone");
                                        } else {
                                            telephonyManager = null;
                                        }
                                        if (telephonyManager != null) {
                                            strR = zugVar.r(sugVar, telephonyManager);
                                            strQ = q(sugVar, application, telephonyManager);
                                            i8 = Build.VERSION.SDK_INT;
                                            if (i8 < 33) {
                                                simCountryIso = telephonyManager.getSimCountryIso();
                                            }
                                            if (i8 >= 33) {
                                                simOperator = telephonyManager.getSimOperator();
                                            } else {
                                                simOperator = telephonyManager.getSimOperator();
                                            }
                                            str2 = simOperator;
                                            boolI = zugVar.i(telephonyManager);
                                            str3 = strR;
                                            str4 = strQ;
                                            str5 = str2;
                                            str6 = simCountryIso;
                                            fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                            if (telephonyManager != null) {
                                                strG = zugVar.g(sugVar, telephonyManager);
                                                strP = p(telephonyManager);
                                                strL = zugVar.l(sugVar, telephonyManager);
                                                strH = zugVar.h(sugVar, telephonyManager);
                                                strK = zugVar.k(application, telephonyManager);
                                                str7 = strG;
                                                str8 = strP;
                                                str9 = strL;
                                                str10 = strH;
                                            } else {
                                                str7 = null;
                                                strK = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                            DisplayMetrics displayMetrics16 = application.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics16.densityDpi, displayMetrics16.heightPixels, displayMetrics16.widthPixels));
                                            DeviceId.CoM4 coM19 = DeviceId.Companion;
                                            fingerprint.lpt2(new DeviceInfo(coM19.Lpt5().COM7(), coM19.Lpt5().cOM4(), coM19.Lpt5().COM5(), coM19.Lpt5().COM6(), coM19.Lpt5().Lpt5(), coM19.Lpt5().prN()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(application.getPackageName());
                                            strCON = coM19.Lpt5().cON();
                                            if (u890.j(strCON, application.getPackageName())) {
                                                strCON = "self provider";
                                            } else {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str111119 = Build.MANUFACTURER;
                                            fingerprint.cON(str111119);
                                            String str1111110 = Build.MODEL;
                                            fingerprint.LPT3(str1111110);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            xugVar = zugVar.h;
                                            p7n1Var = zugVar.c;
                                            str11 = Build.FINGERPRINT;
                                            if (!nhc1.Y(str11, "generic", false)) {
                                                z6 = z3;
                                                z7 = true;
                                            } else {
                                                z6 = z3;
                                                z7 = true;
                                            }
                                            String str1111111 = p7n1.c;
                                            utw0 utw0Var17 = ike1.a;
                                            utw0Var17.y(str1111111);
                                            utw0Var17.o("isProbablyEmulator = " + z7, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z7);
                                            boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strA = p7n1.a(application);
                                            if (strA == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strA.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strA.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strA.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        }
                                        str3 = null;
                                        str4 = null;
                                        str6 = null;
                                        str5 = null;
                                        boolI = null;
                                        fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                        if (telephonyManager != null) {
                                            strG = zugVar.g(sugVar, telephonyManager);
                                            strP = p(telephonyManager);
                                            strL = zugVar.l(sugVar, telephonyManager);
                                            strH = zugVar.h(sugVar, telephonyManager);
                                            strK = zugVar.k(application, telephonyManager);
                                            str7 = strG;
                                            str8 = strP;
                                            str9 = strL;
                                            str10 = strH;
                                        } else {
                                            str7 = null;
                                            strK = null;
                                            str9 = null;
                                            str10 = null;
                                            str8 = null;
                                        }
                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                        DisplayMetrics displayMetrics17 = application.getResources().getDisplayMetrics();
                                        fingerprint.lpt2(new ScreenInfo(displayMetrics17.densityDpi, displayMetrics17.heightPixels, displayMetrics17.widthPixels));
                                        DeviceId.CoM4 coM110 = DeviceId.Companion;
                                        fingerprint.lpt2(new DeviceInfo(coM110.Lpt5().COM7(), coM110.Lpt5().cOM4(), coM110.Lpt5().COM5(), coM110.Lpt5().COM6(), coM110.Lpt5().Lpt5(), coM110.Lpt5().prN()));
                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                        fingerprint.lpt2(application.getPackageName());
                                        strCON = coM110.Lpt5().cON();
                                        if (u890.j(strCON, application.getPackageName())) {
                                            strCON = "self provider";
                                        } else {
                                            strCON = "self provider";
                                        }
                                        fingerprint.COM7(strCON);
                                        String str1111112 = Build.MANUFACTURER;
                                        fingerprint.cON(str1111112);
                                        String str1111113 = Build.MODEL;
                                        fingerprint.LPT3(str1111113);
                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                        xugVar = zugVar.h;
                                        p7n1Var = zugVar.c;
                                        str11 = Build.FINGERPRINT;
                                        if (!nhc1.Y(str11, "generic", false)) {
                                            z6 = z3;
                                            z7 = true;
                                        } else {
                                            z6 = z3;
                                            z7 = true;
                                        }
                                        String str1111114 = p7n1.c;
                                        utw0 utw0Var18 = ike1.a;
                                        utw0Var18.y(str1111114);
                                        utw0Var18.o("isProbablyEmulator = " + z7, new Object[0]);
                                        boolValueOf = Boolean.valueOf(z7);
                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                        strA = p7n1.a(application);
                                        if (strA == null) {
                                            str12 = "non valid source";
                                        } else {
                                            iHashCode = strA.hashCode();
                                            if (iHashCode != -1859733809) {
                                                if (iHashCode != -1637701853) {
                                                    if (iHashCode != -1225090538) {
                                                        if (iHashCode == -1046965711) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "non valid source";
                                                        }
                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Samsung Galaxy Store";
                                                    }
                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Huawei App Gallery";
                                                }
                                            } else if (strA.equals("com.amazon.venezia")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Amazon Appstore";
                                            }
                                        }
                                        str13 = str12;
                                        bool2 = Boolean.TRUE;
                                        throw new Exception("Verifying use of hookup tools");
                                    } catch (NullPointerException e28) {
                                        e = e28;
                                        z5 = z4;
                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(601, "JVM", "An data object was null when it should not have been", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                        displayName = null;
                                        j3 = j2;
                                        long rawOffset3 = new GregorianCalendar().getTimeZone().getRawOffset();
                                        numValueOf = Integer.valueOf((int) (rawOffset3 / 3600000));
                                        numValueOf2 = Integer.valueOf((int) (rawOffset3 / 60000));
                                        fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                        if (((x6n1) sugVar2).a(application, "android.hardware.telephony")) {
                                            telephonyManager = (TelephonyManager) application.getApplicationContext().getSystemService("phone");
                                        } else {
                                            telephonyManager = null;
                                        }
                                        if (telephonyManager != null) {
                                            strR = zugVar.r(sugVar, telephonyManager);
                                            strQ = q(sugVar, application, telephonyManager);
                                            i8 = Build.VERSION.SDK_INT;
                                            if (i8 < 33) {
                                                simCountryIso = telephonyManager.getSimCountryIso();
                                            }
                                            if (i8 >= 33) {
                                                simOperator = telephonyManager.getSimOperator();
                                            } else {
                                                simOperator = telephonyManager.getSimOperator();
                                            }
                                            str2 = simOperator;
                                            boolI = zugVar.i(telephonyManager);
                                            str3 = strR;
                                            str4 = strQ;
                                            str5 = str2;
                                            str6 = simCountryIso;
                                            fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                            if (telephonyManager != null) {
                                                strG = zugVar.g(sugVar, telephonyManager);
                                                strP = p(telephonyManager);
                                                strL = zugVar.l(sugVar, telephonyManager);
                                                strH = zugVar.h(sugVar, telephonyManager);
                                                strK = zugVar.k(application, telephonyManager);
                                                str7 = strG;
                                                str8 = strP;
                                                str9 = strL;
                                                str10 = strH;
                                            } else {
                                                str7 = null;
                                                strK = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                            DisplayMetrics displayMetrics18 = application.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics18.densityDpi, displayMetrics18.heightPixels, displayMetrics18.widthPixels));
                                            DeviceId.CoM4 coM111 = DeviceId.Companion;
                                            fingerprint.lpt2(new DeviceInfo(coM111.Lpt5().COM7(), coM111.Lpt5().cOM4(), coM111.Lpt5().COM5(), coM111.Lpt5().COM6(), coM111.Lpt5().Lpt5(), coM111.Lpt5().prN()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(application.getPackageName());
                                            strCON = coM111.Lpt5().cON();
                                            if (u890.j(strCON, application.getPackageName())) {
                                                strCON = "self provider";
                                            } else {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str1111115 = Build.MANUFACTURER;
                                            fingerprint.cON(str1111115);
                                            String str1111116 = Build.MODEL;
                                            fingerprint.LPT3(str1111116);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            xugVar = zugVar.h;
                                            p7n1Var = zugVar.c;
                                            str11 = Build.FINGERPRINT;
                                            if (!nhc1.Y(str11, "generic", false)) {
                                                z6 = z3;
                                                z7 = true;
                                            } else {
                                                z6 = z3;
                                                z7 = true;
                                            }
                                            String str1111117 = p7n1.c;
                                            utw0 utw0Var19 = ike1.a;
                                            utw0Var19.y(str1111117);
                                            utw0Var19.o("isProbablyEmulator = " + z7, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z7);
                                            boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strA = p7n1.a(application);
                                            if (strA == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strA.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strA.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strA.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        }
                                        str3 = null;
                                        str4 = null;
                                        str6 = null;
                                        str5 = null;
                                        boolI = null;
                                        fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                        if (telephonyManager != null) {
                                            strG = zugVar.g(sugVar, telephonyManager);
                                            strP = p(telephonyManager);
                                            strL = zugVar.l(sugVar, telephonyManager);
                                            strH = zugVar.h(sugVar, telephonyManager);
                                            strK = zugVar.k(application, telephonyManager);
                                            str7 = strG;
                                            str8 = strP;
                                            str9 = strL;
                                            str10 = strH;
                                        } else {
                                            str7 = null;
                                            strK = null;
                                            str9 = null;
                                            str10 = null;
                                            str8 = null;
                                        }
                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                        DisplayMetrics displayMetrics19 = application.getResources().getDisplayMetrics();
                                        fingerprint.lpt2(new ScreenInfo(displayMetrics19.densityDpi, displayMetrics19.heightPixels, displayMetrics19.widthPixels));
                                        DeviceId.CoM4 coM112 = DeviceId.Companion;
                                        fingerprint.lpt2(new DeviceInfo(coM112.Lpt5().COM7(), coM112.Lpt5().cOM4(), coM112.Lpt5().COM5(), coM112.Lpt5().COM6(), coM112.Lpt5().Lpt5(), coM112.Lpt5().prN()));
                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                        fingerprint.lpt2(application.getPackageName());
                                        strCON = coM112.Lpt5().cON();
                                        if (u890.j(strCON, application.getPackageName())) {
                                            strCON = "self provider";
                                        } else {
                                            strCON = "self provider";
                                        }
                                        fingerprint.COM7(strCON);
                                        String str1111118 = Build.MANUFACTURER;
                                        fingerprint.cON(str1111118);
                                        String str1111119 = Build.MODEL;
                                        fingerprint.LPT3(str1111119);
                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                        xugVar = zugVar.h;
                                        p7n1Var = zugVar.c;
                                        str11 = Build.FINGERPRINT;
                                        if (!nhc1.Y(str11, "generic", false)) {
                                            z6 = z3;
                                            z7 = true;
                                        } else {
                                            z6 = z3;
                                            z7 = true;
                                        }
                                        String str11111110 = p7n1.c;
                                        utw0 utw0Var110 = ike1.a;
                                        utw0Var110.y(str11111110);
                                        utw0Var110.o("isProbablyEmulator = " + z7, new Object[0]);
                                        boolValueOf = Boolean.valueOf(z7);
                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                        strA = p7n1.a(application);
                                        if (strA == null) {
                                            str12 = "non valid source";
                                        } else {
                                            iHashCode = strA.hashCode();
                                            if (iHashCode != -1859733809) {
                                                if (iHashCode != -1637701853) {
                                                    if (iHashCode != -1225090538) {
                                                        if (iHashCode == -1046965711) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "non valid source";
                                                        }
                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Samsung Galaxy Store";
                                                    }
                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Huawei App Gallery";
                                                }
                                            } else if (strA.equals("com.amazon.venezia")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Amazon Appstore";
                                            }
                                        }
                                        str13 = str12;
                                        bool2 = Boolean.TRUE;
                                        throw new Exception("Verifying use of hookup tools");
                                    } catch (RuntimeException e29) {
                                        e = e29;
                                        z5 = z4;
                                        r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(602, "JVM", "An error occurred during runtime", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                        displayName = null;
                                        j3 = j2;
                                        long rawOffset4 = new GregorianCalendar().getTimeZone().getRawOffset();
                                        numValueOf = Integer.valueOf((int) (rawOffset4 / 3600000));
                                        numValueOf2 = Integer.valueOf((int) (rawOffset4 / 60000));
                                        fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                        if (((x6n1) sugVar2).a(application, "android.hardware.telephony")) {
                                            telephonyManager = (TelephonyManager) application.getApplicationContext().getSystemService("phone");
                                        } else {
                                            telephonyManager = null;
                                        }
                                        if (telephonyManager != null) {
                                            strR = zugVar.r(sugVar, telephonyManager);
                                            strQ = q(sugVar, application, telephonyManager);
                                            i8 = Build.VERSION.SDK_INT;
                                            if (i8 < 33) {
                                                simCountryIso = telephonyManager.getSimCountryIso();
                                            }
                                            if (i8 >= 33) {
                                                simOperator = telephonyManager.getSimOperator();
                                            } else {
                                                simOperator = telephonyManager.getSimOperator();
                                            }
                                            str2 = simOperator;
                                            boolI = zugVar.i(telephonyManager);
                                            str3 = strR;
                                            str4 = strQ;
                                            str5 = str2;
                                            str6 = simCountryIso;
                                            fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                            if (telephonyManager != null) {
                                                strG = zugVar.g(sugVar, telephonyManager);
                                                strP = p(telephonyManager);
                                                strL = zugVar.l(sugVar, telephonyManager);
                                                strH = zugVar.h(sugVar, telephonyManager);
                                                strK = zugVar.k(application, telephonyManager);
                                                str7 = strG;
                                                str8 = strP;
                                                str9 = strL;
                                                str10 = strH;
                                            } else {
                                                str7 = null;
                                                strK = null;
                                                str9 = null;
                                                str10 = null;
                                                str8 = null;
                                            }
                                            fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                            DisplayMetrics displayMetrics110 = application.getResources().getDisplayMetrics();
                                            fingerprint.lpt2(new ScreenInfo(displayMetrics110.densityDpi, displayMetrics110.heightPixels, displayMetrics110.widthPixels));
                                            DeviceId.CoM4 coM113 = DeviceId.Companion;
                                            fingerprint.lpt2(new DeviceInfo(coM113.Lpt5().COM7(), coM113.Lpt5().cOM4(), coM113.Lpt5().COM5(), coM113.Lpt5().COM6(), coM113.Lpt5().Lpt5(), coM113.Lpt5().prN()));
                                            fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                            fingerprint.Lpt5(Locale.getDefault().getCountry());
                                            fingerprint.lpt2(application.getPackageName());
                                            strCON = coM113.Lpt5().cON();
                                            if (u890.j(strCON, application.getPackageName())) {
                                                strCON = "self provider";
                                            } else {
                                                strCON = "self provider";
                                            }
                                            fingerprint.COM7(strCON);
                                            String str11111111 = Build.MANUFACTURER;
                                            fingerprint.cON(str11111111);
                                            String str11111112 = Build.MODEL;
                                            fingerprint.LPT3(str11111112);
                                            fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                            xugVar = zugVar.h;
                                            p7n1Var = zugVar.c;
                                            str11 = Build.FINGERPRINT;
                                            if (!nhc1.Y(str11, "generic", false)) {
                                                z6 = z3;
                                                z7 = true;
                                            } else {
                                                z6 = z3;
                                                z7 = true;
                                            }
                                            String str11111113 = p7n1.c;
                                            utw0 utw0Var111 = ike1.a;
                                            utw0Var111.y(str11111113);
                                            utw0Var111.o("isProbablyEmulator = " + z7, new Object[0]);
                                            boolValueOf = Boolean.valueOf(z7);
                                            boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                            boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                            strA = p7n1.a(application);
                                            if (strA == null) {
                                                str12 = "non valid source";
                                            } else {
                                                iHashCode = strA.hashCode();
                                                if (iHashCode != -1859733809) {
                                                    if (iHashCode != -1637701853) {
                                                        if (iHashCode != -1225090538) {
                                                            if (iHashCode == -1046965711) {
                                                                str12 = "non valid source";
                                                            } else {
                                                                str12 = "non valid source";
                                                            }
                                                        } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Samsung Galaxy Store";
                                                        }
                                                    } else if (strA.equals("com.huawei.appmarket")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Huawei App Gallery";
                                                    }
                                                } else if (strA.equals("com.amazon.venezia")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Amazon Appstore";
                                                }
                                            }
                                            str13 = str12;
                                            bool2 = Boolean.TRUE;
                                            throw new Exception("Verifying use of hookup tools");
                                        }
                                        str3 = null;
                                        str4 = null;
                                        str6 = null;
                                        str5 = null;
                                        boolI = null;
                                        fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                        if (telephonyManager != null) {
                                            strG = zugVar.g(sugVar, telephonyManager);
                                            strP = p(telephonyManager);
                                            strL = zugVar.l(sugVar, telephonyManager);
                                            strH = zugVar.h(sugVar, telephonyManager);
                                            strK = zugVar.k(application, telephonyManager);
                                            str7 = strG;
                                            str8 = strP;
                                            str9 = strL;
                                            str10 = strH;
                                        } else {
                                            str7 = null;
                                            strK = null;
                                            str9 = null;
                                            str10 = null;
                                            str8 = null;
                                        }
                                        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                        DisplayMetrics displayMetrics111 = application.getResources().getDisplayMetrics();
                                        fingerprint.lpt2(new ScreenInfo(displayMetrics111.densityDpi, displayMetrics111.heightPixels, displayMetrics111.widthPixels));
                                        DeviceId.CoM4 coM114 = DeviceId.Companion;
                                        fingerprint.lpt2(new DeviceInfo(coM114.Lpt5().COM7(), coM114.Lpt5().cOM4(), coM114.Lpt5().COM5(), coM114.Lpt5().COM6(), coM114.Lpt5().Lpt5(), coM114.Lpt5().prN()));
                                        fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                        fingerprint.Lpt5(Locale.getDefault().getCountry());
                                        fingerprint.lpt2(application.getPackageName());
                                        strCON = coM114.Lpt5().cON();
                                        if (u890.j(strCON, application.getPackageName())) {
                                            strCON = "self provider";
                                        } else {
                                            strCON = "self provider";
                                        }
                                        fingerprint.COM7(strCON);
                                        String str11111114 = Build.MANUFACTURER;
                                        fingerprint.cON(str11111114);
                                        String str11111115 = Build.MODEL;
                                        fingerprint.LPT3(str11111115);
                                        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                        xugVar = zugVar.h;
                                        p7n1Var = zugVar.c;
                                        str11 = Build.FINGERPRINT;
                                        if (!nhc1.Y(str11, "generic", false)) {
                                            z6 = z3;
                                            z7 = true;
                                        } else {
                                            z6 = z3;
                                            z7 = true;
                                        }
                                        String str11111116 = p7n1.c;
                                        utw0 utw0Var112 = ike1.a;
                                        utw0Var112.y(str11111116);
                                        utw0Var112.o("isProbablyEmulator = " + z7, new Object[0]);
                                        boolValueOf = Boolean.valueOf(z7);
                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                        strA = p7n1.a(application);
                                        if (strA == null) {
                                            str12 = "non valid source";
                                        } else {
                                            iHashCode = strA.hashCode();
                                            if (iHashCode != -1859733809) {
                                                if (iHashCode != -1637701853) {
                                                    if (iHashCode != -1225090538) {
                                                        if (iHashCode == -1046965711) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "non valid source";
                                                        }
                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Samsung Galaxy Store";
                                                    }
                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Huawei App Gallery";
                                                }
                                            } else if (strA.equals("com.amazon.venezia")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Amazon Appstore";
                                            }
                                        }
                                        str13 = str12;
                                        bool2 = Boolean.TRUE;
                                        throw new Exception("Verifying use of hookup tools");
                                    }
                                } else {
                                    id = null;
                                }
                                z5 = z4;
                                displayName = DesugarTimeZone.getTimeZone(id).getDisplayName(false, 0);
                                i2 = i2;
                                i3 = i3;
                                j3 = j2;
                                long rawOffset5 = new GregorianCalendar().getTimeZone().getRawOffset();
                                numValueOf = Integer.valueOf((int) (rawOffset5 / 3600000));
                                numValueOf2 = Integer.valueOf((int) (rawOffset5 / 60000));
                                fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
                                if (((x6n1) sugVar2).a(application, "android.hardware.telephony")) {
                                    telephonyManager = (TelephonyManager) application.getApplicationContext().getSystemService("phone");
                                } else {
                                    telephonyManager = null;
                                }
                                if (telephonyManager != null) {
                                    strR = zugVar.r(sugVar, telephonyManager);
                                    strQ = q(sugVar, application, telephonyManager);
                                    i8 = Build.VERSION.SDK_INT;
                                    simCountryIso = (i8 < 33 || ((x6n1) sugVar).a(application, "android.hardware.telephony.subscription")) ? telephonyManager.getSimCountryIso() : null;
                                    if (i8 >= 33 || ((x6n1) sugVar).a(application, "android.hardware.telephony.subscription")) {
                                        simOperator = telephonyManager.getSimOperator();
                                        str2 = simOperator;
                                    } else {
                                        str2 = null;
                                    }
                                    boolI = zugVar.i(telephonyManager);
                                    str3 = strR;
                                    str4 = strQ;
                                    str5 = str2;
                                    str6 = simCountryIso;
                                    fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                    if (telephonyManager != null) {
                                        strG = zugVar.g(sugVar, telephonyManager);
                                        strP = p(telephonyManager);
                                        strL = zugVar.l(sugVar, telephonyManager);
                                        strH = zugVar.h(sugVar, telephonyManager);
                                        strK = zugVar.k(application, telephonyManager);
                                        str7 = strG;
                                        str8 = strP;
                                        str9 = strL;
                                        str10 = strH;
                                    } else {
                                        str7 = null;
                                        strK = null;
                                        str9 = null;
                                        str10 = null;
                                        str8 = null;
                                    }
                                    fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                    DisplayMetrics displayMetrics112 = application.getResources().getDisplayMetrics();
                                    fingerprint.lpt2(new ScreenInfo(displayMetrics112.densityDpi, displayMetrics112.heightPixels, displayMetrics112.widthPixels));
                                    DeviceId.CoM4 coM115 = DeviceId.Companion;
                                    fingerprint.lpt2(new DeviceInfo(coM115.Lpt5().COM7(), coM115.Lpt5().cOM4(), coM115.Lpt5().COM5(), coM115.Lpt5().COM6(), coM115.Lpt5().Lpt5(), coM115.Lpt5().prN()));
                                    fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                    fingerprint.Lpt5(Locale.getDefault().getCountry());
                                    fingerprint.lpt2(application.getPackageName());
                                    strCON = coM115.Lpt5().cON();
                                    if (u890.j(strCON, application.getPackageName()) || strCON == null) {
                                        strCON = "self provider";
                                    }
                                    fingerprint.COM7(strCON);
                                    String str11111117 = Build.MANUFACTURER;
                                    fingerprint.cON(str11111117);
                                    String str11111118 = Build.MODEL;
                                    fingerprint.LPT3(str11111118);
                                    fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                    xugVar = zugVar.h;
                                    p7n1Var = zugVar.c;
                                    str11 = Build.FINGERPRINT;
                                    if (!nhc1.Y(str11, "generic", false) && !nhc1.Y(str11, "unknown", false) && !ihc1.h0(str11, "sdk_gphone", false)) {
                                        z6 = z3;
                                        if (!ihc1.h0(str11, "emulator", false) && !ihc1.h0(str11111118, "google_sdk", false) && !ihc1.h0(str11111118, "sdk_gphone", false) && !ihc1.h0(str11111118, "Emulator", true) && !ihc1.h0(str11111118, "Android SDK built for x86", true) && !ihc1.h0(str11111118, "sdk_phone_armv7", false) && !ihc1.h0(str11111117, "Genymotion", true) && !ihc1.h0(str11111117, "Genymobile", true) && !ihc1.h0(str11111117, "BlueStacks", true) && !ihc1.h0(str11111117, "Andy", true) && !ihc1.h0(str11111117, "YouWave", true) && !ihc1.h0(Build.DISPLAY, "sdk_gphone", false) && !u890.j(Build.BOARD, "QC_Reference_Phone") && !nhc1.Y(Build.HOST, "Build", false) && !ihc1.h0(Build.HARDWARE, "goldfish", false) && (!ihc1.h0(Build.BRAND, "generic", false) || !ihc1.h0(Build.DEVICE, "generic", false))) {
                                            ArrayList arrayList3 = new ArrayList(ihc1.Q0(Build.PRODUCT, new String[]{"_"}, 0, 6));
                                            arrayList3.removeAll(p7h.M("sdk", "google", "x86", "64", "vbox86p"));
                                            if (!arrayList3.isEmpty()) {
                                                z7 = false;
                                            }
                                        }
                                        String str11111119 = p7n1.c;
                                        utw0 utw0Var113 = ike1.a;
                                        utw0Var113.y(str11111119);
                                        utw0Var113.o("isProbablyEmulator = " + z7, new Object[0]);
                                        boolValueOf = Boolean.valueOf(z7);
                                        boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                        strA = p7n1.a(application);
                                        if (strA == null) {
                                            str12 = "non valid source";
                                        } else {
                                            iHashCode = strA.hashCode();
                                            if (iHashCode != -1859733809) {
                                                if (iHashCode != -1637701853) {
                                                    if (iHashCode != -1225090538) {
                                                        if (iHashCode == -1046965711 || !strA.equals("com.android.vending")) {
                                                            str12 = "non valid source";
                                                        } else {
                                                            str12 = "Google Play Store";
                                                        }
                                                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "Samsung Galaxy Store";
                                                    }
                                                } else if (strA.equals("com.huawei.appmarket")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Huawei App Gallery";
                                                }
                                            } else if (strA.equals("com.amazon.venezia")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Amazon Appstore";
                                            }
                                        }
                                        str13 = str12;
                                        bool2 = Boolean.TRUE;
                                        throw new Exception("Verifying use of hookup tools");
                                    }
                                    z6 = z3;
                                    z7 = true;
                                    String str111111110 = p7n1.c;
                                    utw0 utw0Var114 = ike1.a;
                                    utw0Var114.y(str111111110);
                                    utw0Var114.o("isProbablyEmulator = " + z7, new Object[0]);
                                    boolValueOf = Boolean.valueOf(z7);
                                    boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                    boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                    strA = p7n1.a(application);
                                    if (strA == null) {
                                        str12 = "non valid source";
                                    } else {
                                        iHashCode = strA.hashCode();
                                        if (iHashCode != -1859733809) {
                                            if (iHashCode != -1637701853) {
                                                if (iHashCode != -1225090538) {
                                                    if (iHashCode == -1046965711) {
                                                        str12 = "non valid source";
                                                    } else {
                                                        str12 = "non valid source";
                                                    }
                                                } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "Samsung Galaxy Store";
                                                }
                                            } else if (strA.equals("com.huawei.appmarket")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Huawei App Gallery";
                                            }
                                        } else if (strA.equals("com.amazon.venezia")) {
                                            str12 = "non valid source";
                                        } else {
                                            str12 = "Amazon Appstore";
                                        }
                                    }
                                    str13 = str12;
                                    bool2 = Boolean.TRUE;
                                    throw new Exception("Verifying use of hookup tools");
                                }
                                str3 = null;
                                str4 = null;
                                str6 = null;
                                str5 = null;
                                boolI = null;
                                fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                if (telephonyManager != null) {
                                    strG = zugVar.g(sugVar, telephonyManager);
                                    strP = p(telephonyManager);
                                    strL = zugVar.l(sugVar, telephonyManager);
                                    strH = zugVar.h(sugVar, telephonyManager);
                                    strK = zugVar.k(application, telephonyManager);
                                    str7 = strG;
                                    str8 = strP;
                                    str9 = strL;
                                    str10 = strH;
                                } else {
                                    str7 = null;
                                    strK = null;
                                    str9 = null;
                                    str10 = null;
                                    str8 = null;
                                }
                                fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                DisplayMetrics displayMetrics113 = application.getResources().getDisplayMetrics();
                                fingerprint.lpt2(new ScreenInfo(displayMetrics113.densityDpi, displayMetrics113.heightPixels, displayMetrics113.widthPixels));
                                DeviceId.CoM4 coM116 = DeviceId.Companion;
                                fingerprint.lpt2(new DeviceInfo(coM116.Lpt5().COM7(), coM116.Lpt5().cOM4(), coM116.Lpt5().COM5(), coM116.Lpt5().COM6(), coM116.Lpt5().Lpt5(), coM116.Lpt5().prN()));
                                fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                fingerprint.Lpt5(Locale.getDefault().getCountry());
                                fingerprint.lpt2(application.getPackageName());
                                strCON = coM116.Lpt5().cON();
                                if (u890.j(strCON, application.getPackageName())) {
                                    strCON = "self provider";
                                } else {
                                    strCON = "self provider";
                                }
                                fingerprint.COM7(strCON);
                                String str111111111 = Build.MANUFACTURER;
                                fingerprint.cON(str111111111);
                                String str111111112 = Build.MODEL;
                                fingerprint.LPT3(str111111112);
                                fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                xugVar = zugVar.h;
                                p7n1Var = zugVar.c;
                                str11 = Build.FINGERPRINT;
                                if (!nhc1.Y(str11, "generic", false)) {
                                    z6 = z3;
                                    z7 = true;
                                } else {
                                    z6 = z3;
                                    z7 = true;
                                }
                                String str111111113 = p7n1.c;
                                utw0 utw0Var115 = ike1.a;
                                utw0Var115.y(str111111113);
                                utw0Var115.o("isProbablyEmulator = " + z7, new Object[0]);
                                boolValueOf = Boolean.valueOf(z7);
                                boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                strA = p7n1.a(application);
                                if (strA == null) {
                                    str12 = "non valid source";
                                } else {
                                    iHashCode = strA.hashCode();
                                    if (iHashCode != -1859733809) {
                                        if (iHashCode != -1637701853) {
                                            if (iHashCode != -1225090538) {
                                                if (iHashCode == -1046965711) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "non valid source";
                                                }
                                            } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Samsung Galaxy Store";
                                            }
                                        } else if (strA.equals("com.huawei.appmarket")) {
                                            str12 = "non valid source";
                                        } else {
                                            str12 = "Huawei App Gallery";
                                        }
                                    } else if (strA.equals("com.amazon.venezia")) {
                                        str12 = "non valid source";
                                    } else {
                                        str12 = "Amazon Appstore";
                                    }
                                }
                                str13 = str12;
                                bool2 = Boolean.TRUE;
                                throw new Exception("Verifying use of hookup tools");
                                displayName = DesugarTimeZone.getTimeZone(id).getDisplayName(false, 0);
                                i2 = i2;
                                i3 = i3;
                            } catch (AssertionError e30) {
                                e = e30;
                                String strM2 = l1d.m("Error while discovering timeZone with: ", e.getLocalizedMessage());
                                AssertionError assertionError2 = e;
                                utw0 utw0Var20 = ike1.a;
                                utw0Var20.y(str);
                                utw0Var20.o(strM2, new Object[0]);
                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", assertionError2.getMessage(), new ErrorMetadata(604, "JVM", "An assertion failed", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                displayName = null;
                            } catch (IllegalArgumentException e31) {
                                e = e31;
                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(603, "JVM", "An illegal argument was passed to a method", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                displayName = null;
                            } catch (NullPointerException e32) {
                                e = e32;
                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(601, "JVM", "An data object was null when it should not have been", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                displayName = null;
                            } catch (RuntimeException e33) {
                                e = e33;
                                r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e.getMessage(), new ErrorMetadata(602, "JVM", "An error occurred during runtime", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                                displayName = null;
                            }
                            if (telephonyManager != null) {
                                strR = zugVar.r(sugVar, telephonyManager);
                                strQ = q(sugVar, application, telephonyManager);
                                i8 = Build.VERSION.SDK_INT;
                                if (i8 < 33) {
                                    simCountryIso = telephonyManager.getSimCountryIso();
                                }
                                if (i8 >= 33) {
                                    simOperator = telephonyManager.getSimOperator();
                                } else {
                                    simOperator = telephonyManager.getSimOperator();
                                }
                                str2 = simOperator;
                                boolI = zugVar.i(telephonyManager);
                                str3 = strR;
                                str4 = strQ;
                                str5 = str2;
                                str6 = simCountryIso;
                                fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
                                if (telephonyManager != null) {
                                    strG = zugVar.g(sugVar, telephonyManager);
                                    strP = p(telephonyManager);
                                    strL = zugVar.l(sugVar, telephonyManager);
                                    strH = zugVar.h(sugVar, telephonyManager);
                                    strK = zugVar.k(application, telephonyManager);
                                    str7 = strG;
                                    str8 = strP;
                                    str9 = strL;
                                    str10 = strH;
                                } else {
                                    str7 = null;
                                    strK = null;
                                    str9 = null;
                                    str10 = null;
                                    str8 = null;
                                }
                                fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
                                DisplayMetrics displayMetrics114 = application.getResources().getDisplayMetrics();
                                fingerprint.lpt2(new ScreenInfo(displayMetrics114.densityDpi, displayMetrics114.heightPixels, displayMetrics114.widthPixels));
                                DeviceId.CoM4 coM117 = DeviceId.Companion;
                                fingerprint.lpt2(new DeviceInfo(coM117.Lpt5().COM7(), coM117.Lpt5().cOM4(), coM117.Lpt5().COM5(), coM117.Lpt5().COM6(), coM117.Lpt5().Lpt5(), coM117.Lpt5().prN()));
                                fingerprint.Com8(Locale.getDefault().toLanguageTag());
                                fingerprint.Lpt5(Locale.getDefault().getCountry());
                                fingerprint.lpt2(application.getPackageName());
                                strCON = coM117.Lpt5().cON();
                                if (u890.j(strCON, application.getPackageName())) {
                                    strCON = "self provider";
                                } else {
                                    strCON = "self provider";
                                }
                                fingerprint.COM7(strCON);
                                String str111111114 = Build.MANUFACTURER;
                                fingerprint.cON(str111111114);
                                String str111111115 = Build.MODEL;
                                fingerprint.LPT3(str111111115);
                                fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
                                xugVar = zugVar.h;
                                p7n1Var = zugVar.c;
                                str11 = Build.FINGERPRINT;
                                if (!nhc1.Y(str11, "generic", false)) {
                                    z6 = z3;
                                    z7 = true;
                                } else {
                                    z6 = z3;
                                    z7 = true;
                                }
                                String str111111116 = p7n1.c;
                                utw0 utw0Var116 = ike1.a;
                                utw0Var116.y(str111111116);
                                utw0Var116.o("isProbablyEmulator = " + z7, new Object[0]);
                                boolValueOf = Boolean.valueOf(z7);
                                boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                                boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
                                strA = p7n1.a(application);
                                if (strA == null) {
                                    str12 = "non valid source";
                                } else {
                                    iHashCode = strA.hashCode();
                                    if (iHashCode != -1859733809) {
                                        if (iHashCode != -1637701853) {
                                            if (iHashCode != -1225090538) {
                                                if (iHashCode == -1046965711) {
                                                    str12 = "non valid source";
                                                } else {
                                                    str12 = "non valid source";
                                                }
                                            } else if (strA.equals("com.sec.android.app.samsungapps")) {
                                                str12 = "non valid source";
                                            } else {
                                                str12 = "Samsung Galaxy Store";
                                            }
                                        } else if (strA.equals("com.huawei.appmarket")) {
                                            str12 = "non valid source";
                                        } else {
                                            str12 = "Huawei App Gallery";
                                        }
                                    } else if (strA.equals("com.amazon.venezia")) {
                                        str12 = "non valid source";
                                    } else {
                                        str12 = "Amazon Appstore";
                                    }
                                }
                                str13 = str12;
                                bool2 = Boolean.TRUE;
                                throw new Exception("Verifying use of hookup tools");
                            }
                            str3 = null;
                            str4 = null;
                            str6 = null;
                            str5 = null;
                            boolValueOf2 = Boolean.valueOf(p7n1Var.a.c(p7n1.d(application)));
                        } catch (Exception e34) {
                            String str20 = p7n1.c;
                            String strValueOf = String.valueOf(e34);
                            utw0 utw0Var21 = ike1.a;
                            utw0Var21.y(str20);
                            utw0Var21.o(strValueOf, new Object[0]);
                            boolValueOf2 = null;
                        }
                        numValueOf = Integer.valueOf((int) (rawOffset5 / 3600000));
                    } catch (AbstractMethodError e35) {
                        String strM3 = l1d.m("Error while discovering timeZone with: ", e35.getLocalizedMessage());
                        utw0 utw0Var22 = ike1.a;
                        utw0Var22.y(str);
                        utw0Var22.o(strM3, new Object[0]);
                        numValueOf = null;
                    }
                    timeZone = TimeZone.getDefault();
                } catch (CloneNotSupportedException e36) {
                    r7n1Var.a(new MobileError(System.currentTimeMillis(), (String) null, "mobile-report", e36.getMessage(), new ErrorMetadata(600, "JVM", "The data object could not be cloned", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null)));
                    timeZone = null;
                }
                numValueOf2 = Integer.valueOf((int) (rawOffset5 / 60000));
            } catch (AbstractMethodError e37) {
                String strM4 = l1d.m("Error while discovering timeZone with: ", e37.getLocalizedMessage());
                utw0 utw0Var23 = ike1.a;
                utw0Var23.y(str);
                utw0Var23.o(strM4, new Object[0]);
                numValueOf2 = null;
            }
            throw new Exception("Verifying use of hookup tools");
        } catch (Exception e38) {
            StackTraceElement[] stackTrace = e38.getStackTrace();
            int length = stackTrace.length;
            int i17 = 0;
            boolean z13 = false;
            int i18 = 0;
            while (i17 < length) {
                StackTraceElement stackTraceElement = stackTrace[i17];
                StackTraceElement[] stackTraceElementArr = stackTrace;
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                    i18++;
                    if (i18 == 2) {
                        utw0 utw0Var24 = ike1.a;
                        utw0Var24.y("HookDetection");
                        utw0Var24.o("Substrate is active on the device.", new Object[0]);
                        i11 = length;
                        z13 = true;
                    } else {
                        i11 = length;
                    }
                } else {
                    i11 = length;
                    if (stackTraceElement.getClassName().equals("com.saurik.substrate.MS$2") && stackTraceElement.getClassName().equals("invoked")) {
                        utw0 utw0Var25 = ike1.a;
                        utw0Var25.y("HookDetection");
                        utw0Var25.o("A method on the stack trace has been hooked using Substrate.", new Object[0]);
                    } else if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && (stackTraceElement.getClassName().equals("main") || stackTraceElement.getClassName().equals("handleHookedMethod"))) {
                        utw0 utw0Var26 = ike1.a;
                        utw0Var26.y("HookDetection");
                        utw0Var26.o("A method on the stack trace has been hooked using Xposed.", new Object[0]);
                    }
                    z13 = true;
                }
                i17++;
                stackTrace = stackTraceElementArr;
                length = i11;
            }
            Boolean boolValueOf5 = Boolean.valueOf(z13);
            SharedPreferences sharedPreferences = p7n1Var.b;
            try {
                try {
                    try {
                        try {
                            try {
                                ZipFile zipFile = new ZipFile(application.getPackageCodePath());
                                long j4 = Build.VERSION.SDK_INT >= 33 ? application.getPackageManager().getPackageInfo(application.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime : application.getPackageManager().getPackageInfo(application.getPackageName(), 0).lastUpdateTime;
                                cnr cnrVar6 = cnrVar2;
                                fingerprint6 = fingerprint2;
                                try {
                                    try {
                                        long jC = p7n1.c(zipFile);
                                        iugVar2 = iugVar;
                                        telephonyManager2 = telephonyManager;
                                        try {
                                            long jB = p7n1.b(zipFile);
                                            cnrVar3 = cnrVar6;
                                            fingerprint7 = fingerprint;
                                            try {
                                                long j5 = sharedPreferences.getLong("crc", 0L);
                                                long j6 = sharedPreferences.getLong("package size", 0L);
                                                long j7 = sharedPreferences.getLong("last update", 0L);
                                                Long lValueOf = Long.valueOf(j7);
                                                if (j4 != j7) {
                                                    lValueOf = null;
                                                }
                                                if (lValueOf != null) {
                                                    Long lValueOf2 = Long.valueOf(jC);
                                                    if (jC == j5) {
                                                        lValueOf2 = null;
                                                    }
                                                    if (lValueOf2 == null) {
                                                        Long lValueOf3 = Long.valueOf(jB);
                                                        if (jB == j6) {
                                                            lValueOf3 = null;
                                                        }
                                                        if (lValueOf3 != null) {
                                                        }
                                                    }
                                                    z8 = true;
                                                    Boolean boolValueOf6 = Boolean.valueOf(z8);
                                                    i9 = Build.VERSION.SDK_INT;
                                                    if (i9 >= 26) {
                                                        if (i9 >= 26 || x74.j(application, "android.permission.REQUEST_INSTALL_PACKAGES") != 0) {
                                                            zCanRequestPackageInstalls = false;
                                                        } else {
                                                            zCanRequestPackageInstalls = application.getPackageManager().canRequestPackageInstalls();
                                                        }
                                                    } else if (Settings.Secure.getInt(application.getContentResolver(), "install_non_market_apps") == 1) {
                                                        zCanRequestPackageInstalls = true;
                                                    } else {
                                                        zCanRequestPackageInstalls = false;
                                                    }
                                                    Boolean boolValueOf7 = Boolean.valueOf(zCanRequestPackageInstalls);
                                                    if (Settings.Global.getInt(application.getContentResolver(), "adb_enabled", 0) == 0) {
                                                        z9 = false;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    Boolean boolValueOf8 = Boolean.valueOf(z9);
                                                    if (Settings.Global.getInt(application.getContentResolver(), "development_settings_enabled", 0) == 0) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = true;
                                                    }
                                                    Boolean boolValueOf9 = Boolean.valueOf(z10);
                                                    Application application2 = zugVar.g.a;
                                                    ix7 ix7Var = new ix7(new lb(application2));
                                                    if (Build.VERSION.SDK_INT >= 30 || ix7Var.k() != 0) {
                                                        z11 = false;
                                                    } else {
                                                        z11 = true;
                                                    }
                                                    Boolean boolValueOf10 = Boolean.valueOf(z11);
                                                    arrayList = new ArrayList();
                                                    i10 = Build.VERSION.SDK_INT;
                                                    if (i10 >= 30 && (packageManager3 = application2.getPackageManager()) != null && packageManager3.hasSystemFeature("android.hardware.fingerprint")) {
                                                        arrayList.add("fingerprint");
                                                    }
                                                    if (i10 >= 30 && (packageManager2 = application2.getPackageManager()) != null && packageManager2.hasSystemFeature("android.hardware.biometrics.face")) {
                                                        arrayList.add("face");
                                                    }
                                                    if (i10 >= 30 && (packageManager = application2.getPackageManager()) != null && packageManager.hasSystemFeature("android.hardware.biometrics.iris")) {
                                                        arrayList.add("iris");
                                                    }
                                                    if (arrayList.isEmpty()) {
                                                        arrayList2 = arrayList;
                                                    } else {
                                                        arrayList2 = null;
                                                    }
                                                    if (arrayList2 != null) {
                                                        arrayList.add("none");
                                                    }
                                                    BiometricProperties biometricProperties = new BiometricProperties(boolValueOf10, (String[]) arrayList.toArray(new String[0]));
                                                    Boolean boolValueOf11 = Boolean.valueOf(UserManager.supportsMultipleUsers());
                                                    string = Settings.Secure.getString(application.getContentResolver(), "default_input_method");
                                                    boolValueOf4 = Boolean.valueOf(((KeyguardManager) application.getSystemService("keyguard")).isKeyguardSecure());
                                                    Float fA = xugVar.a();
                                                    Integer numF = xugVar.f();
                                                    Float fB = xugVar.b();
                                                    Float fD = xugVar.d();
                                                    String strC = xugVar.c();
                                                    if (Build.VERSION.SDK_INT >= 36 || x74.j(application, "android.permission.QUERY_ADVANCED_PROTECTION_MODE") != 0) {
                                                        zJ = false;
                                                    } else {
                                                        AdvancedProtectionManager advancedProtectionManager = (AdvancedProtectionManager) application.getSystemService(AdvancedProtectionManager.class);
                                                        zJ = u890.j(advancedProtectionManager != null ? Boolean.valueOf(advancedProtectionManager.isAdvancedProtectionEnabled()) : null, Boolean.TRUE);
                                                    }
                                                    fingerprint8 = fingerprint7;
                                                    fingerprint8.lpt2(new DeviceProperties(boolValueOf, boolValueOf2, boolValueOf3, str13, bool2, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, biometricProperties, boolValueOf11, string, (Boolean) null, boolValueOf4, fA, numF, fB, fD, strC, Boolean.valueOf(zJ), 8192, (DefaultConstructorMarker) null));
                                                    iug iugVar3 = iugVar2;
                                                    iugVar3.a = cnrVar3;
                                                    iugVar3.b = zugVar;
                                                    fingerprint9 = fingerprint6;
                                                    iugVar3.c = fingerprint9;
                                                    iugVar3.d = fingerprint8;
                                                    iugVar3.e = sugVar;
                                                    iugVar3.f = telephonyManager2;
                                                    iugVar3.g = fingerprint8;
                                                    iugVar3.h = z6;
                                                    iugVar3.t = (int) j3;
                                                    iugVar3.X = i2;
                                                    iugVar3.Y = i3;
                                                    iugVar3.i = z5;
                                                    iugVar3.Z = i7;
                                                    iugVar3.P0 = 2;
                                                    objM = zugVar.m(j3, iugVar3);
                                                    if (objM == d9nVar) {
                                                        return d9nVar;
                                                    }
                                                    zugVar2 = zugVar;
                                                    fingerprint10 = fingerprint8;
                                                    fingerprint11 = fingerprint10;
                                                } else {
                                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                                    editorEdit.putLong("crc", jC);
                                                    editorEdit.putLong("package size", jB);
                                                    editorEdit.putLong("last update", j4);
                                                    editorEdit.apply();
                                                }
                                                zipFile.close();
                                                boolean zD = p7n1.d(application);
                                                if (zD) {
                                                    z8 = false;
                                                } else {
                                                    if (zD) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    z8 = true;
                                                }
                                            } catch (Exception e39) {
                                                e = e39;
                                                String str21 = p7n1.c;
                                                String strM5 = l1d.m("Code Integrity check threw an error: ", e.getMessage());
                                                utw0 utw0Var27 = ike1.a;
                                                utw0Var27.y(str21);
                                                utw0Var27.o(strM5, new Object[0]);
                                                z8 = false;
                                                Boolean boolValueOf12 = Boolean.valueOf(z8);
                                                i9 = Build.VERSION.SDK_INT;
                                                if (i9 >= 26) {
                                                    if (i9 >= 26) {
                                                        zCanRequestPackageInstalls = false;
                                                    } else {
                                                        zCanRequestPackageInstalls = false;
                                                    }
                                                } else if (Settings.Secure.getInt(application.getContentResolver(), "install_non_market_apps") == 1) {
                                                    zCanRequestPackageInstalls = true;
                                                } else {
                                                    zCanRequestPackageInstalls = false;
                                                }
                                                Boolean boolValueOf13 = Boolean.valueOf(zCanRequestPackageInstalls);
                                                if (Settings.Global.getInt(application.getContentResolver(), "adb_enabled", 0) == 0) {
                                                    z9 = false;
                                                } else {
                                                    z9 = true;
                                                }
                                                Boolean boolValueOf14 = Boolean.valueOf(z9);
                                                if (Settings.Global.getInt(application.getContentResolver(), "development_settings_enabled", 0) == 0) {
                                                    z10 = false;
                                                } else {
                                                    z10 = true;
                                                }
                                                Boolean boolValueOf15 = Boolean.valueOf(z10);
                                                Application application3 = zugVar.g.a;
                                                ix7 ix7Var2 = new ix7(new lb(application3));
                                                if (Build.VERSION.SDK_INT >= 30) {
                                                    z11 = false;
                                                } else {
                                                    z11 = false;
                                                }
                                                Boolean boolValueOf16 = Boolean.valueOf(z11);
                                                arrayList = new ArrayList();
                                                i10 = Build.VERSION.SDK_INT;
                                                if (i10 >= 30) {
                                                    arrayList.add("fingerprint");
                                                }
                                                if (i10 >= 30) {
                                                    arrayList.add("face");
                                                }
                                                if (i10 >= 30) {
                                                    arrayList.add("iris");
                                                }
                                                if (arrayList.isEmpty()) {
                                                    arrayList2 = arrayList;
                                                } else {
                                                    arrayList2 = null;
                                                }
                                                if (arrayList2 != null) {
                                                    arrayList.add("none");
                                                }
                                                BiometricProperties biometricProperties2 = new BiometricProperties(boolValueOf16, (String[]) arrayList.toArray(new String[0]));
                                                Boolean boolValueOf17 = Boolean.valueOf(UserManager.supportsMultipleUsers());
                                                string = Settings.Secure.getString(application.getContentResolver(), "default_input_method");
                                                boolValueOf4 = Boolean.valueOf(((KeyguardManager) application.getSystemService("keyguard")).isKeyguardSecure());
                                                Float fA2 = xugVar.a();
                                                Integer numF2 = xugVar.f();
                                                Float fB2 = xugVar.b();
                                                Float fD2 = xugVar.d();
                                                String strC2 = xugVar.c();
                                                if (Build.VERSION.SDK_INT >= 36) {
                                                    zJ = false;
                                                } else {
                                                    zJ = false;
                                                }
                                                fingerprint8 = fingerprint7;
                                                fingerprint8.lpt2(new DeviceProperties(boolValueOf, boolValueOf2, boolValueOf3, str13, bool2, boolValueOf5, boolValueOf12, boolValueOf13, boolValueOf14, boolValueOf15, biometricProperties2, boolValueOf17, string, (Boolean) null, boolValueOf4, fA2, numF2, fB2, fD2, strC2, Boolean.valueOf(zJ), 8192, (DefaultConstructorMarker) null));
                                                iug iugVar4 = iugVar2;
                                                iugVar4.a = cnrVar3;
                                                iugVar4.b = zugVar;
                                                fingerprint9 = fingerprint6;
                                                iugVar4.c = fingerprint9;
                                                iugVar4.d = fingerprint8;
                                                iugVar4.e = sugVar;
                                                iugVar4.f = telephonyManager2;
                                                iugVar4.g = fingerprint8;
                                                iugVar4.h = z6;
                                                iugVar4.t = (int) j3;
                                                iugVar4.X = i2;
                                                iugVar4.Y = i3;
                                                iugVar4.i = z5;
                                                iugVar4.Z = i7;
                                                iugVar4.P0 = 2;
                                                objM = zugVar.m(j3, iugVar4);
                                                if (objM == d9nVar) {
                                                    return d9nVar;
                                                }
                                                zugVar2 = zugVar;
                                                fingerprint10 = fingerprint8;
                                                fingerprint11 = fingerprint10;
                                                fingerprint10.lpt2((Connectivity) objM);
                                                fingerprint11.lpt2(Permissions.Companion.lpt2(zugVar2.a));
                                                return fingerprint9;
                                            }
                                        } catch (Exception e40) {
                                            e = e40;
                                            cnrVar3 = cnrVar6;
                                            fingerprint7 = fingerprint;
                                            String str22 = p7n1.c;
                                            String strM6 = l1d.m("Code Integrity check threw an error: ", e.getMessage());
                                            utw0 utw0Var28 = ike1.a;
                                            utw0Var28.y(str22);
                                            utw0Var28.o(strM6, new Object[0]);
                                            z8 = false;
                                            Boolean boolValueOf18 = Boolean.valueOf(z8);
                                            i9 = Build.VERSION.SDK_INT;
                                            if (i9 >= 26) {
                                                if (i9 >= 26) {
                                                    zCanRequestPackageInstalls = false;
                                                } else {
                                                    zCanRequestPackageInstalls = false;
                                                }
                                            } else if (Settings.Secure.getInt(application.getContentResolver(), "install_non_market_apps") == 1) {
                                                zCanRequestPackageInstalls = true;
                                            } else {
                                                zCanRequestPackageInstalls = false;
                                            }
                                            Boolean boolValueOf19 = Boolean.valueOf(zCanRequestPackageInstalls);
                                            if (Settings.Global.getInt(application.getContentResolver(), "adb_enabled", 0) == 0) {
                                                z9 = false;
                                            } else {
                                                z9 = true;
                                            }
                                            Boolean boolValueOf110 = Boolean.valueOf(z9);
                                            if (Settings.Global.getInt(application.getContentResolver(), "development_settings_enabled", 0) == 0) {
                                                z10 = false;
                                            } else {
                                                z10 = true;
                                            }
                                            Boolean boolValueOf111 = Boolean.valueOf(z10);
                                            Application application4 = zugVar.g.a;
                                            ix7 ix7Var3 = new ix7(new lb(application4));
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                z11 = false;
                                            } else {
                                                z11 = false;
                                            }
                                            Boolean boolValueOf112 = Boolean.valueOf(z11);
                                            arrayList = new ArrayList();
                                            i10 = Build.VERSION.SDK_INT;
                                            if (i10 >= 30) {
                                                arrayList.add("fingerprint");
                                            }
                                            if (i10 >= 30) {
                                                arrayList.add("face");
                                            }
                                            if (i10 >= 30) {
                                                arrayList.add("iris");
                                            }
                                            if (arrayList.isEmpty()) {
                                                arrayList2 = arrayList;
                                            } else {
                                                arrayList2 = null;
                                            }
                                            if (arrayList2 != null) {
                                                arrayList.add("none");
                                            }
                                            BiometricProperties biometricProperties3 = new BiometricProperties(boolValueOf112, (String[]) arrayList.toArray(new String[0]));
                                            Boolean boolValueOf113 = Boolean.valueOf(UserManager.supportsMultipleUsers());
                                            string = Settings.Secure.getString(application.getContentResolver(), "default_input_method");
                                            boolValueOf4 = Boolean.valueOf(((KeyguardManager) application.getSystemService("keyguard")).isKeyguardSecure());
                                            Float fA3 = xugVar.a();
                                            Integer numF3 = xugVar.f();
                                            Float fB3 = xugVar.b();
                                            Float fD3 = xugVar.d();
                                            String strC3 = xugVar.c();
                                            if (Build.VERSION.SDK_INT >= 36) {
                                                zJ = false;
                                            } else {
                                                zJ = false;
                                            }
                                            fingerprint8 = fingerprint7;
                                            fingerprint8.lpt2(new DeviceProperties(boolValueOf, boolValueOf2, boolValueOf3, str13, bool2, boolValueOf5, boolValueOf18, boolValueOf19, boolValueOf110, boolValueOf111, biometricProperties3, boolValueOf113, string, (Boolean) null, boolValueOf4, fA3, numF3, fB3, fD3, strC3, Boolean.valueOf(zJ), 8192, (DefaultConstructorMarker) null));
                                            iug iugVar5 = iugVar2;
                                            iugVar5.a = cnrVar3;
                                            iugVar5.b = zugVar;
                                            fingerprint9 = fingerprint6;
                                            iugVar5.c = fingerprint9;
                                            iugVar5.d = fingerprint8;
                                            iugVar5.e = sugVar;
                                            iugVar5.f = telephonyManager2;
                                            iugVar5.g = fingerprint8;
                                            iugVar5.h = z6;
                                            iugVar5.t = (int) j3;
                                            iugVar5.X = i2;
                                            iugVar5.Y = i3;
                                            iugVar5.i = z5;
                                            iugVar5.Z = i7;
                                            iugVar5.P0 = 2;
                                            objM = zugVar.m(j3, iugVar5);
                                            if (objM == d9nVar) {
                                                return d9nVar;
                                            }
                                            zugVar2 = zugVar;
                                            fingerprint10 = fingerprint8;
                                            fingerprint11 = fingerprint10;
                                            fingerprint10.lpt2((Connectivity) objM);
                                            fingerprint11.lpt2(Permissions.Companion.lpt2(zugVar2.a));
                                            return fingerprint9;
                                        }
                                    } catch (Exception e41) {
                                        e = e41;
                                        iugVar2 = iugVar;
                                        telephonyManager2 = telephonyManager;
                                    }
                                    if (Settings.Global.getInt(application.getContentResolver(), "development_settings_enabled", 0) == 0) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                } catch (Exception unused) {
                                }
                            } catch (Exception e42) {
                                e = e42;
                                cnrVar3 = cnrVar2;
                                fingerprint6 = fingerprint2;
                                iugVar2 = iugVar;
                                telephonyManager2 = telephonyManager;
                            }
                            string = Settings.Secure.getString(application.getContentResolver(), "default_input_method");
                        } catch (Exception unused2) {
                            string = null;
                        }
                        ix7 ix7Var4 = new ix7(new lb(application4));
                        if (Build.VERSION.SDK_INT >= 30) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                    } catch (Exception unused3) {
                    }
                    boolValueOf4 = Boolean.valueOf(((KeyguardManager) application.getSystemService("keyguard")).isKeyguardSecure());
                } catch (Exception unused4) {
                    boolValueOf4 = null;
                }
                if (Settings.Global.getInt(application.getContentResolver(), "adb_enabled", 0) == 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            } catch (Exception unused5) {
            }
            Boolean boolValueOf114 = Boolean.valueOf(z8);
            i9 = Build.VERSION.SDK_INT;
            if (i9 >= 26) {
                if (i9 >= 26) {
                    zCanRequestPackageInstalls = false;
                } else {
                    zCanRequestPackageInstalls = false;
                }
            } else if (Settings.Secure.getInt(application.getContentResolver(), "install_non_market_apps") == 1) {
                zCanRequestPackageInstalls = true;
            } else {
                zCanRequestPackageInstalls = false;
            }
            Boolean boolValueOf115 = Boolean.valueOf(zCanRequestPackageInstalls);
            Boolean boolValueOf116 = Boolean.valueOf(z9);
            Boolean boolValueOf117 = Boolean.valueOf(z10);
            Application application5 = zugVar.g.a;
            Boolean boolValueOf118 = Boolean.valueOf(z11);
            arrayList = new ArrayList();
            i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                arrayList.add("fingerprint");
            }
            if (i10 >= 30) {
                arrayList.add("face");
            }
            if (i10 >= 30) {
                arrayList.add("iris");
            }
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList;
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                arrayList.add("none");
            }
            BiometricProperties biometricProperties4 = new BiometricProperties(boolValueOf118, (String[]) arrayList.toArray(new String[0]));
            Boolean boolValueOf119 = Boolean.valueOf(UserManager.supportsMultipleUsers());
            Float fA4 = xugVar.a();
            Integer numF4 = xugVar.f();
            Float fB4 = xugVar.b();
            Float fD4 = xugVar.d();
            String strC4 = xugVar.c();
            if (Build.VERSION.SDK_INT >= 36) {
                zJ = false;
            } else {
                zJ = false;
            }
            fingerprint8 = fingerprint7;
            fingerprint8.lpt2(new DeviceProperties(boolValueOf, boolValueOf2, boolValueOf3, str13, bool2, boolValueOf5, boolValueOf114, boolValueOf115, boolValueOf116, boolValueOf117, biometricProperties4, boolValueOf119, string, (Boolean) null, boolValueOf4, fA4, numF4, fB4, fD4, strC4, Boolean.valueOf(zJ), 8192, (DefaultConstructorMarker) null));
            iug iugVar6 = iugVar2;
            iugVar6.a = cnrVar3;
            iugVar6.b = zugVar;
            fingerprint9 = fingerprint6;
            iugVar6.c = fingerprint9;
            iugVar6.d = fingerprint8;
            iugVar6.e = sugVar;
            iugVar6.f = telephonyManager2;
            iugVar6.g = fingerprint8;
            iugVar6.h = z6;
            iugVar6.t = (int) j3;
            iugVar6.X = i2;
            iugVar6.Y = i3;
            iugVar6.i = z5;
            iugVar6.Z = i7;
            iugVar6.P0 = 2;
            objM = zugVar.m(j3, iugVar6);
            if (objM == d9nVar) {
                return d9nVar;
            }
            zugVar2 = zugVar;
            fingerprint10 = fingerprint8;
            fingerprint11 = fingerprint10;
        }
        location = (com.ravelin.core.model.Location) objN;
        cnr cnrVar7 = cnrVar4;
        zugVar = zugVar3;
        fingerprint3 = fingerprint4;
        i3 = i6;
        z4 = z2;
        fingerprint2 = fingerprint;
        fingerprint = fingerprint5;
        i4 = i5;
        cnrVar2 = cnrVar7;
        fingerprint3.lpt2(location);
        r7n1Var = zugVar.b;
        sugVar2 = zugVar.d;
        application = zugVar.a;
        i7 = i4;
        str = i;
        if (timeZone != null) {
            id = timeZone.getID();
        } else {
            id = null;
        }
        z5 = z4;
        j3 = j2;
        long rawOffset6 = new GregorianCalendar().getTimeZone().getRawOffset();
        fingerprint.lpt2(new TimezoneInfo(numValueOf, displayName, numValueOf2));
        if (((x6n1) sugVar2).a(application, "android.hardware.telephony")) {
            telephonyManager = (TelephonyManager) application.getApplicationContext().getSystemService("phone");
        } else {
            telephonyManager = null;
        }
        boolI = null;
        fingerprint.lpt2(new CarrierInfo(str3, str4, str6, str5, boolI));
        if (telephonyManager != null) {
            strG = zugVar.g(sugVar, telephonyManager);
            strP = p(telephonyManager);
            strL = zugVar.l(sugVar, telephonyManager);
            strH = zugVar.h(sugVar, telephonyManager);
            strK = zugVar.k(application, telephonyManager);
            str7 = strG;
            str8 = strP;
            str9 = strL;
            str10 = strH;
        } else {
            str7 = null;
            strK = null;
            str9 = null;
            str10 = null;
            str8 = null;
        }
        fingerprint.lpt2(new NetworkInfo(str7, strK, str9, str10, str8));
        DisplayMetrics displayMetrics115 = application.getResources().getDisplayMetrics();
        fingerprint.lpt2(new ScreenInfo(displayMetrics115.densityDpi, displayMetrics115.heightPixels, displayMetrics115.widthPixels));
        DeviceId.CoM4 coM118 = DeviceId.Companion;
        fingerprint.lpt2(new DeviceInfo(coM118.Lpt5().COM7(), coM118.Lpt5().cOM4(), coM118.Lpt5().COM5(), coM118.Lpt5().COM6(), coM118.Lpt5().Lpt5(), coM118.Lpt5().prN()));
        fingerprint.Com8(Locale.getDefault().toLanguageTag());
        fingerprint.Lpt5(Locale.getDefault().getCountry());
        fingerprint.lpt2(application.getPackageName());
        strCON = coM118.Lpt5().cON();
        if (u890.j(strCON, application.getPackageName())) {
            strCON = "self provider";
        } else {
            strCON = "self provider";
        }
        fingerprint.COM7(strCON);
        String str111111117 = Build.MANUFACTURER;
        fingerprint.cON(str111111117);
        String str111111118 = Build.MODEL;
        fingerprint.LPT3(str111111118);
        fingerprint.COM5(String.valueOf(Build.VERSION.SDK_INT));
        xugVar = zugVar.h;
        p7n1Var = zugVar.c;
        str11 = Build.FINGERPRINT;
        if (!nhc1.Y(str11, "generic", false)) {
            z6 = z3;
            z7 = true;
        } else {
            z6 = z3;
            z7 = true;
        }
        String str111111119 = p7n1.c;
        utw0 utw0Var117 = ike1.a;
        utw0Var117.y(str111111119);
        utw0Var117.o("isProbablyEmulator = " + z7, new Object[0]);
        boolValueOf = Boolean.valueOf(z7);
        boolValueOf3 = Boolean.valueOf(Debug.isDebuggerConnected());
        strA = p7n1.a(application);
        if (strA == null) {
            str12 = "non valid source";
        } else {
            iHashCode = strA.hashCode();
            if (iHashCode != -1859733809) {
                if (iHashCode != -1637701853) {
                    if (iHashCode != -1225090538) {
                        if (iHashCode == -1046965711) {
                            str12 = "non valid source";
                        } else {
                            str12 = "non valid source";
                        }
                    } else if (strA.equals("com.sec.android.app.samsungapps")) {
                        str12 = "non valid source";
                    } else {
                        str12 = "Samsung Galaxy Store";
                    }
                } else if (strA.equals("com.huawei.appmarket")) {
                    str12 = "non valid source";
                } else {
                    str12 = "Huawei App Gallery";
                }
            } else if (strA.equals("com.amazon.venezia")) {
                str12 = "non valid source";
            } else {
                str12 = "Amazon Appstore";
            }
        }
        str13 = str12;
        bool2 = Boolean.TRUE;
    }

    public final String r(sug sugVar, TelephonyManager telephonyManager) {
        CharSequence simCarrierIdName;
        CharSequence simCarrierIdName2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if (!((x6n1) sugVar).a(this.a, "android.hardware.telephony.subscription") || (simCarrierIdName2 = telephonyManager.getSimCarrierIdName()) == null) {
                return null;
            }
            return simCarrierIdName2.toString();
        }
        if (28 > i2 || i2 >= 33 || (simCarrierIdName = telephonyManager.getSimCarrierIdName()) == null) {
            return null;
        }
        return simCarrierIdName.toString();
    }
}
