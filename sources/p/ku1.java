package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MergedEventSource;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ku1 implements Connectable {
    public final /* synthetic */ byte a;
    public final Object b;

    public ku1(hx7 hx7Var) {
        this.a = (byte) 28;
        this.b = RxConnectables.a(new o4e0(hx7Var, (byte) 17));
    }

    public static xnh a(wkh wkhVar, tv80 tv80Var) {
        ekh ekhVar = wkhVar.a;
        if (ekhVar instanceof ekh) {
            Comment comment = ekhVar.b;
            return new xnh(comment.p() == 2 ? new ip8(comment.B()) : new jp8(comment.E()), tv80Var);
        }
        if (!(ekhVar instanceof hkh)) {
            return null;
        }
        Reply reply = ((hkh) ekhVar).b;
        return new xnh(reply.n() == 2 ? new ip8(reply.v()) : new jp8(reply.x()), tv80Var);
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new rp(this, (byte) 1);
            case 1:
                return new bd2(((zc2) obj).a(consumer), (byte) 0);
            case 2:
                AgeVerificationDialogActivity ageVerificationDialogActivity = (AgeVerificationDialogActivity) obj;
                consumer.getClass();
                ageVerificationDialogActivity.m1 = consumer;
                return new rp(ageVerificationDialogActivity, (byte) 3);
            case 3:
                return new rp((z04) obj, (byte) 4);
            case 4:
                return new bd2(((zba) obj).a(consumer), (byte) 2);
            case 5:
                return ((vlh) obj).a.L(consumer);
            case 6:
                return new e8l(this, consumer);
            case 7:
                return new jn8((kun) obj);
            case 8:
                return new bd2(((oio) obj).a(consumer), (byte) 6);
            case 9:
                return new rp((r8s) obj, (byte) 19);
            case 10:
                return new rp((g9s) obj, (byte) 20);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                k42 k42Var = (k42) obj;
                bpb1 bpb1Var = (bpb1) k42Var.p;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, consumer);
                bpb1 bpb1Var2 = (bpb1) k42Var.q;
                Boolean bool = Boolean.TRUE;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, bool);
                fn31.T((llm) k42Var.s, (o8n) null, 0, new gqj1(k42Var, (lnm) null, (byte) 11), 3);
                return new cn(new l811(), this, (byte) 16);
            case grn1.d /* 12 */:
                Object obj2 = new Object();
                l811 l811Var = new l811();
                return new ibn(obj2, ((a) obj).L(new yku(obj2, l811Var, consumer, (byte) 0)), l811Var, (byte) 1);
            case 13:
                return new bd2(((j530) obj).a(consumer), (byte) 9);
            case 14:
                return new bd2(((acl) obj).b.a(consumer), (byte) 10);
            case 15:
                return new qe80((se80) obj, consumer);
            case 16:
                ((wp20) obj).b = new m42(consumer, (byte) 19);
                return new n1b0(this, (byte) 0);
            case 17:
                return new cn(this, consumer, (byte) 29);
            case 18:
                return new n1b0(this, (byte) 6);
            case 19:
                return new pee0((see0) obj);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Connectable) it.next()).L(consumer));
                }
                return new q1k(arrayList, (byte) 3);
            case 21:
                return new ibn((res) obj, consumer);
            case 22:
                vam0 vam0Var = (vam0) obj;
                vam0Var.d = consumer;
                return new n1b0(vam0Var, (byte) 11);
            case 23:
                uun0 uun0Var = (uun0) obj;
                uun0Var.getClass();
                return new n1b0(uun0Var, (byte) 12);
            case 24:
                return new bd2(((acl) obj).b.a(consumer), (byte) 11);
            case 25:
                return new n1b0((iu30) obj, (byte) 15);
            case 26:
                return new bd2(((MergedEventSource) obj).a(consumer), (byte) 13);
            case 27:
                return new pee0(this);
            case 28:
                return ((Connectable) obj).L(consumer);
            default:
                ((iis) obj).h = new m42(consumer, (byte) 24);
                return new n1b0(this, (byte) 17);
        }
    }

    public /* synthetic */ ku1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ku1(Connectable[] connectableArr) {
        this.a = (byte) 20;
        this.b = f46.Q0(connectableArr);
    }
}
