package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class up20 implements k1q0 {
    public int a;
    public Object b;

    public up20(Context context, XmlResourceParser xmlResourceParser) {
        this.a = -1;
        this.b = new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), inz0.r);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            nqb1 nqb1Var = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                nqb1Var = new nqb1(context, xmlResourceParser);
                                ((SparseArray) this.b).put(nqb1Var.a, nqb1Var);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                oqb1 oqb1Var = new oqb1(context, xmlResourceParser);
                                if (nqb1Var != null) {
                                    nqb1Var.a(oqb1Var);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = u890.q(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public Object a() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i - 1;
        return obj;
    }

    public void b() {
        int i = this.a;
        this.a = i + 1;
        if (i >= 10) {
            this.a = 0;
            Iterator it = ((LinkedHashMap) this.b).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    eg01 eg01Var = (eg01) o7h.s0(arrayList);
                    if ((eg01Var != null ? (oq70) eg01Var.b().get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((eg01) arrayList.get(i4)).b().get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void d(int i, fj7 fj7Var) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            fj7 fj7Var2 = ((fj7[]) this.b)[i2];
            fj7Var2.getClass();
            if (u890.r(0L, fj7Var.g - fj7Var2.g) <= 0) {
                break;
            }
            fj7Var2.f = i;
            ((fj7[]) this.b)[i] = fj7Var2;
            i = i2;
        }
        ((fj7[]) this.b)[i] = fj7Var;
        fj7Var.f = i;
    }

    public void e(sk30 sk30Var, int i, int i2) {
        ((vgr) this.b).A(new f1d1(sk30Var), i, i2);
    }

    public int f(int i) {
        int i2 = this.a - 1;
        return i2 >= 0 ? ((int[]) this.b)[i2] : i;
    }

    public int g() {
        int[] iArr = (int[]) this.b;
        int i = this.a - 1;
        this.a = i;
        return iArr[i];
    }

    public void h(int i) {
        int[] iArrCopyOf = (int[]) this.b;
        if (this.a >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.b = iArrCopyOf;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    public boolean i(Object obj) {
        Object[] objArr = (Object[]) this.b;
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                eg.m("Already in the pool!");
                return false;
            }
        }
        int i3 = this.a;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.a = i3 + 1;
        return true;
    }

    public void j(fj7 fj7Var) {
        fj7 fj7Var2;
        int i = fj7Var.f;
        if (i == -1) {
            hhg1.n("Failed requirement.");
            return;
        }
        int i2 = this.a;
        fj7 fj7Var3 = ((fj7[]) this.b)[i2];
        fj7Var3.getClass();
        fj7Var.f = -1;
        ((fj7[]) this.b)[i2] = null;
        this.a = i2 - 1;
        if (fj7Var == fj7Var3) {
            return;
        }
        int iR = u890.r(0L, fj7Var3.g - fj7Var.g);
        if (iR == 0) {
            ((fj7[]) this.b)[i] = fj7Var3;
            fj7Var3.f = i;
            return;
        }
        if (iR >= 0) {
            d(i, fj7Var3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                fj7Var2 = ((fj7[]) this.b)[i3];
                fj7Var2.getClass();
            } else {
                fj7Var2 = ((fj7[]) this.b)[i3];
                fj7Var2.getClass();
                fj7 fj7Var4 = ((fj7[]) this.b)[i4];
                fj7Var4.getClass();
                if (u890.r(0L, fj7Var4.g - fj7Var2.g) >= 0) {
                    fj7Var2 = fj7Var4;
                }
            }
            if (u890.r(0L, fj7Var2.g - fj7Var3.g) <= 0) {
                break;
            }
            int i6 = fj7Var2.f;
            fj7Var2.f = i;
            ((fj7[]) this.b)[i] = fj7Var2;
            i = i6;
        }
        ((fj7[]) this.b)[i] = fj7Var3;
        fj7Var3.f = i;
    }

    public void k(bsi0 bsi0Var, oq70 oq70Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        Object arrayList = linkedHashMap.get(bsi0Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(bsi0Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        eg01 eg01Var = new eg01(new WeakReference(oq70Var), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(eg01Var);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                eg01 eg01Var2 = (eg01) arrayList2.get(i);
                if (j >= eg01Var2.c()) {
                    if (eg01Var2.b().get() == oq70Var) {
                        arrayList2.set(i, eg01Var);
                        break;
                    } else {
                        arrayList2.add(i, eg01Var);
                        break;
                    }
                }
            }
        }
        b();
    }

    public int l(int i) {
        int iB;
        SparseArray sparseArray = (SparseArray) this.b;
        if (-1 == i) {
            nqb1 nqb1Var = i == -1 ? (nqb1) sparseArray.valueAt(0) : (nqb1) sparseArray.get(-1);
            if (nqb1Var != null && -1 != (iB = nqb1Var.b(-1.0f, -1.0f))) {
                return iB == -1 ? nqb1Var.c : ((oqb1) nqb1Var.b.get(iB)).e;
            }
        } else {
            nqb1 nqb1Var2 = (nqb1) sparseArray.get(i);
            if (nqb1Var2 != null) {
                int iB2 = nqb1Var2.b(-1.0f, -1.0f);
                return iB2 == -1 ? nqb1Var2.c : ((oqb1) nqb1Var2.b.get(iB2)).e;
            }
        }
        return -1;
    }

    @Override // p.k1q0
    public hsl1 x(View view, hsl1 hsl1Var) {
        View view2 = (View) this.b;
        view2.setPadding(view2.getPaddingLeft(), hsl1Var.a.i(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SET_CONTEXT_FAILED).b + this.a, view2.getPaddingRight(), view2.getPaddingBottom());
        return hsl1Var;
    }

    public up20(byte b) {
        switch (b) {
            case 5:
                this.b = new LinkedHashMap();
                break;
            default:
                this.b = new int[10];
                break;
        }
    }

    public up20(int i, byte b) {
        switch (b) {
            case 6:
                this.a = i;
                return;
            default:
                if (i > 0) {
                    this.b = new Object[i];
                    return;
                } else {
                    hhg1.n("The max pool size must be > 0");
                    throw null;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public up20(vgr vgrVar, int i) {
        this(i, (byte) 6);
        this.b = vgrVar;
    }
}
