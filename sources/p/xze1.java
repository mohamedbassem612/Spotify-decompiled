package p;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xze1 {
    public final byte[] a;
    public final ArrayList b;

    public xze1(byte[] bArr, List list) {
        this.a = bArr;
        this.b = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.b.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public static xze1 a(String str, List list) throws IOException {
        Collections.sort(list, new ena1((byte) 3));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new xze1(byteArrayOutputStream.toByteArray(), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xze1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((xze1) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
