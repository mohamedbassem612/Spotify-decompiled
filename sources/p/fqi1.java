package p;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fqi1 implements Externalizable {
    public long a;
    public long b;

    private final Object readResolve() {
        long j = this.a;
        long j2 = this.b;
        return (j == 0 && j2 == 0) ? eqi1.c : new eqi1(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.a = objectInput.readLong();
        this.b = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.a);
        objectOutput.writeLong(this.b);
    }
}
