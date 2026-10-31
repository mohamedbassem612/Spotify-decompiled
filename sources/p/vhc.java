package p;

import android.os.Bundle;
import android.os.Trace;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class vhc implements tax, yl01, c290, Predicate, au11 {
    public final /* synthetic */ byte a;

    public vhc(x3x0 x3x0Var) {
        this.a = (byte) 20;
    }

    public static void a(String str, int i) {
        mif1.d(str, i);
    }

    public static void b(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static zzd0 d(zzd0 zzd0Var, int i, Boolean bool) {
        pwd0 pwd0Var = zzd0Var.b;
        j3s0 j3s0Var = pwd0Var.b;
        j3s0 j3s0Var2 = j3s0Var instanceof j3s0 ? j3s0Var : null;
        if (j3s0Var2 == null) {
            return zzd0Var;
        }
        if (i == 0) {
            i = j3s0Var2.e;
        }
        return zzd0.a(zzd0Var, pwd0.a(pwd0Var, j3s0.a(j3s0Var2, i, bool != null ? bool.booleanValue() : j3s0Var2.f, 15), (vkf) null, 13), false, (tle1) null, false, 32765);
    }

    public static Bundle e(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if ((i & 1) != 0) {
            z = false;
        }
        Integer num = (i & 2) != 0 ? null : 2131101285;
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        if ((i & 32) != 0) {
            z5 = false;
        }
        Bundle bundleG = pzm.g("embedded_in_bottom_sheet", z);
        if (num != null) {
            bundleG.putInt("background_color_override", num.intValue());
        }
        bundleG.putBoolean("hide_add_to_element", z2);
        bundleG.putBoolean("navigation_allowed", z3);
        bundleG.putBoolean("large_screen_layout_enabled", z4);
        bundleG.putBoolean("emits_pane_events", z5);
        return bundleG;
    }

    public static x6s g(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new x6s(httpURLConnection);
    }

    public static x9a0 h() {
        return x9a0.d;
    }

    public static Next j(h151 h151Var) {
        return h151Var.a ? Next.a(Collections.singleton(new ax41(h151Var.b))) : Next.j();
    }

    public static ij81 m(int i) {
        return new ij81(i, (byte) 20);
    }

    public static boolean n() {
        return mif1.g();
    }

    public static List p(int i, List list) {
        Integer num;
        ArrayList<peo> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            num = null;
            peo peoVar = null;
            if (!it.hasNext()) {
                break;
            }
            iyl1 iyl1Var = (iyl1) it.next();
            Integer num2 = iyl1Var.b;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                peoVar = new peo(iyl1Var, iIntValue, iIntValue >= 0 ? iIntValue : Math.max(0, i + iIntValue));
            }
            if (peoVar != null) {
                arrayList.add(peoVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((peo) obj).b >= 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Integer numValueOf = Integer.valueOf(((peo) it2.next()).c);
            loop2: while (true) {
                num = numValueOf;
                do {
                    if (!it2.hasNext()) {
                        break loop2;
                    }
                    numValueOf = Integer.valueOf(((peo) it2.next()).c);
                } while (num.compareTo(numValueOf) >= 0);
            }
        }
        int iIntValue2 = num != null ? num.intValue() : 0;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        for (peo peoVar2 : arrayList) {
            int i2 = peoVar2.b;
            if (i2 < 0 && peoVar2.c <= iIntValue2) {
                peoVar2 = new peo(peoVar2.a, i2, iIntValue2 + 1);
            }
            arrayList3.add(peoVar2);
        }
        return o7h.a1(arrayList3, new p0d((byte) 19));
    }

    public static void q(xax xaxVar, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        xaxVar.c.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }

    public void c(xax xaxVar) {
        StringBuilder sb = new StringBuilder();
        while (xaxVar.b()) {
            char cA = xaxVar.a();
            xaxVar.d++;
            int iF = f(cA, sb);
            int length = xaxVar.c.length() + ((sb.length() / 3) << 1);
            xaxVar.c(length);
            int i = xaxVar.f.b - length;
            if (!xaxVar.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length2 = sb.length();
                    sb.delete(length2 - iF, length2);
                    xaxVar.d--;
                    iF = f(xaxVar.a(), sb2);
                    xaxVar.f = null;
                }
                while (sb.length() % 3 == 1 && ((iF <= 3 && i != 1) || iF > 3)) {
                    int length3 = sb.length();
                    sb.delete(length3 - iF, length3);
                    xaxVar.d--;
                    iF = f(xaxVar.a(), sb2);
                    xaxVar.f = null;
                }
                break;
            }
            if (sb.length() % 3 == 0) {
                if (eko1.A(xaxVar.d, i(), xaxVar.a) != i()) {
                    xaxVar.e = 0;
                    break;
                }
            }
        }
        l(xaxVar, sb);
    }

    public Object convert(int i) {
        pg01 pg01Var = null;
        switch (this.a) {
            case 9:
                moz mozVarA = moz.a(i);
                return mozVarA == null ? moz.f : mozVarA;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                rl10 rl10VarA = rl10.a(i);
                return rl10VarA == null ? rl10.h : rl10VarA;
            case 22:
                if (i == 0) {
                    pg01Var = xv11.b;
                } else if (i == 1) {
                    pg01Var = xv11.c;
                } else if (i == 2) {
                    pg01Var = xv11.d;
                }
                return pg01Var == null ? xv11.e : pg01Var;
            default:
                switch (i) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        pg01Var = pg01.b;
                        break;
                    case 1:
                        pg01Var = pg01.c;
                        break;
                    case 2:
                        pg01Var = pg01.d;
                        break;
                    case 3:
                        pg01Var = pg01.e;
                        break;
                    case 4:
                        pg01Var = pg01.f;
                        break;
                    case 5:
                        pg01Var = pg01.g;
                        break;
                    case 6:
                        pg01Var = pg01.h;
                        break;
                    case 7:
                        pg01Var = pg01.i;
                        break;
                    case 8:
                        pg01Var = pg01.t;
                        break;
                }
                return pg01Var == null ? pg01.X : pg01Var;
        }
    }

    public int f(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return f((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public a8b0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    public int i() {
        return 1;
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

    public void l(xax xaxVar, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int length3 = xaxVar.c.length() + length;
        xaxVar.c(length3);
        int i = xaxVar.f.b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                q(xaxVar, sb);
            }
            if (xaxVar.b()) {
                xaxVar.d((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                q(xaxVar, sb);
            }
            if (xaxVar.b()) {
                xaxVar.d((char) 254);
            }
            xaxVar.d--;
        } else {
            if (length2 != 0) {
                eg.m("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                q(xaxVar, sb);
            }
            if (i > 0 || xaxVar.b()) {
                xaxVar.d((char) 254);
            }
        }
        xaxVar.e = 0;
    }

    public boolean o(String str) {
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
            return true;
        }
        return (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false)) || xrm1.a(str);
    }

    public boolean test(Object obj) {
        int i = ((m3x0) obj).k1;
        return i == 3 || i == 4;
    }
}
