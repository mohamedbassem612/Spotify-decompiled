package p;

import android.content.res.Resources;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.firebase.components.ComponentRegistrar;
import com.spotify.base.java.logging.Logger;
import com.spotify.share.file.api.bitmapconverter.CompressFileException;
import com.spotify.share.file.api.files.CreateFileException;
import com.spotify.support.assertion.Assertion;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class twb implements Predicate, d1i, fsc1, bj90, egp0, BiFunction, Function, au11, xqg {
    public final /* synthetic */ byte a;

    public static final String d(Resources resources, long j, boolean z, boolean z2) {
        Locale locale = ggv.b;
        long j2 = j % 60;
        long j3 = z ? j2 : 0L;
        long j4 = j / 60;
        if (!z && j2 > 0) {
            j4++;
        }
        long j5 = j4 % 60;
        long j6 = j4 / 60;
        StringBuilder sb = new StringBuilder(0);
        if (j6 > 0) {
            sb.append(resources.getString(2131963200, Long.valueOf(j6)));
        }
        if (j6 > 0 && j5 > 0) {
            sb.append(' ');
        }
        if (j5 > 0) {
            sb.append(resources.getString(2131963201, Long.valueOf(j5)));
        }
        if ((j6 > 0 || j5 > 0) && j3 > 0) {
            sb.append(' ');
        }
        if (j3 > 0) {
            sb.append(resources.getString(2131963202, Long.valueOf(j3)));
        }
        String string = sb.toString();
        return z2 ? string.toUpperCase(ggv.b) : string;
    }

    public static final String f(long j) {
        Locale locale = ggv.b;
        return String.format(ggv.b, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
    }

    public static hg71 g(String str, k771 k771Var, Throwable th, o571 o571Var, p371 p371Var, ou80 ou80Var) {
        String strP = e9p1.p(th);
        String strL = e9p1.l(th);
        yy61 yy61Var = null;
        if (p371Var != null) {
            if (p371Var instanceof g9c1) {
                yy61Var = yy61.f;
            } else if (p371Var instanceof f9c1) {
                yy61Var = yy61.e;
            } else if (p371Var instanceof h9c1) {
                yy61Var = yy61.g;
            } else if (p371Var instanceof pz70) {
                yy61Var = yy61.d;
            } else {
                boolean z = p371Var instanceof a6j0;
                yy61 yy61Var2 = yy61.b;
                if (z) {
                    String str2 = ((a6j0) p371Var).b;
                    if (str2 != null && !ihc1.y0(str2)) {
                        yy61Var = yy61.c;
                    }
                } else if (!(p371Var instanceof vkc0)) {
                    eg.o();
                    return null;
                }
                yy61Var = yy61Var2;
            }
        }
        return new hg71(o571Var, new oe71(str, yy61Var, strP, strL, k771Var), p371Var, (String) null, (Integer) null, (q6q0) null, ou80Var);
    }

    public static hg71 h(Throwable th, String str, o571 o571Var, p371 p371Var, ou80 ou80Var) throws Throwable {
        k771 k771Var;
        Logger.e(th, "Error performing share action", new Object[0]);
        if (th instanceof Assertion.RecoverableAssertionError) {
            throw th;
        }
        if (th instanceof CreateFileException) {
            k771Var = k771.e;
        } else if (th instanceof CompressFileException) {
            k771Var = k771.f;
        } else {
            k771Var = th instanceof IllegalArgumentException ? k771.X : k771.d;
        }
        return g(str, k771Var, th, o571Var, p371Var, ou80Var);
    }

    public static long i() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static int j(y0o0 y0o0Var) {
        if (y0o0Var.equals(s0o0.a)) {
            return 1;
        }
        if (y0o0Var.equals(u0o0.a)) {
            return 4;
        }
        if (y0o0Var.equals(x0o0.a)) {
            return 9;
        }
        if (y0o0Var.equals(v0o0.a)) {
            return 7;
        }
        if (y0o0Var.equals(w0o0.a)) {
            return 8;
        }
        if (!(y0o0Var instanceof t0o0)) {
            eg.o();
            return 0;
        }
        switch (l1d.C(((t0o0) y0o0Var).a)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 3;
            case 1:
                return 10;
            case 2:
            case 3:
            case 4:
            case 5:
                return 6;
            case 6:
                return 2;
            case 7:
                return 5;
            default:
                eg.o();
                return 0;
        }
    }

    public static void l(xkg0 xkg0Var, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        xkg0Var.put(str, str2);
    }

    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (vzh vzhVar : componentRegistrar.getComponents()) {
            String str = vzhVar.a;
            if (str != null) {
                uk4 uk4Var = new uk4(str, vzhVar, (byte) 9);
                Set set = vzhVar.b;
                Set set2 = vzhVar.c;
                byte b = vzhVar.d;
                boolean z = vzhVar.e;
                vzhVar = new vzh(str, set, set2, b, z ? 1 : 0, uk4Var, vzhVar.g);
            }
            arrayList.add(vzhVar);
        }
        return arrayList;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 19:
                l0l l0lVar = (l0l) obj;
                return !l0lVar.l() ? spq0.d(l0lVar.getName()) : j5.a;
            default:
                throw td6.k(obj);
        }
    }

    public long b() {
        return System.currentTimeMillis();
    }

    @Override // p.bj90
    public int c(uv11 uv11Var) {
        Integer numC0;
        String str = (String) uv11Var.e.get("item_count");
        if (str == null || (numC0 = nhc1.c0(str)) == null) {
            return 0;
        }
        if (numC0.intValue() < 0) {
            numC0 = null;
        }
        if (numC0 != null) {
            return numC0.intValue();
        }
        return 0;
    }

    public hfp1 e(Object obj) {
        return o0c.z(Boolean.TRUE);
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return gu11.a;
        }
        if (fe00Var.equals(ce00.a)) {
            return iu11.a;
        }
        return null;
    }

    public boolean test(Object obj) {
        String str;
        j78 j78Var = (j78) obj;
        String str2 = j78Var.a;
        return (str2 == null || str2.length() == 0 || (str = j78Var.b) == null || str.length() == 0) ? false : true;
    }

    public /* synthetic */ twb(Object obj, byte b) {
        this.a = b;
    }

    public /* synthetic */ twb(byte b) {
        this.a = b;
    }

    public Object apply(Object obj, Object obj2) {
        hvq0 hvq0Var = (hvq0) obj;
        return ((Boolean) obj2).booleanValue() ? new hvq0(ivq0.b, hvq0Var.b) : hvq0Var;
    }
}
