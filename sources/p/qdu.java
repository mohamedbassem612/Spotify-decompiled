package p;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qdu {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public qdu(String str, opc opcVar) {
        String str2 = opcVar.b;
        long j = opcVar.c;
        long j2 = opcVar.d;
        long j3 = opcVar.e;
        long j4 = opcVar.f;
        ?? arrayList = opcVar.h;
        if (arrayList == 0) {
            Map map = opcVar.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new ev50((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static qdu a(ugc ugcVar) throws IOException {
        if (d18.t(ugcVar) != 538247942) {
            throw new IOException();
        }
        String strV = d18.v(ugcVar);
        String strV2 = d18.v(ugcVar);
        long jU = d18.u(ugcVar);
        long jU2 = d18.u(ugcVar);
        long jU3 = d18.u(ugcVar);
        long jU4 = d18.u(ugcVar);
        int iT = d18.t(ugcVar);
        if (iT < 0) {
            k220.i(f4i1.c(iT, "readHeaderList size="));
            return null;
        }
        List arrayList = iT == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iT; i++) {
            arrayList.add(new ev50(d18.v(ugcVar).intern(), d18.v(ugcVar).intern()));
        }
        return new qdu(strV, strV2, jU, jU2, jU3, jU4, arrayList);
    }

    public final opc b(byte[] bArr) {
        opc opcVar = new opc();
        opcVar.a = bArr;
        opcVar.b = this.c;
        opcVar.c = this.d;
        opcVar.d = this.e;
        opcVar.e = this.f;
        opcVar.f = this.g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<ev50> list = this.h;
        for (ev50 ev50Var : list) {
            treeMap.put(ev50Var.a, ev50Var.b);
        }
        opcVar.g = treeMap;
        opcVar.h = Collections.unmodifiableList(list);
        return opcVar;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            d18.y(bufferedOutputStream, 538247942);
            d18.A(bufferedOutputStream, this.b);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            d18.A(bufferedOutputStream, str);
            d18.z(bufferedOutputStream, this.d);
            d18.z(bufferedOutputStream, this.e);
            d18.z(bufferedOutputStream, this.f);
            d18.z(bufferedOutputStream, this.g);
            List<ev50> list = this.h;
            if (list != null) {
                d18.y(bufferedOutputStream, list.size());
                for (ev50 ev50Var : list) {
                    d18.A(bufferedOutputStream, ev50Var.a);
                    d18.A(bufferedOutputStream, ev50Var.b);
                }
            } else {
                d18.y(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e) {
            vqk1.a("%s", e.toString());
            return false;
        }
    }

    public qdu(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
