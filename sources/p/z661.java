package p;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z661 implements Externalizable {
    public xkg0 a;

    public z661(xkg0 xkg0Var) {
        this.a = xkg0Var;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(f4i1.c(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            f341.b(i, "Illegal size value: ");
            return;
        }
        xkg0 xkg0Var = new xkg0(i);
        for (int i2 = 0; i2 < i; i2++) {
            xkg0Var.put(objectInput.readObject(), objectInput.readObject());
        }
        this.a = xkg0Var.b();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.i);
        for (Map.Entry entry : (ykg0) this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
