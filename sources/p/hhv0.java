package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hhv0 implements i650 {
    public static final List a = p7h.M(new String[]{"Rogue", "B-Series", "D-Series", "C-Series"});
    public static final List b = p7h.M(new String[]{"BXM-", "BXT-", "BXE-"});
    public static final List c = p7h.M(new String[]{"GE", "GM", "GX", "G6", "BXM-", "BXT-", "BXE-", "DXT-", "CXTP-", "IMG"});

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0101  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:3: B:65:0x0105->B:86:?, LOOP_END, SYNTHETIC] */
    @Override // p.i650
    public final h650 a(Integer num, String str) {
        List list;
        Iterator it;
        boolean zY = false;
        int iW0 = ihc1.w0(str, "PowerVR", 0, false, 6);
        Integer numValueOf = Integer.valueOf(iW0);
        Object obj = null;
        if (iW0 < 0) {
            numValueOf = null;
        }
        Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 7) : null;
        if (numValueOf2 != null) {
            int iY = w6d1.y(numValueOf2.intValue(), str);
            for (Object obj2 : a) {
                if (str.startsWith(((String) obj2) + " ", iY)) {
                    obj = obj2;
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                iY = w6d1.y(str2.length() + iY, str);
            }
            String strT = w6d1.t(iY, str);
            if (strT != null) {
                for (int i = 0; i < strT.length(); i++) {
                    if (Character.isDigit(strT.charAt(i))) {
                        if (str2 != null) {
                            switch (str2) {
                                case "B-Series":
                                    List list2 = b;
                                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            if (nhc1.Y(strT, (String) it2.next(), false)) {
                                                zY = true;
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case "Rogue":
                                    zY = nhc1.Y(strT, "G", false);
                                    break;
                                case "C-Series":
                                    zY = nhc1.Y(strT, "CXTP-", false);
                                    break;
                                case "D-Series":
                                    zY = nhc1.Y(strT, "DXT-", false);
                                    break;
                                default:
                                    list = c;
                                    if ((list instanceof Collection) || !list.isEmpty()) {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            if (nhc1.Y(strT, (String) it.next(), false)) {
                                                zY = true;
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        } else {
                            list = c;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (nhc1.Y(strT, (String) it.next(), false)) {
                                        zY = true;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (nhc1.Y(strT, (String) it.next(), false)) {
                                        zY = true;
                                    }
                                }
                            }
                        }
                        if (zY) {
                            return new d650("PowerVR ".concat(strT));
                        }
                    }
                }
                if (zY) {
                    return new d650("PowerVR ".concat(strT));
                }
            }
        }
        return g650.a;
    }
}
