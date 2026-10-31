package p;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r661 implements Externalizable {
    public AbstractCollection a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public r661(AbstractCollection abstractCollection, int i) {
        this.a = abstractCollection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        xj61 xj61VarK;
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            f341.b(b, "Unsupported flags value: ");
            return;
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            f341.b(i2, "Illegal size value: ");
            return;
        }
        int i3 = 0;
        if (i == 0) {
            smc0 smc0Var = new smc0(i2);
            while (i3 < i2) {
                smc0Var.add(objectInput.readObject());
                i3++;
            }
            xj61VarK = k4p1.k(smc0Var);
        } else {
            if (i != 1) {
                f341.b(i, "Unsupported collection type tag: ");
                return;
            }
            xj61 xj61Var = new xj61(new xkg0(i2));
            while (i3 < i2) {
                xj61Var.add(objectInput.readObject());
                i3++;
            }
            xj61VarK = cwl1.j(xj61Var);
        }
        this.a = xj61VarK;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.b ? 1 : 0);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
