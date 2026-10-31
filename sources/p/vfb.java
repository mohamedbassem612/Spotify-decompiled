package p;

import android.bluetooth.BluetoothDevice;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vfb extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yfb b;
    public final /* synthetic */ BluetoothDevice c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vfb(yfb yfbVar, BluetoothDevice bluetoothDevice, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = yfbVar;
        this.c = bluetoothDevice;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        BluetoothDevice bluetoothDevice = this.c;
        yfb yfbVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new vfb(yfbVar, bluetoothDevice, lnmVar, (byte) 0);
            default:
                return new vfb(yfbVar, bluetoothDevice, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        BluetoothDevice bluetoothDevice = this.c;
        yfb yfbVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                qi qiVarF = yfb.f(bluetoothDevice);
                bpb1 bpb1Var = yfbVar.e;
                List list = (List) bpb1Var.getValue();
                List<qi> list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    bpb1Var.m((Object) null, o7h.O0(qiVarF, list));
                } else {
                    for (qi qiVar : list2) {
                        if (!u890.j(qiVar.b, qiVarF.b) || !u890.j(qiVar.i, qiVarF.i)) {
                        }
                    }
                    bpb1Var.m((Object) null, o7h.O0(qiVarF, list));
                }
                qiVarF.toString();
                List list3 = (List) bpb1Var.getValue();
                Objects.toString(list);
                Objects.toString(list3);
                break;
            default:
                hm5.M(obj);
                qi qiVarF2 = yfb.f(bluetoothDevice);
                bpb1 bpb1Var2 = yfbVar.e;
                List list4 = (List) bpb1Var2.getValue();
                List list5 = list4;
                Iterator it = list5.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        qi qiVar2 = (hi) next;
                        if (!u890.j(qiVar2.b, qiVarF2.b) || !u890.j(qiVar2.i, qiVarF2.i)) {
                        }
                    } else {
                        next = null;
                    }
                }
                hi hiVar = (hi) next;
                if (hiVar != null) {
                    bpb1Var2.m((Object) null, o7h.J0(list5, hiVar));
                } else {
                    qiVarF2.toString();
                }
                qiVarF2.toString();
                List list6 = (List) bpb1Var2.getValue();
                Objects.toString(list4);
                Objects.toString(list6);
                break;
        }
        return rih1Var;
    }
}
