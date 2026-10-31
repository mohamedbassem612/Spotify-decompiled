package p;

import android.graphics.Color;
import com.comscore.streaming.AdvertisementType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u8a implements rg70 {
    public ArrayList a;
    public ArrayList b;
    public String c;
    public transient lk70 f;
    public ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f148p;
    public float q;
    public float r;
    public float s;
    public final int t;
    public final int u;
    public int d = 1;
    public boolean e = true;
    public int g = 3;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public boolean j = true;
    public boolean k = true;
    public duf0 l = new duf0();
    public float m = 17.0f;
    public boolean n = true;

    public u8a(ArrayList arrayList) {
        this.a = null;
        this.b = null;
        this.c = "DataSet";
        this.a = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.a.add(Integer.valueOf(Color.rgb(140, AdvertisementType.BRANDED_AS_CONTENT, 255)));
        arrayList2.add(-16777216);
        this.c = null;
        this.f148p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.o = arrayList;
        if (!arrayList.isEmpty()) {
            this.f148p = -3.4028235E38f;
            this.q = Float.MAX_VALUE;
            this.r = -3.4028235E38f;
            this.s = Float.MAX_VALUE;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v8a v8aVar = (v8a) ((rzy) it.next());
                if (v8aVar != null && !Float.isNaN(((rzy) v8aVar).a)) {
                    float f = ((rzy) v8aVar).a;
                    if (f < this.q) {
                        this.q = f;
                    }
                    if (f > this.f148p) {
                        this.f148p = f;
                    }
                    float f2 = ((rzy) v8aVar).c;
                    if (f2 < this.s) {
                        this.s = f2;
                    }
                    if (f2 > this.r) {
                        this.r = f2;
                    }
                }
            }
        }
        this.t = Color.rgb(255, 187, 115);
        this.u = Color.rgb(215, 215, 215);
        this.t = Color.rgb(0, 0, 0);
        for (int i = 0; i < arrayList.size(); i++) {
            ((v8a) arrayList.get(i)).getClass();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((v8a) arrayList.get(i2)).getClass();
        }
    }

    public final ArrayList a(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            float f2 = ((rzy) arrayList2.get(i2)).c;
            if (f == f2) {
                while (i2 > 0 && ((rzy) arrayList2.get(i2 - 1)).c == f) {
                    i2--;
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    rzy rzyVar = (rzy) arrayList2.get(i2);
                    if (rzyVar.c != f) {
                        break;
                    }
                    arrayList.add(rzyVar);
                    i2++;
                }
                break;
            }
            if (f > f2) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    public final rzy b(float f, float f2) {
        int iC = c(3, f, f2);
        if (iC > -1) {
            return (rzy) this.o.get(iC);
        }
        return null;
    }

    public final int c(int i, float f, float f2) {
        int i2;
        rzy rzyVar;
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) / 2;
            float f3 = ((rzy) arrayList.get(i4)).c - f;
            int i5 = i4 + 1;
            float f4 = ((rzy) arrayList.get(i5)).c - f;
            float fAbs = Math.abs(f3);
            float fAbs2 = Math.abs(f4);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = f3;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i4;
            }
            i3 = i5;
        }
        if (size != -1) {
            float f5 = ((rzy) arrayList.get(size)).c;
            if (i == 1) {
                if (f5 < f && size < arrayList.size() - 1) {
                    size++;
                }
            } else if (i == 2 && f5 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((rzy) arrayList.get(size - 1)).c == f5) {
                    size--;
                }
                float fA = ((rzy) arrayList.get(size)).a();
                loop2: while (true) {
                    i2 = size;
                    do {
                        size++;
                        if (size >= arrayList.size()) {
                            break loop2;
                        }
                        rzyVar = (rzy) arrayList.get(size);
                        if (rzyVar.c != f5) {
                            break loop2;
                        }
                    } while (Math.abs(rzyVar.a() - f2) >= Math.abs(fA - f2));
                    fA = f2;
                }
                return i2;
            }
        }
        return size;
    }

    public final String toString() {
        ArrayList arrayList = this.o;
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", entries: ");
        sb.append(arrayList.size());
        sb.append("\n");
        StringBuffer stringBuffer = new StringBuffer(sb.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            stringBuffer.append(((rzy) arrayList.get(i)).toString().concat(" "));
        }
        return stringBuffer.toString();
    }
}
