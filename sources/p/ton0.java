package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ton0 extends n4h {
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ton0(byte b, boolean z) {
        super(z);
        this.r = b;
    }

    @Override // p.apn0
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                return (boolean[]) bundle.get(str);
            case 1:
                boolean[] zArr = (boolean[]) bundle.get(str);
                if (zArr != null) {
                    return f46.R0(zArr);
                }
                return null;
            case 2:
                return (float[]) bundle.get(str);
            case 3:
                float[] fArr = (float[]) bundle.get(str);
                if (fArr != null) {
                    return f46.N0(fArr);
                }
                return null;
            case 4:
                return (int[]) bundle.get(str);
            case 5:
                int[] iArr = (int[]) bundle.get(str);
                if (iArr != null) {
                    return f46.O0(iArr);
                }
                return null;
            case 6:
                return (long[]) bundle.get(str);
            case 7:
                long[] jArr = (long[]) bundle.get(str);
                if (jArr != null) {
                    return f46.P0(jArr);
                }
                return null;
            case 8:
                return (String[]) bundle.get(str);
            default:
                String[] strArr = (String[]) bundle.get(str);
                if (strArr != null) {
                    return f46.Q0(strArr);
                }
                return null;
        }
    }

    @Override // p.apn0
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // p.apn0
    public final Object c(Object obj, String str) {
        byte b = this.r;
        uon0 uon0Var = apn0.l;
        uon0 uon0Var2 = apn0.i;
        uon0 uon0Var3 = apn0.b;
        uon0 uon0Var4 = apn0.f;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return new boolean[]{((Boolean) uon0Var.d(str)).booleanValue()};
                }
                boolean[] zArr2 = {((Boolean) uon0Var.d(str)).booleanValue()};
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArr2, 0, zArrCopyOf, length, 1);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                return list != null ? o7h.N0(Collections.singletonList(uon0Var.d(str)), list) : Collections.singletonList(uon0Var.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{((Number) uon0Var2.d(str)).floatValue()};
                }
                float[] fArr2 = {((Number) uon0Var2.d(str)).floatValue()};
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, fArrCopyOf, length2, 1);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? o7h.N0(Collections.singletonList(uon0Var2.d(str)), list2) : Collections.singletonList(uon0Var2.d(str));
            case 4:
                int[] iArr = (int[]) obj;
                return iArr != null ? f46.y0(iArr, new int[]{((Number) uon0Var3.d(str)).intValue()}) : new int[]{((Number) uon0Var3.d(str)).intValue()};
            case 5:
                List list3 = (List) obj;
                return list3 != null ? o7h.N0(Collections.singletonList(uon0Var3.d(str)), list3) : Collections.singletonList(uon0Var3.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return new long[]{((Number) uon0Var4.d(str)).longValue()};
                }
                long[] jArr2 = {((Number) uon0Var4.d(str)).longValue()};
                int length3 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length3 + 1);
                System.arraycopy(jArr2, 0, jArrCopyOf, length3, 1);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                return list4 != null ? o7h.N0(Collections.singletonList(uon0Var4.d(str)), list4) : Collections.singletonList(uon0Var4.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) f46.A0(strArr, new String[]{str}) : new String[]{str};
            default:
                List list5 = (List) obj;
                return list5 != null ? o7h.N0(Collections.singletonList(str), list5) : Collections.singletonList(str);
        }
    }

    @Override // p.apn0
    public final Object d(String str) {
        byte b = this.r;
        uon0 uon0Var = apn0.l;
        uon0 uon0Var2 = apn0.i;
        uon0 uon0Var3 = apn0.b;
        uon0 uon0Var4 = apn0.f;
        switch (b) {
            case 0:
                return new boolean[]{((Boolean) uon0Var.d(str)).booleanValue()};
            case 1:
                return Collections.singletonList(uon0Var.d(str));
            case 2:
                return new float[]{((Number) uon0Var2.d(str)).floatValue()};
            case 3:
                return Collections.singletonList(uon0Var2.d(str));
            case 4:
                return new int[]{((Number) uon0Var3.d(str)).intValue()};
            case 5:
                return Collections.singletonList(uon0Var3.d(str));
            case 6:
                return new long[]{((Number) uon0Var4.d(str)).longValue()};
            case 7:
                return Collections.singletonList(uon0Var4.d(str));
            case 8:
                return new String[]{str};
            default:
                return Collections.singletonList(str);
        }
    }

    @Override // p.apn0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                List list = (List) obj;
                bundle.putBooleanArray(str, list != null ? o7h.f1(list) : null);
                break;
            case 2:
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 3:
                List list2 = (List) obj;
                bundle.putFloatArray(str, list2 != null ? o7h.i1(list2) : null);
                break;
            case 4:
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                List list3 = (List) obj;
                bundle.putIntArray(str, list3 != null ? o7h.k1(list3) : null);
                break;
            case 6:
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                List list4 = (List) obj;
                bundle.putLongArray(str, list4 != null ? o7h.m1(list4) : null);
                break;
            case 8:
                bundle.putStringArray(str, (String[]) obj);
                break;
            default:
                List list5 = (List) obj;
                bundle.putStringArray(str, list5 != null ? (String[]) list5.toArray(new String[0]) : null);
                break;
        }
    }

    @Override // p.n4h
    public final Object g() {
        byte b = this.r;
        z6x z6xVar = z6x.a;
        switch (b) {
            case 0:
                return new boolean[0];
            case 1:
                return z6xVar;
            case 2:
                return new float[0];
            case 3:
                return z6xVar;
            case 4:
                return new int[0];
            case 5:
                return z6xVar;
            case 6:
                return new long[0];
            case 7:
                return z6xVar;
            case 8:
                return new String[0];
            default:
                return z6xVar;
        }
    }

    @Override // p.n4h
    public final List h(Object obj) {
        byte b = this.r;
        ArrayList arrayList = z6x.a;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    List listR0 = f46.R0(zArr);
                    arrayList = new ArrayList(q7h.U(listR0, 10));
                    Iterator it = listR0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                    }
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    List listN0 = f46.N0(fArr);
                    arrayList = new ArrayList(q7h.U(listN0, 10));
                    Iterator it3 = listN0.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it3.next()).floatValue()));
                    }
                }
                break;
            case 3:
                List list3 = (List) obj;
                if (list3 != null) {
                    List list4 = list3;
                    arrayList = new ArrayList(q7h.U(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it4.next()).floatValue()));
                    }
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    List listO0 = f46.O0(iArr);
                    arrayList = new ArrayList(q7h.U(listO0, 10));
                    Iterator it5 = listO0.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it5.next()).intValue()));
                    }
                }
                break;
            case 5:
                List list5 = (List) obj;
                if (list5 != null) {
                    List list6 = list5;
                    arrayList = new ArrayList(q7h.U(list6, 10));
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    List listP0 = f46.P0(jArr);
                    arrayList = new ArrayList(q7h.U(listP0, 10));
                    Iterator it7 = listP0.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it7.next()).longValue()));
                    }
                }
                break;
            case 7:
                List list7 = (List) obj;
                if (list7 != null) {
                    List list8 = list7;
                    arrayList = new ArrayList(q7h.U(list8, 10));
                    Iterator it8 = list8.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it8.next()).longValue()));
                    }
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        arrayList.add(Uri.encode(str));
                    }
                }
                break;
            default:
                List list9 = (List) obj;
                if (list9 != null) {
                    List list10 = list9;
                    arrayList = new ArrayList(q7h.U(list10, 10));
                    Iterator it9 = list10.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(Uri.encode((String) it9.next()));
                    }
                }
                break;
        }
        return arrayList;
    }
}
