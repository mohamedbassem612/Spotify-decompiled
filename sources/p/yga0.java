package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yga0 {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;
    public Object d;
    public Serializable e;

    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.io.Serializable] */
    public yga0(vfa0 vfa0Var) {
        this.a = (byte) 0;
        this.c = vfa0Var;
        this.d = new Object[8];
        ?? r1 = new int[8];
        for (int i = 0; i < 8; i++) {
            r1[i] = -1;
        }
        this.e = r1;
        this.b = -1;
    }

    public String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof h661) {
                h661 h661Var = (h661) obj;
                boolean zJ = u890.j(h661Var.getKind(), uic1.i);
                int[] iArr = (int[]) this.e;
                if (!zJ) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(h661Var.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e)[i2]);
                    sb.append("]");
                }
            } else if (obj == ud20.h) {
                sb.append("[<debug info disabled>]");
            } else if (obj != wdu0.U0) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [int[], java.io.Serializable] */
    public void b() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        ?? r1 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            r1[i2] = -1;
        }
        f46.V(0, 0, 14, (int[]) this.e, r1);
        this.e = r1;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return super.toString();
        }
    }

    public yga0(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 1;
        this.b = i;
        this.e = str;
        this.c = arrayList;
        this.d = arrayList2;
    }
}
