package p;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ap80 implements Externalizable {
    public long a;
    public int b;

    private final Object readResolve() {
        lo80 lo80Var = lo80.c;
        return n9p1.p(this.b, this.a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.a = objectInput.readLong();
        this.b = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }
}
