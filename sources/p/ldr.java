package p;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.messaging.messagingplatformdebug.items.DelayChooser;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ldr implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ldr(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        xb xbVar;
        int i;
        dc ccVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mdr mdrVar = (mdr) obj2;
                dc dcVar = mdrVar.b;
                if (dcVar == null || (xbVar = dcVar.a) == null || (i = xbVar.b) == 0) {
                    return;
                }
                iu30 iu30Var = (iu30) obj;
                AppCompatCheckBox appCompatCheckBox = mdrVar.g;
                if (dcVar instanceof bc) {
                    bc bcVar = (bc) dcVar;
                    ccVar = new bc(bcVar.b, bcVar.c, bcVar.d, new xb(i, appCompatCheckBox.isChecked()), bcVar.f);
                } else if (!(dcVar instanceof cc)) {
                    eg.o();
                    return;
                } else {
                    cc ccVar2 = (cc) dcVar;
                    ccVar = new cc(ccVar2.b, new xb(i, appCompatCheckBox.isChecked()), ccVar2.d, ccVar2.e);
                }
                mdrVar.b = ccVar;
                iu30Var.invoke(new yb(i, z));
                return;
            case 1:
                int i2 = ((ibv0) obj).b;
                tps tpsVar = (tps) obj2;
                ArrayList arrayList = (ArrayList) tpsVar.i;
                if (z) {
                    arrayList.add(Integer.valueOf(i2));
                } else {
                    arrayList.remove(Integer.valueOf(i2));
                }
                ((EncoreButton) ((p1f0) tpsVar.e).g).setEnabled(!arrayList.isEmpty());
                iu30 iu30Var2 = (iu30) tpsVar.t;
                if (iu30Var2 != null) {
                    iu30Var2.invoke(new cbv0(i2));
                    return;
                } else {
                    u890.C("eventConsumer");
                    throw null;
                }
            case 2:
                DelayChooser delayChooser = (DelayChooser) obj2;
                delayChooser.b.setEnabled(z);
                ((iu30) obj).invoke(Integer.valueOf(delayChooser.a()));
                return;
            default:
                ((mvo0) obj2).f.b.onNext(new omq0(((y781) obj).a, z));
                return;
        }
    }
}
