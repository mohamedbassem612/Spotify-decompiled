package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vnn0 {
    public static final /* synthetic */ int X = 0;
    public final String a;
    public don0 b;
    public String c;
    public CharSequence d;
    public final ArrayList e;
    public final ina1 f;
    public final LinkedHashMap g;
    public int h;
    public String i;
    public idd1 t;

    static {
        new LinkedHashMap();
    }

    public vnn0(mzn0 mzn0Var) {
        LinkedHashMap linkedHashMap = rzn0.b;
        this.a = rzn1.u(mzn0Var.getClass());
        this.e = new ArrayList();
        this.f = new ina1(0);
        this.g = new LinkedHashMap();
    }

    public final void b(snn0 snn0Var) {
        ArrayList arrayListN = m5n1.N(this.g, new unn0(snn0Var, (byte) 0));
        if (arrayListN.isEmpty()) {
            this.e.add(snn0Var);
        } else {
            bhn0.n("Deep link ", snn0Var.a, " can't be used to open destination ", this, ".\nFollowing required arguments are missing: ", arrayListN);
        }
    }

    public final Bundle c(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.g;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            dnn0 dnn0Var = (dnn0) entry.getValue();
            if (dnn0Var.c && (obj = dnn0Var.e) != null) {
                dnn0Var.a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                dnn0 dnn0Var2 = (dnn0) entry2.getValue();
                boolean z = dnn0Var2.d;
                apn0 apn0Var = dnn0Var2.a;
                if (!z) {
                    if (dnn0Var2.b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                        try {
                            apn0Var.a(bundle2, str2);
                        } catch (ClassCastException unused) {
                        }
                    }
                    ncn0.g(l1d.t("Wrong argument type for '", str2, "' in argument bundle. "), apn0Var.b(), " expected.");
                    return null;
                }
            }
        }
        return bundle2;
    }

    public final bnn0 d(int i) {
        ina1 ina1Var = this.f;
        bnn0 bnn0Var = ina1Var.g() == 0 ? null : (bnn0) dio1.r(ina1Var, i);
        if (bnn0Var != null) {
            return bnn0Var;
        }
        don0 don0Var = this.b;
        if (don0Var != null) {
            return don0Var.d(i);
        }
        return null;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof vnn0)) {
                vnn0 vnn0Var = (vnn0) obj;
                ina1 ina1Var = vnn0Var.f;
                LinkedHashMap linkedHashMap = vnn0Var.g;
                boolean zEquals = this.e.equals(vnn0Var.e);
                ina1 ina1Var2 = this.f;
                if (ina1Var2.g() != ina1Var.g()) {
                    z = false;
                    break;
                }
                Iterator it = z561.Q(new jna1(ina1Var2, (byte) 1)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!u890.j(dio1.r(ina1Var2, iIntValue), dio1.r(ina1Var, iIntValue))) {
                        z = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap2 = this.g;
                if (linkedHashMap2.size() != linkedHashMap.size()) {
                    z2 = false;
                    break;
                }
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!linkedHashMap.containsKey(entry.getKey()) || !u890.j(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (this.h != vnn0Var.h || !u890.j(this.i, vnn0Var.i) || !zEquals || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:98:0x0208  */
    public tnn0 f(kqi0 kqi0Var) {
        int i;
        tnn0 tnn0Var;
        int i2;
        List listX;
        List listD1;
        List listX2;
        int i3;
        this = this;
        ArrayList<snn0> arrayList = this.e;
        Bundle bundle = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        tnn0 tnn0Var2 = null;
        for (snn0 snn0Var : arrayList) {
            Uri uri = (Uri) kqi0Var.b;
            LinkedHashMap linkedHashMap = this.g;
            Bundle bundleC = uri != null ? snn0Var.c(uri, linkedHashMap) : bundle;
            String str = snn0Var.a;
            int size = (uri == null || str == null) ? 0 : o7h.v0(uri.getPathSegments(), Uri.parse(str).getPathSegments()).size();
            String str2 = (String) kqi0Var.d;
            boolean z = str2 != null && str2.equals(snn0Var.b);
            String str3 = (String) kqi0Var.c;
            if (str3 != null) {
                String str4 = snn0Var.c;
                if (str4 != null) {
                    Pattern pattern = (Pattern) snn0Var.o.getValue();
                    pattern.getClass();
                    if (pattern.matcher(str3).matches()) {
                        Pattern patternCompile = Pattern.compile("/");
                        ihc1.N0(0);
                        Matcher matcher = patternCompile.matcher(str4);
                        if (matcher.find()) {
                            ArrayList arrayList2 = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList2.add(str4.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList2.add(str4.subSequence(iEnd, str4.length()).toString());
                            listX = arrayList2;
                        } else {
                            listX = k4p1.x(str4.toString());
                        }
                        boolean zIsEmpty = listX.isEmpty();
                        List listD2 = z6x.a;
                        if (zIsEmpty) {
                            listD1 = listD2;
                            break;
                        }
                        ListIterator listIterator = listX.listIterator(listX.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                listD1 = listD2;
                                break;
                            }
                            if (((String) listIterator.previous()).length() != 0) {
                                listD1 = o7h.d1(listX, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        String str5 = (String) listD1.get(0);
                        String str6 = (String) listD1.get(1);
                        Pattern patternCompile2 = Pattern.compile("/");
                        ihc1.N0(0);
                        Matcher matcher2 = patternCompile2.matcher(str3);
                        if (matcher2.find()) {
                            ArrayList arrayList3 = new ArrayList(10);
                            int iEnd2 = 0;
                            do {
                                arrayList3.add(str3.subSequence(iEnd2, matcher2.start()).toString());
                                iEnd2 = matcher2.end();
                            } while (matcher2.find());
                            arrayList3.add(str3.subSequence(iEnd2, str3.length()).toString());
                            listX2 = arrayList3;
                        } else {
                            listX2 = k4p1.x(str3.toString());
                        }
                        if (listX2.isEmpty()) {
                            i3 = 1;
                            break;
                        }
                        ListIterator listIterator2 = listX2.listIterator(listX2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                i3 = 1;
                                break;
                            }
                            if (((String) listIterator2.previous()).length() != 0) {
                                i3 = 1;
                                listD2 = o7h.d1(listX2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                        List list = listD2;
                        String str7 = (String) list.get(0);
                        String str8 = (String) list.get(i3);
                        i2 = u890.j(str5, str7) ? 2 : 0;
                        if (u890.j(str6, str8)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                i = i2;
            } else {
                i = -1;
            }
            if (bundleC != 0) {
                tnn0Var = new tnn0(this, bundleC, snn0Var.f135p, size, z, i);
                if (tnn0Var2 != null || tnn0Var.compareTo(tnn0Var2) > 0) {
                    bundle = null;
                    tnn0Var2 = tnn0Var;
                } else {
                    bundle = null;
                }
            } else {
                if (z || i > -1) {
                    Bundle bundle2 = new Bundle();
                    if (uri != null) {
                        Pattern pattern2 = (Pattern) snn0Var.f.getValue();
                        Matcher matcher3 = pattern2 != null ? pattern2.matcher(uri.toString()) : null;
                        if (matcher3 != null && matcher3.matches()) {
                            snn0Var.d(matcher3, bundle2, linkedHashMap);
                            if (((Boolean) snn0Var.g.getValue()).booleanValue()) {
                                snn0Var.e(uri, bundle2, linkedHashMap);
                            }
                        }
                    }
                    if (m5n1.N(linkedHashMap, new zcr(bundle2, (byte) 2)).isEmpty()) {
                        tnn0Var = new tnn0(this, bundleC, snn0Var.f135p, size, z, i);
                        if (tnn0Var2 != null) {
                        }
                        bundle = null;
                        tnn0Var2 = tnn0Var;
                    }
                }
                bundle = null;
            }
        }
        return tnn0Var2;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.h * 31;
        String str = this.i;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (snn0 snn0Var : this.e) {
            int i2 = iHashCode * 31;
            String str2 = snn0Var.a;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = snn0Var.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = snn0Var.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        int i3 = 0;
        while (true) {
            ina1 ina1Var = this.f;
            if (i3 >= ina1Var.g()) {
                break;
            }
            int i4 = i3 + 1;
            bnn0 bnn0Var = (bnn0) ina1Var.h(i3);
            int i5 = ((iHashCode * 31) + bnn0Var.a) * 31;
            qon0 qon0Var = bnn0Var.b;
            iHashCode = i5 + (qon0Var != null ? qon0Var.hashCode() : 0);
            Bundle bundle = bnn0Var.c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i6 = iHashCode * 31;
                    Bundle bundle2 = bnn0Var.c;
                    bundle2.getClass();
                    Object obj = bundle2.get(str5);
                    iHashCode = i6 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i3 = i4;
        }
        LinkedHashMap linkedHashMap = this.g;
        for (String str6 : linkedHashMap.keySet()) {
            int iD = cy30.d(iHashCode * 31, 31, str6);
            Object obj2 = linkedHashMap.get(str6);
            iHashCode = iD + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public final tnn0 i(String str) {
        snn0 snn0Var;
        Uri uri;
        Bundle bundleC;
        idd1 idd1Var = this.t;
        if (idd1Var == null || (snn0Var = (snn0) idd1Var.getValue()) == null || (bundleC = snn0Var.c((uri = Uri.parse("android-app://androidx.navigation/".concat(str))), this.g)) == null) {
            return null;
        }
        String str2 = snn0Var.a;
        return new tnn0(this, bundleC, snn0Var.f135p, str2 == null ? 0 : o7h.v0(uri.getPathSegments(), Uri.parse(str2).getPathSegments()).size(), false, -1);
    }

    public void k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, dmz0.e);
        m(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.h = resourceId;
            this.c = null;
            this.c = oon1.y(context, resourceId);
        }
        this.d = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public final void l(int i, bnn0 bnn0Var) {
        if (!(this instanceof qg0)) {
            if (i != 0) {
                this.f.e(i, bnn0Var);
                return;
            } else {
                hhg1.n("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void m(String str) {
        if (str == null) {
            this.h = 0;
            this.c = null;
        } else {
            if (ihc1.y0(str)) {
                hhg1.n("Cannot have an empty route");
                return;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str);
            ArrayList arrayListN = m5n1.N(this.g, new unn0(new snn0(strConcat, null, null), (byte) 1));
            if (!arrayListN.isEmpty()) {
                bhn0.n("Cannot set route \"", str, "\" for destination ", this, ". Following required arguments are missing: ", arrayListN);
                return;
            } else {
                this.t = new idd1(new yt3(strConcat, (byte) 6));
                this.h = strConcat.hashCode();
                this.c = null;
            }
        }
        this.i = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(");
        String str = this.c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.i;
        if (str2 != null && !ihc1.y0(str2)) {
            sb.append(" route=");
            sb.append(this.i);
        }
        if (this.d != null) {
            sb.append(" label=");
            sb.append(this.d);
        }
        return sb.toString();
    }
}
