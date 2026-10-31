package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yeh0 implements rij0 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public yeh0(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                dm5.m(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                dm5.m(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                dm5.m(z);
                break;
            case "auxiliary.tracks.map":
                dm5.m(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        dm5.z(this.a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2] & 255));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yeh0.class == obj.getClass()) {
            yeh0 yeh0Var = (yeh0) obj;
            if (this.a.equals(yeh0Var.a) && Arrays.equals(this.b, yeh0Var.b) && this.c == yeh0Var.c && this.d == yeh0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((ktd.f(cy30.d(527, 31, this.a), this.b, 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    public final String toString() {
        String string;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                string = zoi1.v(bArr);
            } else if (i == 23) {
                string = String.valueOf(Float.intBitsToFloat(bmq0.t(bArr)));
            } else if (i == 67) {
                string = String.valueOf(bmq0.t(bArr));
            } else if (i == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i != 78) {
                String str2 = zoi1.a;
                string = raa.b.g().c(bArr, bArr.length);
            } else {
                string = String.valueOf(new izr0(bArr).K());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sb = new StringBuilder();
            sb.append("track types = ");
            new cfa0(String.valueOf(',')).b(sb, arrayListD.iterator());
            string = sb.toString();
        } else {
            String str3 = zoi1.a;
            string = raa.b.g().c(bArr, bArr.length);
        }
        return gvg.h("mdta: key=", str, ", value=", string);
    }
}
