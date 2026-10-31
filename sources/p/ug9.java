package p;

import android.bluetooth.BluetoothGattService;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ug9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug9(UUID uuid) {
        super(1);
        this.a = (byte) 3;
        this.b = uuid;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gg9 gg9Var = gg9.a;
        UUID uuid = this.b;
        switch (b) {
            case 0:
                return vg9.k(((BluetoothGattService) obj).getCharacteristic(uuid), gg9Var);
            case 1:
                return vg9.k(((BluetoothGattService) obj).getCharacteristic(uuid), gg9Var);
            case 2:
                x8v x8vVar = (x8v) obj;
                tr80 tr80VarQ = yoi1.Q(0, x8vVar.d);
                ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
                lr80 it = tr80VarQ.iterator();
                while (((sr80) it).c) {
                    arrayList.add(x8vVar.a[it.nextInt()]);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((w8v) obj2).a(uuid)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((w8v) it2.next()).e;
                    if (bArr != null) {
                        arrayList3.add(bArr);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    hmy0 hmy0VarU = n3o1.u((byte[]) it3.next());
                    UUID[] uuidArr = hmy0VarU != null ? hmy0VarU.d : null;
                    if (uuidArr != null) {
                        arrayList4.add(uuidArr);
                    }
                }
                ArrayList<UUID> arrayList5 = new ArrayList();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    r7h.W(f46.Q0((UUID[]) it4.next()), arrayList5);
                }
                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                for (UUID uuid2 : arrayList5) {
                    uuid2.getClass();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
                    byteBufferWrap.putLong(uuid2.getMostSignificantBits());
                    byteBufferWrap.putLong(uuid2.getLeastSignificantBits());
                    arrayList6.add(byteBufferWrap.array());
                }
                return arrayList6;
            case 3:
                return Boolean.valueOf(((ypj0) obj).a.equals(uuid));
            case 4:
                return ndz0.n(((BluetoothGattService) obj).getCharacteristic(uuid), gg9Var);
            default:
                return ndz0.n(((BluetoothGattService) obj).getCharacteristic(uuid), gg9Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug9(Object obj, UUID uuid, byte b) {
        super(1);
        this.a = b;
        this.b = uuid;
    }
}
