package p;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mcn1 implements Function, Function4 {
    public static final mcn1 c;
    public static final mcn1 d;
    public static final mcn1 e;
    public final /* synthetic */ byte a;
    public final String b;

    static {
        byte b = 0;
        c = new mcn1("ML_DSA_44", b);
        d = new mcn1("ML_DSA_65", b);
        e = new mcn1("ML_DSA_87", b);
    }

    public mcn1(String str) {
        this.a = (byte) 13;
        this.b = l1d.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = gvg.h(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return f4i1.f(str, " : ", str2);
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        spq0 spq0Var = (spq0) obj;
        spq0 spq0Var2 = (spq0) obj2;
        spq0 spq0Var3 = (spq0) obj3;
        spq0 spq0Var4 = (spq0) obj4;
        boolean zC = spq0Var.c();
        String str = this.b;
        if (zC && u890.j(((l3c1) spq0Var.b()).getId(), str)) {
            return spq0Var;
        }
        if (spq0Var2.c() && u890.j(((l3c1) spq0Var2.b()).getId(), str)) {
            return spq0Var2;
        }
        if (spq0Var3.c() && u890.j(((l3c1) spq0Var3.b()).getId(), str)) {
            return spq0Var3;
        }
        return (spq0Var4.c() && u890.j(((l3c1) spq0Var4.b()).getId(), str)) ? spq0Var4 : j5.a;
    }

    public wqy a(qxc0 qxc0Var) {
        x7i1 x7i1Var;
        String str = this.b;
        return new wqy((String) null, true, true, true, true, true, true, false, (p860) null, (ugo0) null, ((qxc0Var == null || (x7i1Var = qxc0Var.t) == null || !x7i1Var.b) && !str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) ? b821.a : new a821(str), (String) null, (ok51) null, false, 15233);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
          (r3v4 java.lang.Object) from 0x009c: PHI (r3 I:??) = (r3v1 java.lang.Object), (r3v4 java.lang.Object) binds: [B:40:0x009b, B:65:0x009c] A[DONT_GENERATE, DONT_INLINE]
          (r3v4 java.lang.Object) from 0x0094: CHECK_CAST (p.po90) (r3v4 java.lang.Object)
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
    public java.lang.Object apply(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mcn1.apply(java.lang.Object):java.lang.Object");
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            d(this.b, str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            d(this.b, str, objArr);
        }
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mcn1(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public mcn1(Context context) {
        this.a = (byte) 6;
        this.b = context.getString(2131961481);
    }

    public mcn1(String str, wqg wqgVar) {
        this.a = (byte) 3;
        this.b = str;
    }
}
