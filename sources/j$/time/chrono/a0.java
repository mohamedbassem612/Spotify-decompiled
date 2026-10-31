package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class a0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public a0(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objX;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                objX = a.x(objectInput.readUTF());
                break;
            case 2:
                objX = ((ChronoLocalDate) objectInput.readObject()).F((LocalTime) objectInput.readObject());
                break;
            case 3:
                objX = ((ChronoLocalDateTime) objectInput.readObject()).C((ZoneOffset) objectInput.readObject()).B((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = t.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                r.c.getClass();
                objX = new t(LocalDate.of(i, b2, b3));
                break;
            case 5:
                u uVar = u.d;
                objX = u.o(objectInput.readByte());
                break;
            case 6:
                l lVar = (l) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                lVar.getClass();
                objX = new n(lVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                w.c.getClass();
                objX = new y(LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                c0.c.getClass();
                objX = new e0(LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = f.e;
                objX = new f(a.x(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objX;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                e eVar = (e) obj;
                objectOutput.writeObject(eVar.a);
                objectOutput.writeObject(eVar.b);
                return;
            case 3:
                i iVar = (i) obj;
                objectOutput.writeObject(iVar.a);
                objectOutput.writeObject(iVar.b);
                objectOutput.writeObject(iVar.c);
                return;
            case 4:
                t tVar = (t) obj;
                tVar.getClass();
                objectOutput.writeInt(tVar.g(ChronoField.YEAR));
                objectOutput.writeByte(tVar.g(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(tVar.g(ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((u) obj).a);
                return;
            case 6:
                n nVar = (n) obj;
                objectOutput.writeObject(nVar.a);
                objectOutput.writeInt(nVar.g(ChronoField.YEAR));
                objectOutput.writeByte(nVar.g(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(nVar.g(ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(yVar.g(ChronoField.YEAR));
                objectOutput.writeByte(yVar.g(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(yVar.g(ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                e0 e0Var = (e0) obj;
                e0Var.getClass();
                objectOutput.writeInt(e0Var.g(ChronoField.YEAR));
                objectOutput.writeByte(e0Var.g(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(e0Var.g(ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                f fVar = (f) obj;
                objectOutput.writeUTF(fVar.a.getId());
                objectOutput.writeInt(fVar.b);
                objectOutput.writeInt(fVar.c);
                objectOutput.writeInt(fVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public a0() {
    }
}
