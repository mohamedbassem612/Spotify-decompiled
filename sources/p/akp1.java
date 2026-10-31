package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class akp1 implements Predicate, Function {
    public static final akp1 c;
    public static final akp1 d;
    public static final akp1 e;
    public static final akp1 f;
    public final /* synthetic */ byte a;
    public String b;

    static {
        byte b = 0;
        c = new akp1("TINK", b);
        d = new akp1("CRUNCHY", b);
        e = new akp1("LEGACY", b);
        f = new akp1("NO_PREFIX", b);
    }

    public akp1(zo8 zo8Var, String str) {
        this.a = (byte) 2;
        this.b = str;
    }

    public synchronized String a(Context context) {
        String str;
        try {
            str = this.b;
            if (str == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                str = installerPackageName;
                this.b = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return "".equals(str) ? null : this.b;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                String str = this.b;
                xwn xwnVar = new xwn(str);
                bb9 bb9Var = ((uv00) obj).a(bb9.class, str).b;
                if (bb9Var == null) {
                    eg.m("Failed to retrieve available releases");
                    return null;
                }
                ArrayList arrayList = bb9Var.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = ((ab9) it.next()).a;
                    arrayList2.add(new ux11(str2, str2));
                }
                ArrayList arrayList3 = new ArrayList();
                int i = 0;
                for (Object obj2 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    r7h.W(p7h.M(new xx11[]{(xx11) obj2, new vx11(String.valueOf(i))}), arrayList3);
                    i = i2;
                }
                return new yw11(xwnVar, w7x.a, o7h.l0(1, arrayList3));
            case 3:
                Map map = (Map) obj;
                String str3 = this.b;
                if (!map.containsKey(str3)) {
                    hhg1.f(l1d.m("No episode found matching uri: ", str3));
                    return null;
                }
                Object obj3 = map.get(str3);
                obj3.getClass();
                return (i1z) obj3;
            case 4:
                eww0 eww0Var = (eww0) obj;
                return new myv(this.b, (String) null, eww0Var.b, eww0Var.f, eww0Var.l, eww0Var.g, (String) null, (String) null, Boolean.valueOf(eww0Var.n));
            case 5:
            case 6:
            default:
                return ((uv00) obj).a(d7u0.class, this.b);
            case 7:
                f7h f7hVar = (f7h) ((Map) obj).get(this.b);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 8:
                String str4 = this.b;
                i1z i1zVar = (i1z) ((Map) obj).get(str4);
                return i1zVar != null ? Maybe.e(i1z.a(i1zVar, str4)) : MaybeEmpty.a;
            case 9:
                return Boolean.valueOf(((String) obj).equals(this.b));
            case 10:
                String str5 = this.b;
                i1z i1zVar2 = (i1z) ((Map) obj).get(str5);
                i1z i1zVarA = i1zVar2 != null ? i1z.a(i1zVar2, str5) : null;
                return i1zVarA != null ? Maybe.e(i1zVarA) : MaybeEmpty.a;
        }
    }

    public q41 b(a11 a11Var) {
        return new q41(new b41(this.b, true), (s31) null, a11Var);
    }

    public boolean test(Object obj) {
        ti3 ti3Var = (vi3) obj;
        String str = this.b;
        if (ti3Var instanceof ti3) {
            return ti3Var.a.equals(str);
        }
        if (ti3Var instanceof ri3) {
            return ((ri3) ti3Var).a.equals(str);
        }
        if (ti3Var instanceof ui3) {
            return ((ui3) ti3Var).a.equals(str);
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ akp1(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public akp1() {
        this.a = (byte) 6;
    }
}
