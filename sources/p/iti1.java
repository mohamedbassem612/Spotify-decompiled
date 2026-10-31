package p;

import androidx.car.app.model.GridSection;
import androidx.car.app.model.SectionHeader;
import io.reactivex.rxjava3.functions.Function;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iti1 implements Function, ag51 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public boolean a;
    public int b;
    public Object c;

    public iti1(byte b) {
        switch (b) {
            case 6:
                this.c = new wdn0();
                break;
            default:
                this.c = new byte[8];
                break;
        }
    }

    public static long a(int i, boolean z, byte[] bArr) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public Object apply(Object obj) {
        List list = (List) obj;
        int i = this.b;
        List listD1 = o7h.d1(list, i);
        azl azlVar = (azl) this.c;
        boolean z = azlVar.b;
        String uri = azlVar.a.getUri();
        String str = azlVar.c;
        boolean z2 = this.a;
        return new rzl(uri, str, listD1, z, z2, !z2 && list.size() <= i);
    }

    public long b(fc10 fc10Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.c;
        if (!this.a) {
            if (!fc10Var.g(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((d[i4] & ((long) i3)) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.b = i2;
            if (i2 == -1) {
                eg.m("No valid varint length mask found");
                return 0L;
            }
            this.a = true;
        }
        int i5 = this.b;
        if (i5 > i) {
            this.a = false;
            return -2L;
        }
        if (i5 != 1) {
            fc10Var.readFully(bArr, 1, i5 - 1);
        }
        this.a = false;
        return a(this.b, z2, bArr);
    }

    public List c(fpd fpdVar, utj utjVar) {
        ouk0 ouk0VarN = c8o.n(fpdVar, utjVar);
        String title = fpdVar.getTitle();
        String str = (title == null || title.length() == 0) ? null : title;
        List items = fpdVar.getItems();
        ArrayList arrayList = new ArrayList(q7h.U(items, 10));
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            apd apdVar = (apd) obj;
            nwc nwcVar = apdVar.a;
            nwc nwcVar2 = apdVar.b;
            hvc hvcVar = apdVar.c;
            Float f = apdVar.g;
            if (!this.a) {
                f = null;
            }
            arrayList.add(x760.w(nwcVar, nwcVar2, hvcVar, f, new gsk(utjVar, apdVar, i, ouk0VarN, (byte) 1)));
            i = i2;
        }
        l7m0 l7m0Var = (l7m0) this.c;
        if (l7m0Var == null) {
            return Collections.singletonList(lgo1.r(str, arrayList, this.b, utjVar.e, utjVar.d, utjVar.f));
        }
        SectionHeader sectionHeader = utjVar.f;
        int i3 = this.b;
        b8p1 b8p1Var = utjVar.d;
        int iMin = Math.min(50, ((bil) ((i6b) l7m0Var.b).b).a(1));
        ArrayList arrayListS1 = o7h.s1(arrayList, iMin, iMin);
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayListS1, 10));
        int i4 = 0;
        int size = 0;
        for (Object obj2 : arrayListS1) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                p7h.T();
                throw null;
            }
            List list = (List) obj2;
            String str2 = i4 == 0 ? str : null;
            SectionHeader sectionHeader2 = i4 == 0 ? sectionHeader : null;
            GridSection gridSectionR = lgo1.r(str2, list, i3, (Function0) null, b8p1Var != null ? b8p1Var.h(i4, size, i4 == p7h.L(arrayListS1)) : null, sectionHeader2);
            size += list.size();
            arrayList2.add(gridSectionR);
            i4 = i5;
        }
        return arrayList2;
    }

    public void d() {
        wdn0 wdn0Var = (wdn0) this.c;
        int i = wdn0Var.b;
        Object[] objArr = wdn0Var.a;
        tr80 tr80VarQ = yoi1.Q(0, i);
        int i2 = ((rr80) tr80VarQ).a;
        int i3 = ((rr80) tr80VarQ).b;
        int i4 = 0;
        if (i2 <= i3) {
            while (true) {
                objArr[i2 - i4] = objArr[i2];
                if (!((ujp0) objArr[i2]).b) {
                    i4++;
                }
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        Arrays.fill(objArr, i - i4, i, (Object) null);
        wdn0Var.b -= i4;
        this.a = false;
    }

    public void e(int i) {
        this.b = i;
        this.a = true;
    }

    public void f(bg11 bg11Var) {
        this.c = b380.p(bg11Var);
    }

    public ipo1 g() {
        b380 b380Var;
        if (this.a && (b380Var = (b380) this.c) != null) {
            return new ipo1(this.b, b380Var);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.a) {
            sb.append(" currentIndex");
        }
        if (((b380) this.c) == null) {
            sb.append(" entries");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public /* synthetic */ iti1(int i, Object obj, boolean z) {
        this.c = obj;
        this.b = i;
        this.a = z;
    }

    public iti1(MessageDigest messageDigest, int i) {
        this.c = messageDigest;
        this.b = i;
    }

    public /* synthetic */ iti1(char c) {
    }

    public iti1(int i, boolean z, s2t s2tVar) {
        this.b = i;
        this.a = z;
        this.c = s2tVar;
    }
}
