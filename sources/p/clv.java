package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.playlist.ai.creation.v2.GetPusherMessageResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class clv implements BiFunction, Predicate, Function, wqn0, h5a {
    public static final clv c = new clv();
    public static final String[] d = {"standard", "accelerate", "decelerate", "linear"};
    public static final clv e;
    public static final clv f;
    public static final clv g;
    public static final clv h;
    public static final clv i;
    public static final clv t;
    public final /* synthetic */ byte a;
    public String b;

    static {
        byte b = 1;
        e = new clv("UNKNOWN_PREFIX", b);
        f = new clv("TINK", b);
        g = new clv("LEGACY", b);
        h = new clv("RAW", b);
        i = new clv("CRUNCHY", b);
        t = new clv("WITH_ID_REQUIREMENT", b);
    }

    public clv(String str) {
        this.a = (byte) 10;
        this.b = str;
        n57.e("Unknown navigable entity: ".concat(str));
    }

    public static clv d(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new blv(str);
        }
        if (str.startsWith("spline")) {
            avb1 avb1Var = new avb1();
            avb1Var.b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i2 = 0;
            while (iIndexOf2 != -1) {
                dArr[i2] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i2++;
            }
            dArr[i2] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i2 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i3 = 0; i3 < dArrCopyOf.length; i3++) {
                double d3 = dArrCopyOf[i3];
                int i4 = i3 + length2;
                dArr2[i4][0] = d3;
                double d4 = ((double) i3) * d2;
                dArr3[i4] = d4;
                if (i3 > 0) {
                    int i5 = (length2 * 2) + i3;
                    dArr2[i5][0] = d3 + 1.0d;
                    dArr3[i5] = d4 + 1.0d;
                    int i6 = i3 - 1;
                    dArr2[i6][0] = (d3 - 1.0d) - d2;
                    dArr3[i6] = (d4 - 1.0d) - d2;
                }
            }
            qjm0 qjm0Var = new qjm0(dArr3, dArr2);
            System.out.println(" 0 " + qjm0Var.m(0.0d));
            System.out.println(" 1 " + qjm0Var.m(1.0d));
            avb1Var.X = qjm0Var;
            return avb1Var;
        }
        if (str.startsWith("Schlick")) {
            wm41 wm41Var = new wm41();
            wm41Var.b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            wm41Var.X = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i7 = iIndexOf4 + 1;
            wm41Var.Y = Double.parseDouble(str.substring(i7, str.indexOf(44, i7)).trim());
            return wm41Var;
        }
        switch (str) {
            case "accelerate":
                return new blv("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new blv("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new blv("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new blv("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new blv("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new blv("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(d));
                return c;
        }
    }

    public String a() {
        return "unknown";
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 java.lang.Object, still in use, count: 2, list:
          (r0v9 java.lang.Object) from 0x00bf: PHI (r0 I:??) = (r0v6 java.lang.Object), (r0v9 java.lang.Object) binds: [B:40:0x00be, B:75:0x00bf] A[DONT_GENERATE, DONT_INLINE]
          (r0v9 java.lang.Object) from 0x00b3: CHECK_CAST (p.qfd) (r0v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.clv.apply(java.lang.Object):java.lang.Object");
    }

    public double c(double d2) {
        return 1.0d;
    }

    public af5 g(x340 x340Var) {
        x340Var.i0(-1074197378);
        String str = this.b;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        int length = str.length();
        uwr uwrVar = cbx.a;
        arrayListM.add(new xe5(0, length, 8, new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).j.a.c, cbx.d(x340Var).j.a.d, (FontSynthesis) null, cbx.d(x340Var).j.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490), null));
        sb.append(str);
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
        }
        af5 af5Var = new af5(string, arrayList);
        x340Var.r(false);
        return af5Var;
    }

    public String getUri() {
        return this.b;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return u890.j(((GetPusherMessageResponse) obj).getSessionId(), this.b);
            default:
                return ((String) obj).equals(this.b);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return super.toString();
        }
    }

    public clv() {
        this.a = (byte) 0;
        this.b = "identity";
    }

    public /* synthetic */ clv(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public double b(double d2) {
        return d2;
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0(((uv00) obj).a(tlr0.class, this.b).b, (List) obj2);
    }
}
