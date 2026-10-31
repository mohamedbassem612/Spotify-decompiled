package p;

import com.google.firebase.datatransport.TransportRegistrar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class hhg1 implements ihg1, v0i, hv30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ hhg1(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void c() {
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void e(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void l(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // p.ihg1
    public void a(ghg1 ghg1Var, jhg1 jhg1Var, boolean z) {
        switch (this.a) {
            case 0:
                ghg1Var.d(jhg1Var);
                break;
            case 1:
                ghg1Var.b(jhg1Var);
                break;
            case 2:
                ghg1Var.a();
                break;
            default:
                ghg1Var.c();
                break;
        }
    }

    @Override // p.hv30
    public Object apply(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((uwl1) it.next()).a());
        }
        return arrayList;
    }

    @Override // p.v0i
    public Object m(dxy dxyVar) {
        return TransportRegistrar.lambda$getComponents$0(dxyVar);
    }
}
