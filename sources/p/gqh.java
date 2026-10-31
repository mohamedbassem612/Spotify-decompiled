package p;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.Connection;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gqh implements Connection {
    public ace0 a;
    public dqh b;
    public final /* synthetic */ iqh c;
    public final /* synthetic */ ngh d;
    public final /* synthetic */ PublishSubject e;
    public final /* synthetic */ Disposable f;
    public final /* synthetic */ Connection g;

    public gqh(iqh iqhVar, ngh nghVar, PublishSubject publishSubject, Disposable disposable, Connection connection, cn cnVar) {
        this.c = iqhVar;
        this.d = nghVar;
        this.e = publishSubject;
        this.f = disposable;
        this.g = connection;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:197:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:206:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:209:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:213:0x03da  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:217:0x040e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0427  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[EDGE_INSN: B:25:0x0062->B:32:0x007c BREAK  A[LOOP:0: B:27:0x0069->B:244:?]] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:215:0x03ec, please report this as an issue */
    public final void accept(Object obj) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        skh skhVar;
        boolean z4;
        boolean z5;
        tuw tuwVar;
        boolean z6;
        String strQ;
        boolean z7;
        int i2;
        String strA;
        int i3;
        blc0 blc0Var;
        ijh ijhVar;
        qmy qmyVar;
        qmy qmyVar2;
        ijh ijhVar2;
        uge1 uge1Var;
        rph rphVar = (rph) obj;
        boolean z8 = rphVar.s;
        String str = rphVar.k;
        ace0 ace0Var = rphVar.c;
        ace0 ace0Var2 = rphVar.b;
        iqh iqhVar = this.c;
        boolean z9 = iqhVar.g;
        e93 e93Var = iqhVar.X;
        jgh jghVar = (jgh) e93Var.e;
        TextView textView = (TextView) e93Var.i;
        boolean z10 = ace0Var2 instanceof ebe0;
        ijh ijhVar3 = (!z10 || (ace0Var instanceof obe0)) ? null : (ijh) ((ebe0) ace0Var2).a;
        uge1 uge1Var2 = ijhVar3 != null ? ijhVar3.b : null;
        TextView textView2 = (TextView) e93Var.O0;
        if (!z10) {
            i = 8;
        } else if (uge1Var2 != null ? uge1Var2.a.isEmpty() : true) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        if (uge1Var2 == null) {
            z = false;
            break;
        }
        List list = uge1Var2.a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Comment) it.next()).y()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        boolean z11 = rphVar.n;
        boolean z12 = !z11 && z;
        boolean z13 = z11 && z;
        if (uge1Var2 != null) {
            List list2 = uge1Var2.a;
            if (z12) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!((Comment) obj2).y()) {
                        arrayList.add(obj2);
                    }
                }
                list2 = arrayList;
            }
            c380 c380VarA = mqo1.A(list2);
            m7 m7Var = rphVar.q;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : m7Var.a()) {
                if (!((cg21) entry.getValue()).f) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    z9 = z9;
                }
            }
            z2 = z9;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                boolean z14 = z10;
                linkedHashMap2.put(entry2.getKey(), new rkh(((cg21) entry2.getValue()).b, ((cg21) entry2.getValue()).e != null, rphVar.s, rphVar.l.containsKey(entry2.getKey()), ((cg21) entry2.getValue()).c));
                it2 = it2;
                z10 = z14;
            }
            z3 = z10;
            skhVar = new skh(c380VarA, mqo1.B(linkedHashMap2), rphVar.o);
        } else {
            z2 = z9;
            z3 = z10;
            fg91 fg91Var = fg91.b;
            dqs0 dqs0Var = dqs0.e;
            skhVar = new skh(fg91Var, dqs0Var, dqs0Var);
        }
        skh skhVar2 = skhVar;
        if (z3) {
            ijh ijhVar4 = (ijh) ((ebe0) ace0Var2).a;
            if (ijhVar4.e.length() <= 0 || u890.j(str, ijhVar4.e) || z12) {
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (z3) {
            ijh ijhVar5 = (ijh) ((ebe0) ace0Var2).a;
            if (ijhVar5.c == 1 && (str == null || str.length() == 0)) {
                ArrayList arrayListA = iqh.a(ijhVar5.b);
                ace0 ace0Var3 = this.a;
                ebe0 ebe0Var = ace0Var3 instanceof ebe0 ? (ebe0) ace0Var3 : null;
                if (arrayListA.equals((ebe0Var == null || (ijhVar2 = (ijh) ebe0Var.a) == null || (uge1Var = ijhVar2.b) == null) ? null : iqh.a(uge1Var))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        boolean z15 = !(str == null || str.length() == 0);
        Set set = rphVar.m;
        String str2 = rphVar.a;
        boolean z16 = ace0Var instanceof ebe0;
        ebe0 ebe0Var2 = z16 ? (ebe0) ace0Var : null;
        int i4 = (ebe0Var2 == null || (qmyVar2 = (qmy) ebe0Var2.a) == null) ? 0 : qmyVar2.d;
        u380 u380Var = rphVar.r;
        boolean z17 = (!z3 || ((ijh) ((ebe0) ace0Var2).a).d == tuw.f || z8) ? false : true;
        cwe1 cwe1Var = iqhVar.e;
        ebe0 ebe0Var3 = z16 ? (ebe0) ace0Var : null;
        this.e.onNext(new tkh(skhVar2, z4, z5, z15, z12, set, z13, str2, i4, u380Var, z17, z47.u(cwe1Var, (ebe0Var3 == null || (qmyVar = (qmy) ebe0Var3.a) == null) ? null : Boolean.valueOf(qmyVar.e))));
        this.a = ace0Var2;
        TextView textView3 = (TextView) e93Var.P0;
        textView.setVisibility(z16 ? 0 : 8);
        textView3.setVisibility(z16 ? 0 : 8);
        if (!(ace0Var instanceof wae0) && !(ace0Var instanceof obe0)) {
            if (!z16) {
                eg.o();
                return;
            }
            qmy qmyVar3 = (qmy) ((ebe0) ace0Var).a;
            String str3 = qmyVar3.a;
            String str4 = qmyVar3.c;
            String str5 = qmyVar3.b;
            textView.setText(str3);
            textView3.setText(iqhVar.O0.getContext().getResources().getString(2131959572, str5, str4));
            View view = (View) e93Var.t;
            CharSequence text = ((TextView) e93Var.g).getText();
            view.setContentDescription(jhc1.J("\n            " + ((Object) text) + "\n            " + qmyVar3.a + "\n            " + str5 + "\n            " + str4 + "\n          "));
        }
        boolean zC = rphVar.c();
        boolean z18 = z3 && !((ijh) ((ebe0) ace0Var2).a).b.a.isEmpty();
        int i5 = 4;
        ((Group) e93Var.h).setVisibility(zC ? 0 : 4);
        RecyclerView recyclerView = (RecyclerView) e93Var.R0;
        if (zC && z18) {
            i5 = 0;
        }
        recyclerView.setVisibility(i5);
        ((ComposeView) e93Var.N0).setVisibility(!zC ? 0 : 8);
        ebe0 ebe0Var4 = z3 ? (ebe0) ace0Var2 : null;
        if (ebe0Var4 == null || (ijhVar = (ijh) ebe0Var4.a) == null || (tuwVar = ijhVar.d) == null) {
            tuwVar = tuw.b;
        }
        Comment comment = rphVar.f12p;
        boolean zA = rphVar.e.a(Boolean.TRUE);
        dqh dqhVar = new dqh(tuwVar, comment, zA, z8);
        if (!dqhVar.equals(this.b)) {
            this.b = dqhVar;
            Group group = (Group) e93Var.S0;
            TextView textView4 = (TextView) e93Var.Y;
            ConstraintLayout constraintLayout = (ConstraintLayout) e93Var.b;
            group.setVisibility((comment == null || !zA) ? 8 : 0);
            TextView textView5 = (TextView) e93Var.T0;
            Context context = constraintLayout.getContext();
            if (comment != null) {
                int iP = comment.p();
                int i6 = iP == 0 ? -1 : eqh.a[l1d.C(iP)];
                z6 = true;
                if (i6 == 1) {
                    strQ = comment.E().q();
                } else if (i6 == 2) {
                    strQ = comment.B().p();
                }
                if (strQ == null) {
                    strQ = "";
                }
                textView5.setText(context.getString(2131961207, strQ));
                if (!z2 || z8 || (tuwVar != tuw.c && (comment == null || !zA))) {
                    z7 = false;
                } else {
                    z7 = z6;
                }
                ConstraintLayout constraintLayout2 = jghVar.a;
                if (z7) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                constraintLayout2.setVisibility(i2);
                if (z2) {
                    Set set2 = s4b1.f;
                    blc0Var = uic.x(iqhVar.f).c;
                    if (!iqh.P0.contains(blc0Var)) {
                        n57.e("Input disabled message for link type " + blc0Var + " is not supported");
                    }
                    strA = constraintLayout.getContext().getString(2131954127);
                } else {
                    strA = iqhVar.c.a(tuwVar);
                }
                strA.getClass();
                textView4.setText(strA);
                if (!z7 || strA.length() <= 0 || z8) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                textView4.setVisibility(i3);
            } else {
                z6 = true;
            }
            strQ = null;
            if (strQ == null) {
                strQ = "";
            }
            textView5.setText(context.getString(2131961207, strQ));
            if (z2) {
                z7 = false;
            } else {
                z7 = false;
            }
            ConstraintLayout constraintLayout3 = jghVar.a;
            if (z7) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            constraintLayout3.setVisibility(i2);
            if (z2) {
                Set set3 = s4b1.f;
                blc0Var = uic.x(iqhVar.f).c;
                if (!iqh.P0.contains(blc0Var)) {
                    n57.e("Input disabled message for link type " + blc0Var + " is not supported");
                }
                strA = constraintLayout.getContext().getString(2131954127);
            } else {
                strA = iqhVar.c.a(tuwVar);
            }
            strA.getClass();
            textView4.setText(strA);
            if (z7) {
                i3 = 8;
            } else {
                i3 = 8;
            }
            textView4.setVisibility(i3);
        }
        if (!z2) {
            this.d.accept(rphVar);
        }
        ((ConstraintLayout) ((cce) e93Var.Q0).b).setVisibility(rphVar.j ? 0 : 8);
        ((EncoreButton) e93Var.U0).setVisibility(z8 ? 0 : 8);
        if (jghVar.a.getVisibility() != 0 || iqhVar.a.b() - iqhVar.N0 >= 1500) {
            return;
        }
        iqhVar.N0 = 0L;
        iqhVar.Y.a();
    }

    public final void dispose() {
        this.f.dispose();
        this.g.dispose();
        this.d.dispose();
        e93 e93Var = this.c.X;
        ((EncoreButton) e93Var.d).setOnClickListener(null);
        ((EncoreButton) e93Var.U0).setOnClickListener(null);
    }
}
