package p;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.collection.componentrecycler.RangedComponentRecyclerAdapter;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.Connection;
import com.spotify.nowplayingqueue.bottomsheet.view.EditModeBarContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.JamHeaderContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueControlsLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.SessionModifierContainerView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import com.spotify.puffin.setup.setupflow.manualselect.ui.AmbiguousDeviceSelectView;
import com.spotify.puffin.setup.setupflow.manualselect.ui.ManualSelectView;
import com.spotify.puffin.setup.setupflow.ui.ErrorView;
import com.spotify.puffin.sharedui.views.DisconnectedView;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n1b0 implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1b0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(Object obj) {
        s59 s59Var = (s59) this.b;
        ne neVar = new ne(3, new j3y0(((fa01) obj).a, s59Var, (byte) 23));
        RecyclerView recyclerView = (RecyclerView) ((idd1) s59Var.c).getValue();
        ((View) s59Var.b).getContext();
        neVar.f(recyclerView, new LinearLayoutManager(1), false);
    }

    private final void b(Object obj) {
        z011 z011Var = (z011) obj;
        tkt tktVar = ((g111) this.b).c;
        tktVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (z011Var.c) {
            arrayList.add(fv31.e);
        }
        List list = z011Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new xv31((kjf1) it.next()));
        }
        arrayList.addAll(arrayList2);
        ((kdn0) tktVar.d).m(arrayList);
    }

    private final void c(Object obj) {
        gof1 gof1Var = (gof1) obj;
        bfz bfzVar = (bfz) this.b;
        FlowableMap flowableMap = (FlowableMap) bfzVar.b;
        vku vkuVar = (vku) bfzVar.e;
        if (gof1Var == gof1.a) {
            vkuVar.a(new FlowableSingleSingle(new FlowableTake(flowableMap)).map(w1x0.g).filter(y1x0.f).subscribe(new kj11(bfzVar, (byte) 1), mux0.Q0));
        } else {
            vkuVar.a(new FlowableSingleSingle(new FlowableTake(flowableMap)).map(djx0.f).filter(njx0.f).subscribe(new kj11(bfzVar, (byte) 0), mux0.P0));
        }
    }

    private final void d(Object obj) {
        px11 px11Var = (sx11) obj;
        vw11 vw11Var = (vw11) this.b;
        if (px11Var instanceof px11) {
            yw11 yw11Var = px11Var.a;
            Set set = yw11Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (((m620) obj2).d) {
                    arrayList.add(obj2);
                }
            }
            vw11Var.R0 = o7h.p1(arrayList);
            int size = yw11Var.c.size() / 2;
            if (size > 50) {
                vw11Var.S0 = size;
            }
            vw11Var.P0.onNext(yw11Var);
        } else if (px11Var instanceof qx11) {
            vw11Var.h(((qx11) px11Var).a);
        } else if (!px11Var.equals(rx11.a)) {
            eg.o();
            return;
        }
        vw11Var.t.j(px11Var);
    }

    private final void e(Object obj) {
        b061 b061Var = (b061) obj;
        e061 e061Var = (e061) this.b;
        e061Var.e = b061Var.i;
        e061Var.f.e(b061Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.RangedComponentRecyclerAdapter$NoPreloadRangeConsumerFound */
    /* JADX WARN: Code duplicated, block: B:122:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:137:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:147:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:152:0x040a  */
    /* JADX WARN: Code duplicated, block: B:153:0x041b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0420  */
    /* JADX WARN: Code duplicated, block: B:162:0x0468 A[PHI: r28
      0x0468: PHI (r28v3 boolean) = (r28v0 boolean), (r28v2 boolean), (r28v4 boolean) binds: [B:164:0x0474, B:161:0x0435, B:122:0x03a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x046b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0476  */
    /* JADX WARN: Code duplicated, block: B:167:0x047a  */
    /* JADX WARN: Code duplicated, block: B:185:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:202:0x0504  */
    /* JADX WARN: Code duplicated, block: B:203:0x050f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0530  */
    /* JADX WARN: Code duplicated, block: B:213:0x0551  */
    /* JADX WARN: Code duplicated, block: B:216:0x0560  */
    /* JADX WARN: Code duplicated, block: B:223:0x059a  */
    /* JADX WARN: Code duplicated, block: B:225:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:227:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:229:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:230:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:231:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:234:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:235:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:238:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:239:0x0600  */
    /* JADX WARN: Code duplicated, block: B:242:0x0615  */
    /* JADX WARN: Code duplicated, block: B:243:0x0618  */
    /* JADX WARN: Code duplicated, block: B:250:0x0633 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x0635  */
    /* JADX WARN: Code duplicated, block: B:252:0x0638  */
    /* JADX WARN: Code duplicated, block: B:254:0x063c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0641  */
    /* JADX WARN: Code duplicated, block: B:258:0x0649  */
    /* JADX WARN: Code duplicated, block: B:262:0x0653  */
    /* JADX WARN: Code duplicated, block: B:265:0x0659 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x0660  */
    /* JADX WARN: Code duplicated, block: B:271:0x066e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0683  */
    /* JADX WARN: Code duplicated, block: B:286:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:287:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:289:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:290:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:294:0x06da  */
    /* JADX WARN: Code duplicated, block: B:302:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:303:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:308:0x0705  */
    /* JADX WARN: Code duplicated, block: B:317:0x071a  */
    /* JADX WARN: Code duplicated, block: B:319:0x0724  */
    /* JADX WARN: Code duplicated, block: B:328:0x0741  */
    /* JADX WARN: Code duplicated, block: B:329:0x0744  */
    /* JADX WARN: Code duplicated, block: B:331:0x0747  */
    /* JADX WARN: Code duplicated, block: B:332:0x074a  */
    /* JADX WARN: Code duplicated, block: B:334:0x074d  */
    /* JADX WARN: Code duplicated, block: B:340:0x075d  */
    /* JADX WARN: Code duplicated, block: B:349:0x077a  */
    /* JADX WARN: Code duplicated, block: B:351:0x0780  */
    /* JADX WARN: Code duplicated, block: B:354:0x078b  */
    /* JADX WARN: Code duplicated, block: B:361:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:364:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:366:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:369:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:377:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:380:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:383:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:386:0x0808  */
    /* JADX WARN: Code duplicated, block: B:391:0x082e  */
    /* JADX WARN: Code duplicated, block: B:394:0x0843  */
    /* JADX WARN: Code duplicated, block: B:396:0x084d  */
    /* JADX WARN: Code duplicated, block: B:397:0x0850  */
    /* JADX WARN: Code duplicated, block: B:399:0x0853  */
    /* JADX WARN: Code duplicated, block: B:402:0x085e  */
    /* JADX WARN: Code duplicated, block: B:404:0x0861  */
    /* JADX WARN: Code duplicated, block: B:405:0x0864  */
    /* JADX WARN: Code duplicated, block: B:412:0x0878  */
    /* JADX WARN: Code duplicated, block: B:414:0x087e  */
    /* JADX WARN: Code duplicated, block: B:418:0x0894  */
    /* JADX WARN: Code duplicated, block: B:420:0x089b  */
    /* JADX WARN: Code duplicated, block: B:423:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:424:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:427:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:429:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:430:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:432:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:433:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:435:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:438:0x0937  */
    /* JADX WARN: Code duplicated, block: B:510:0x0b12 A[DONT_INVERT, PHI: r10
      0x0b12: PHI (r10v10 int) = (r10v7 int), (r10v11 int) binds: [B:509:0x0b10, B:504:0x0b05] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:511:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:512:0x0b2d  */
    /* JADX WARN: Code duplicated, block: B:514:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:515:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:518:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:519:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:522:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:524:0x0b65  */
    /* JADX WARN: Code duplicated, block: B:610:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x055a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x06ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x06a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x06ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0738 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x0735 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0806 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[LOOP:7: B:381:0x07f4->B:642:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r10v54, types: [android.view.View, com.spotify.nowplayingqueue.bottomsheet.view.QueueControlsLayout] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r3v28, types: [android.view.View, com.spotify.nowplayingqueue.bottomsheet.view.QueueControlsLayout] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View, com.spotify.puffin.sharedui.views.DisconnectedView] */
    /* JADX WARN: Type inference failed for: r5v40, types: [android.view.View, com.spotify.nowplayingqueue.bottomsheet.view.QueueControlsLayout] */
    public final void accept(Object obj) throws RangedComponentRecyclerAdapter.NoPreloadRangeConsumerFound {
        int i;
        int i2;
        int i3;
        g4b1 g4b1Var;
        int i4;
        int i5;
        int i6;
        i0a0 i0a0Var;
        s5u s5uVar;
        boolean z;
        ValueAnimator valueAnimator;
        boolean z2;
        x9z0 x9z0Var;
        x9z0 x9z0Var2;
        ValueAnimator valueAnimator2;
        int i7;
        View childAt;
        View view;
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        sfg sfgVar;
        vfg vfgVar;
        tfg tfgVar;
        boolean z6;
        obz0 obz0Var;
        List list;
        ArrayList arrayListN0;
        Set set;
        List listA;
        LinkedHashSet linkedHashSetR;
        ArrayList arrayList;
        Iterator it;
        ?? r14;
        boolean zHasNext;
        List list2;
        RecyclerView recyclerView;
        ccz0 ccz0Var;
        ArrayList<caz0> arrayList2;
        boolean zS;
        boolean zI;
        Iterator it2;
        Object next;
        ivf1 ivf1Var;
        boolean zI2;
        int i9;
        int i10;
        Iterator it3;
        j4u j4uVarP;
        bdz0 bdz0Var;
        hjf1 hjf1VarX;
        hjf1 hjf1VarX2;
        cno cnoVar;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        ArrayList arrayList3;
        aek1 aek1Var;
        ivf1 ivf1Var2;
        String str;
        hjf1 hjf1Var;
        int i11;
        Iterator it4;
        int i12;
        Object objT0;
        ivf1 ivf1Var3;
        hjf1 hjf1Var2;
        ContextTrack contextTrack;
        int i13;
        caz0 caz0Var;
        hjf1 hjf1Var3;
        ContextTrack contextTrack2;
        caz0 caz0Var2;
        Object next2;
        int i14;
        ContextTrack contextTrack3;
        List list3;
        kw21 kw21Var;
        boolean zJ;
        List list4;
        boolean z7;
        boolean z8;
        String str2;
        String strA0;
        String str3;
        boolean z9;
        boolean z10;
        aak0 aak0VarB;
        hlk0 hlk0Var;
        ArrayList arrayList4;
        qfz0 qfz0Var;
        h5z h5zVarX0;
        a layoutManager;
        byte b = this.a;
        byte b2 = 25;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                wp20 wp20Var = (wp20) ((ku1) obj2).b;
                List list5 = ((v9h) obj).b;
                ((GridLayoutManager) wp20Var.d).m1 = new a5x(list5, (byte) 1);
                ((hv41) wp20Var.c).C(list5);
                return;
            case 1:
                ((heb0) obj2).c.setValue((eeb0) obj);
                return;
            case 2:
                l4c0 l4c0Var = (l4c0) obj;
                n4c0 n4c0Var = (n4c0) obj2;
                if (l4c0Var.equals(l4c0.b)) {
                    ((View) n4c0Var.f.getValue()).setVisibility(0);
                    return;
                }
                if (l4c0Var.equals(l4c0.a)) {
                    n4c0Var.a(n3u.b);
                    return;
                }
                if (l4c0Var.equals(l4c0.d)) {
                    n4c0Var.a(n3u.d);
                    return;
                }
                if (l4c0Var.equals(l4c0.c)) {
                    n4c0Var.a(n3u.c);
                    return;
                } else if (l4c0Var.equals(l4c0.e)) {
                    n4c0Var.a(n3u.e);
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 3:
                if (obj == null) {
                    return;
                }
                bhn0.d();
                return;
            case 4:
                if (obj == null) {
                    return;
                }
                bhn0.d();
                return;
            case 5:
                fqd0 fqd0Var = (gqd0) obj;
                boolean z11 = fqd0Var instanceof fqd0;
                kqd0 kqd0Var = (kqd0) obj2;
                xzf xzfVar = kqd0Var.a;
                cr6 cr6Var = kqd0Var.d;
                if (!z11) {
                    cr6Var.g = null;
                    xzfVar.accept((Object) null);
                    return;
                }
                cr6Var.g = fqd0Var.d;
                kqd0Var.R0.e(fqd0Var);
                dtw dtwVar = kqd0Var.Z;
                if (dtwVar != null) {
                    xzfVar.accept((View) dtwVar.w.getParent());
                    return;
                } else {
                    u890.C("connectButtonVH");
                    throw null;
                }
            case 6:
                ((ko11) ((ku1) obj2).b).accept((gud0) obj);
                return;
            case 7:
                qkg0 qkg0Var = (tkg0) obj;
                s59 s59Var = (s59) obj2;
                mzr0 mzr0Var = (mzr0) s59Var.d;
                EncoreButton encoreButton = (EncoreButton) mzr0Var.b;
                ?? r3 = (DisconnectedView) mzr0Var.d;
                ErrorView errorView = (ErrorView) mzr0Var.f;
                AmbiguousDeviceSelectView ambiguousDeviceSelectView = (AmbiguousDeviceSelectView) mzr0Var.a;
                ManualSelectView manualSelectView = (ManualSelectView) mzr0Var.g;
                encoreButton.setVisibility(qkg0Var.a() ? 0 : 8);
                boolean z12 = qkg0Var instanceof skg0;
                manualSelectView.setVisibility(z12 ? 0 : 8);
                boolean z13 = qkg0Var instanceof okg0;
                ambiguousDeviceSelectView.setVisibility(z13 ? 0 : 8);
                boolean z14 = qkg0Var instanceof qkg0;
                errorView.setVisibility(z14 ? 0 : 8);
                boolean z15 = qkg0Var instanceof pkg0;
                r3.setVisibility(z15 ? 0 : 8);
                boolean z16 = qkg0Var instanceof rkg0;
                ((ProgressBar) mzr0Var.e).setVisibility(z16 ? 0 : 8);
                if (z12) {
                    manualSelectView.U0.C(((skg0) qkg0Var).a);
                    return;
                }
                if (z13) {
                    okg0 okg0Var = (okg0) qkg0Var;
                    epy0 epy0Var = ambiguousDeviceSelectView.T0;
                    epy0Var.d.setText(ambiguousDeviceSelectView.getContext().getString(2131960659, okg0Var.c));
                    epy0Var.a.setVisibility(okg0Var.a ? 0 : 8);
                    ambiguousDeviceSelectView.U0.C(okg0Var.b);
                    return;
                }
                if (z14) {
                    qkg0 qkg0Var2 = qkg0Var;
                    errorView.y(qkg0Var2.a, new yge0(qkg0Var2, s59Var, (byte) 12));
                    return;
                } else if (z15) {
                    r3.setActions(new mre0(s59Var, (byte) 4));
                    return;
                } else {
                    if (z16) {
                        return;
                    }
                    eg.o();
                    return;
                }
            case 8:
                msg0 msg0Var = (msg0) obj;
                goq goqVar = (goq) ((fsg0) obj2).b;
                boolean z17 = msg0Var.b;
                List list6 = msg0Var.d;
                list6.size();
                lag lagVar = (lag) ((h0y) goqVar.b).b;
                k9r k9rVar = (k9r) goqVar.g;
                ((vw40) ((idd1) k9rVar.d).getValue()).a.setVisibility(list6.isEmpty() ? 0 : 8);
                ((vw40) ((idd1) k9rVar.d).getValue()).b.setText(2131958180);
                Group group = (Group) lagVar.c;
                CheckBox checkBox = (CheckBox) lagVar.e;
                View view2 = (View) lagVar.b;
                Button button = (Button) lagVar.d;
                group.setVisibility(list6.isEmpty() ? 8 : 0);
                boolean z18 = msg0Var.c;
                if (z18) {
                    i = 8;
                    if (button.getVisibility() == 8) {
                        if (z18) {
                            button.animate().alpha(1.0f).start();
                            view2.animate().alpha(1.0f).start();
                        } else {
                            button.animate().alpha(0.0f).start();
                            view2.animate().alpha(0.0f).start();
                        }
                    }
                    if (z18) {
                        i2 = 0;
                    } else {
                        i2 = i;
                    }
                    button.setVisibility(i2);
                    if (z18) {
                        i3 = 0;
                    } else {
                        i3 = i;
                    }
                    view2.setVisibility(i3);
                    checkBox.setChecked(z17);
                    if (z17) {
                        g4b1Var = (g4b1) ((idd1) goqVar.e).getValue();
                    } else {
                        g4b1Var = (Drawable) ((idd1) goqVar.d).getValue();
                    }
                    checkBox.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) g4b1Var, (Drawable) null);
                    ((lcb0) goqVar.c).C(list6);
                    return;
                }
                i = 8;
                if (!z18 && button.getVisibility() == 0) {
                    if (z18) {
                        button.animate().alpha(1.0f).start();
                        view2.animate().alpha(1.0f).start();
                    } else {
                        button.animate().alpha(0.0f).start();
                        view2.animate().alpha(0.0f).start();
                    }
                }
                if (z18) {
                    i2 = 0;
                } else {
                    i2 = i;
                }
                button.setVisibility(i2);
                if (z18) {
                    i3 = 0;
                } else {
                    i3 = i;
                }
                view2.setVisibility(i3);
                checkBox.setChecked(z17);
                if (z17) {
                    g4b1Var = (g4b1) ((idd1) goqVar.e).getValue();
                } else {
                    g4b1Var = (Drawable) ((idd1) goqVar.d).getValue();
                }
                checkBox.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) g4b1Var, (Drawable) null);
                ((lcb0) goqVar.c).C(list6);
                return;
            case 9:
                ((r4u) ((spk) obj2).i).e((bmi0) obj);
                return;
            case 10:
                ((r4u) ((co6) obj2).g).e((omi0) obj);
                return;
            case 11:
                return;
            case 12:
                qun0 qun0Var = (qun0) obj;
                uun0 uun0Var = (uun0) obj2;
                Iterator it5 = ((Set) uun0Var.a.get()).iterator();
                while (it5.hasNext()) {
                    ((wwn0) it5.next()).a(uun0Var.b, qun0Var.a, qun0Var.b, qun0Var.c, qun0Var.d, qun0Var.e, qun0Var.g, Collections.singleton(y2h1.b), qun0Var.f);
                }
                return;
            case 13:
                mvo0 mvo0Var = ((bwo0) obj2).b;
                mvo0Var.g = ((xvo0) obj).a;
                mvo0Var.h();
                return;
            case 14:
                return;
            case 15:
                ((iu30) obj2).invoke(((wys0) obj).a);
                return;
            case 16:
                h1w0 h1w0Var = (h1w0) obj;
                bfz bfzVar = (bfz) obj2;
                bfz bfzVar2 = (bfz) bfzVar.e;
                t2w0 t2w0Var = (t2w0) bfzVar.d;
                bfzVar2.d = t2w0Var;
                ljd0 ljd0Var = t2w0Var.m;
                if (ljd0Var != null) {
                    int iC = l1d.C(ljd0Var.b);
                    if (iC == 0) {
                        i4 = 3;
                    } else if (iC == 1) {
                        i4 = 2;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return;
                        }
                        i4 = 1;
                    }
                    bfzVar2.e = new wcl0(i4, (Integer) null, ljd0Var.a, r6h1.c);
                }
                xmu0 xmu0Var = (xmu0) bfzVar.b;
                o0g1 o0g1Var = (o0g1) xmu0Var.b;
                j4w0 j4w0Var = h1w0Var.a.a;
                o0g1Var.f = j4w0Var;
                ((uhs) o0g1Var.d).f(j4w0.a(j4w0Var, o0g1Var.b));
                z0w0 z0w0Var = (z0w0) xmu0Var.c;
                bk7 bk7Var = z0w0Var.k;
                ArrayList arrayListI = pqo.i(new hzu0(z0w0Var, h1w0Var, (byte) 16));
                c21 c21Var = (c21) bk7Var.e;
                ArrayList arrayList5 = (ArrayList) c21Var.f;
                j4u j4uVarP2 = w0h1.p(new r0i((byte) 0, arrayList5, (LinkedHashMap) c21Var.b, arrayListI));
                arrayList5.clear();
                arrayList5.addAll(arrayListI);
                j4uVarP2.b(bk7Var);
                return;
            case 17:
                nzw0 nzw0Var = (nzw0) obj;
                iis iisVar = (iis) ((ku1) obj2).b;
                int iC2 = l1d.C(nzw0Var.d);
                if (iC2 == 0) {
                    i5 = 1;
                } else if (iC2 == 1) {
                    i5 = 2;
                } else if (iC2 == 2) {
                    i5 = 3;
                } else {
                    if (iC2 != 3) {
                        eg.o();
                        return;
                    }
                    i5 = 4;
                }
                String str4 = nzw0Var.a;
                String str5 = nzw0Var.e;
                if (str5 == null) {
                    str5 = nzw0Var.b;
                }
                String str6 = nzw0Var.f;
                if (str6 == null) {
                    str6 = nzw0Var.c;
                }
                iisVar.k.e(new jxw0(i5, str4, str5, str6, nzw0Var.g, nzw0Var.j));
                return;
            case 18:
                hcz0 hcz0Var = (hcz0) obj;
                boolean z19 = hcz0Var.z;
                ccz0 ccz0Var2 = (ccz0) obj2;
                eh4 eh4Var = ccz0Var2.h;
                o860 o860Var = ccz0Var2.Z;
                mnb0 mnb0Var = ccz0Var2.a;
                ConstraintLayout constraintLayout = mnb0Var.b;
                ComposeView composeView = mnb0Var.e;
                RecyclerView recyclerView4 = mnb0Var.c;
                boolean z20 = hcz0Var.v;
                boolean z21 = hcz0Var.f;
                boolean z22 = hcz0Var.l;
                ContextTrack contextTrack4 = hcz0Var.a;
                Map map = hcz0Var.e;
                List list7 = hcz0Var.d;
                boolean z23 = hcz0Var.m;
                List list8 = hcz0Var.c;
                ktw0 ktw0Var = hcz0Var.k;
                int i15 = hcz0Var.J;
                if (!z20) {
                    composeView.setVisibility(8);
                    recyclerView4.setVisibility(8);
                    constraintLayout.setVisibility(8);
                    ((QueueControlsLayout) o860Var.d).setVisibility(8);
                } else if (contextTrack4 == null && list8.isEmpty() && list7.isEmpty()) {
                    composeView.setVisibility(0);
                    composeView.setContent(new j2i(-1516210222, new k750((byte) 25, z22), true));
                    recyclerView4.setVisibility(8);
                    constraintLayout.setVisibility(8);
                    ((QueueControlsLayout) o860Var.d).setVisibility(8);
                } else {
                    boolean z24 = ktw0Var instanceof jtw0;
                    composeView.setVisibility(8);
                    recyclerView4.setVisibility(0);
                    constraintLayout.setVisibility(0);
                    ((QueueControlsLayout) o860Var.d).setVisibility(!z24 ? 0 : 8);
                }
                boolean z25 = ktw0Var instanceof itw0;
                boolean z26 = recyclerView4.computeVerticalScrollOffset() > 0 && !recyclerView4.canScrollVertically(1);
                mnb0 mnb0Var2 = mnb0Var;
                ccz0Var2.P0.f(new m9z0(z25, xbz0.a[l1d.C(i15)] == 1 ? new o9z0(map.size()) : n9z0.d, hcz0Var.g));
                hur hurVar = ccz0Var2.g;
                ccz0Var2.X0.f(Boolean.valueOf(eh4Var.h() && hcz0Var.r && i15 != 2 && !z23));
                int iC3 = l1d.C(i15);
                if (iC3 == 0) {
                    mnb0Var2 = mnb0Var2;
                    if (z23 != 0) {
                        ((SessionModifierContainerView) o860Var.e).setVisibility(8);
                    } else {
                        SessionModifierContainerView sessionModifierContainerView = (SessionModifierContainerView) o860Var.e;
                        sessionModifierContainerView.setVisibility(0);
                        int i16 = ccz0Var2.g1;
                        if (i16 == 1 || i16 == 0) {
                            z25 = z25;
                            i6 = 1;
                            gd61 gd61Var = new gd61(hcz0Var.I, ktw0Var instanceof itw0, hcz0Var.s, hcz0Var.l, !ktw0Var.a().isEmpty());
                            if (!u890.j(ccz0Var2.Z0, gd61Var)) {
                                sessionModifierContainerView.b(null, hurVar.n(gd61Var));
                                ccz0Var2.Z0 = gd61Var;
                            }
                        } else {
                            ccz0Var2.a((EditModeBarContainerView) o860Var.b, sessionModifierContainerView, (View) o860Var.c, new acz0(ccz0Var2, (byte) 4), new acz0(ccz0Var2, (byte) 5));
                            gd61 gd61Var2 = new gd61(hcz0Var.I, ktw0Var instanceof itw0, hcz0Var.s, hcz0Var.l, !ktw0Var.a().isEmpty());
                            sessionModifierContainerView.b(Integer.valueOf(sessionModifierContainerView.getMeasuredHeight()), hurVar.n(gd61Var2));
                            ccz0Var2.Z0 = gd61Var2;
                        }
                        ccz0Var2.g1 = i6;
                    }
                    i6 = 1;
                    ccz0Var2.g1 = i6;
                } else {
                    if (iC3 != 1) {
                        eg.o();
                        return;
                    }
                    int size = map.size();
                    ccz0Var2.U0.f(Boolean.valueOf(size > 0));
                    ccz0Var2.V0.f(Integer.valueOf(size));
                    ccz0Var2.W0.f(Integer.valueOf(size));
                    int i17 = ccz0Var2.g1;
                    byte b3 = 2;
                    if (i17 != 2 && i17 != 0) {
                        ccz0Var2.a((SessionModifierContainerView) o860Var.e, (EditModeBarContainerView) o860Var.b, (View) o860Var.c, new acz0(ccz0Var2, b3), new acz0(ccz0Var2, (byte) 3));
                    }
                    ccz0Var2.g1 = 2;
                    z25 = z25;
                }
                JamHeaderContainerView jamHeaderContainerView = mnb0Var2.d;
                if (jamHeaderContainerView.isAttachedToWindow()) {
                    w9z0 w9z0Var = ccz0Var2.f;
                    Iterator it6 = w9z0Var.b.iterator();
                    do {
                        if (it6.hasNext()) {
                            i0a0Var = (i0a0) w9z0Var.a.get((x9z0) it6.next());
                            if (i0a0Var == null || i0a0Var.b.getValue() == null) {
                                i0a0Var = null;
                            }
                        } else {
                            i0a0Var = null;
                        }
                        s5uVar = s5u.c;
                        if (i0a0Var != null) {
                            x9z0Var = ccz0Var2.c1;
                            x9z0Var2 = x9z0.a;
                            if (x9z0Var2 != x9z0Var && jamHeaderContainerView.getChildCount() != 0) {
                                jamHeaderContainerView.removeAllViews();
                            }
                            ccz0Var2.c1 = x9z0Var2;
                            valueAnimator2 = ccz0Var2.d1;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ccz0Var2.d1 = null;
                            if (jamHeaderContainerView.getChildCount() == 0) {
                                try {
                                    view = u2o1.u((wpw) i0a0Var.a.getValue(), jamHeaderContainerView).w;
                                } catch (Exception unused) {
                                    view = null;
                                }
                                if (view == null) {
                                    ccz0Var2.c1 = null;
                                    z2 = false;
                                    jamHeaderContainerView.getLayoutParams().height = 0;
                                    jamHeaderContainerView.setVisibility(8);
                                } else {
                                    i7 = 0;
                                    jamHeaderContainerView.addView(view);
                                }
                            } else {
                                i7 = 0;
                            }
                            childAt = jamHeaderContainerView.getChildAt(i7);
                            if (childAt != null || (jamHeaderContainerView.getVisibility() == 0 && jamHeaderContainerView.getLayoutParams().height != 0)) {
                                z = false;
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(jamHeaderContainerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                z = false;
                                ccz0Var2.d1 = p6p1.u(jamHeaderContainerView, s5uVar, 0, childAt.getMeasuredHeight(), 0.0f, 1.0f, new tpj1(new bcz0(jamHeaderContainerView, ccz0Var2, (byte) 0), (byte) 8));
                            }
                            z2 = z;
                            break;
                        } else {
                            z = false;
                            ccz0Var2.c1 = null;
                            if (jamHeaderContainerView.getChildCount() != 0) {
                                valueAnimator = ccz0Var2.d1;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                z2 = false;
                                ccz0Var2.d1 = p6p1.u(jamHeaderContainerView, s5uVar, jamHeaderContainerView.getMeasuredHeight(), 0, 1.0f, 0.0f, new mws0(jamHeaderContainerView, new bcz0(jamHeaderContainerView, ccz0Var2, (byte) 1), (byte) 2));
                            } else {
                                z2 = z;
                            }
                        }
                    } while (i0a0Var == null);
                    s5uVar = s5u.c;
                    if (i0a0Var != null) {
                        x9z0Var = ccz0Var2.c1;
                        x9z0Var2 = x9z0.a;
                        if (x9z0Var2 != x9z0Var) {
                            jamHeaderContainerView.removeAllViews();
                        }
                        ccz0Var2.c1 = x9z0Var2;
                        valueAnimator2 = ccz0Var2.d1;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ccz0Var2.d1 = null;
                        if (jamHeaderContainerView.getChildCount() == 0) {
                            view = u2o1.u((wpw) i0a0Var.a.getValue(), jamHeaderContainerView).w;
                            if (view == null) {
                                ccz0Var2.c1 = null;
                                z2 = false;
                                jamHeaderContainerView.getLayoutParams().height = 0;
                                jamHeaderContainerView.setVisibility(8);
                            } else {
                                i7 = 0;
                                jamHeaderContainerView.addView(view);
                            }
                        } else {
                            i7 = 0;
                        }
                        childAt = jamHeaderContainerView.getChildAt(i7);
                        if (childAt != null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        z2 = z;
                    } else {
                        z = false;
                        ccz0Var2.c1 = null;
                        if (jamHeaderContainerView.getChildCount() != 0) {
                            valueAnimator = ccz0Var2.d1;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            z2 = false;
                            ccz0Var2.d1 = p6p1.u(jamHeaderContainerView, s5uVar, jamHeaderContainerView.getMeasuredHeight(), 0, 1.0f, 0.0f, new mws0(jamHeaderContainerView, new bcz0(jamHeaderContainerView, ccz0Var2, (byte) 1), (byte) 2));
                        } else {
                            z2 = z;
                        }
                    }
                } else {
                    z = false;
                    z2 = z;
                }
                lx01 lx01Var = ccz0Var2.Y0;
                if (hcz0Var.q) {
                    i8 = 1;
                    if (i15 == 1) {
                        z3 = true;
                    }
                    lx01Var.f(new jx01(z3));
                    if ((ktw0Var instanceof jtw0) && !(ktw0Var instanceof htw0) && i15 == i8 && !list8.isEmpty() && z23 == 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    int size2 = list8.size();
                    if ((ktw0Var instanceof jtw0) && !(ktw0Var instanceof htw0) && i15 == 1 && z25 && z23 == 0 && !(list8.isEmpty() && list7.isEmpty())) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    sfgVar = new sfg(size2, z4, !z5);
                    vfgVar = ccz0Var2.R0;
                    tfgVar = ccz0Var2.Q0;
                    if (z25) {
                        tfgVar.z(sfgVar);
                        vfgVar.z(sfg.a(sfgVar));
                    } else {
                        tfgVar.z(sfg.a(sfgVar));
                        vfgVar.z(sfgVar);
                    }
                    ccz0Var2.S0.f(new xnv(z5, !z4));
                    krg krgVar = ccz0Var2.T0;
                    if (z25 || i15 != 2) {
                        z6 = z2;
                    } else {
                        z6 = true;
                    }
                    krgVar.f(Boolean.valueOf(z6));
                    obz0Var = ccz0Var2.e;
                    list = list7;
                    arrayListN0 = o7h.N0(list, list8);
                    set = hcz0Var.G;
                    Set set2 = wlm.a;
                    if (!set.isEmpty()) {
                        arrayList4 = new ArrayList();
                        for (Object obj3 : arrayListN0) {
                            if (!set.contains(l4o1.c0((ContextTrack) obj3))) {
                                arrayList4.add(obj3);
                            }
                        }
                        arrayListN0 = arrayList4;
                    }
                    listA = wlm.a(arrayListN0, hcz0Var.B, hcz0Var.o);
                    linkedHashSetR = v1p1.r(hcz0Var);
                    arrayList = new ArrayList(q7h.U(listA, 10));
                    it = listA.iterator();
                    r14 = z2;
                    while (true) {
                        zHasNext = it.hasNext();
                        list2 = z6x.a;
                        if (zHasNext) {
                            recyclerView = recyclerView4;
                            ccz0Var = ccz0Var2;
                            arrayList2 = new ArrayList(arrayList);
                            arrayList2.add(0, new sq41());
                            if (contextTrack4 != 0) {
                                zS = l4o1.S(contextTrack4);
                            } else {
                                zS = false;
                            }
                            if (contextTrack4 != 0) {
                                zI = l4o1.I(contextTrack4);
                            } else {
                                zI = false;
                            }
                            it2 = arrayList2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    caz0Var2 = (caz0) next;
                                    if ((caz0Var2 instanceof ivf1) || ((ivf1) caz0Var2).a.g) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            if (next instanceof ivf1) {
                                ivf1Var = (ivf1) next;
                            } else {
                                ivf1Var = null;
                            }
                            if (ivf1Var != null || (contextTrack2 = ivf1Var.a.h) == null) {
                                zI2 = false;
                            } else {
                                zI2 = l4o1.I(contextTrack2);
                            }
                            i9 = -1;
                            if (z25 && !zI && (!zS || !zI2)) {
                                it4 = arrayList2.iterator();
                                i12 = 0;
                                while (true) {
                                    if (it4.hasNext()) {
                                        caz0Var = (caz0) it4.next();
                                        if (caz0Var instanceof ivf1) {
                                            hjf1Var3 = ((ivf1) caz0Var).a;
                                            if (!l4o1.I(hjf1Var3.h) || hjf1Var3.g) {
                                            }
                                        }
                                        i12++;
                                    } else {
                                        i12 = -1;
                                    }
                                }
                                objT0 = o7h.t0(i12, arrayList2);
                                if (objT0 instanceof ivf1) {
                                    ivf1Var3 = (ivf1) objT0;
                                } else {
                                    ivf1Var3 = null;
                                }
                                if (ivf1Var3 != null) {
                                    hjf1Var2 = ivf1Var3.a;
                                } else {
                                    hjf1Var2 = null;
                                }
                                if (hjf1Var2 != null) {
                                    contextTrack = hjf1Var2.h;
                                    if (i12 >= 0 && i12 < arrayList2.size()) {
                                        if (h4o1.o(contextTrack) && (l4o1.P(contextTrack) || l4o1.G(contextTrack))) {
                                            i13 = 2;
                                        } else {
                                            i13 = 1;
                                        }
                                        arrayList2.add(i12, new vg51(i13));
                                    }
                                }
                            }
                            if (ktw0Var.j()) {
                                if (!ktw0Var.h()) {
                                    i11 = 0;
                                    for (caz0 caz0Var3 : arrayList2) {
                                        if ((caz0Var3 instanceof ivf1) || l4o1.S(((ivf1) caz0Var3).a.h)) {
                                            i11++;
                                        } else {
                                            i9 = i11;
                                            if (i9 >= 0 && i9 < arrayList2.size()) {
                                                arrayList2.add(i9, new vg51(3));
                                            }
                                        }
                                    }
                                    if (i9 >= 0) {
                                        arrayList2.add(i9, new vg51(3));
                                    }
                                }
                            } else if (ktw0Var instanceof htw0) {
                                i10 = 0;
                                for (caz0 caz0Var4 : arrayList2) {
                                    if ((caz0Var4 instanceof ivf1) || l4o1.S(((ivf1) caz0Var4).a.h)) {
                                        i10++;
                                    } else {
                                        i9 = i10;
                                        if ((list instanceof Collection) || !list.isEmpty()) {
                                            it3 = list.iterator();
                                            while (it3.hasNext()) {
                                                if (h4o1.o((ContextTrack) it3.next())) {
                                                    if (i9 >= 0 && i9 < arrayList2.size()) {
                                                        arrayList2.add(i9, new vg51(3));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (list instanceof Collection) {
                                    it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (h4o1.o((ContextTrack) it3.next())) {
                                            if (i9 >= 0) {
                                                arrayList2.add(i9, new vg51(3));
                                            }
                                        }
                                    }
                                } else {
                                    it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (h4o1.o((ContextTrack) it3.next())) {
                                            if (i9 >= 0) {
                                                arrayList2.add(i9, new vg51(3));
                                            }
                                        }
                                    }
                                }
                            }
                            j4uVarP = w0h1.p(new e7v0(obz0Var.X, arrayList2, (byte) 1));
                            obz0Var.X = new ArrayList(arrayList2);
                            bdz0Var = obz0Var.P0;
                            if (bdz0Var != null) {
                                arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                                for (caz0 caz0Var5 : arrayList2) {
                                    if (caz0Var5 instanceof ivf1) {
                                        ivf1Var2 = (ivf1) caz0Var5;
                                    } else {
                                        ivf1Var2 = null;
                                    }
                                    if (ivf1Var2 != null) {
                                        hjf1Var = ivf1Var2.a;
                                        if (l4o1.C(hjf1Var.h)) {
                                            hjf1Var = null;
                                        }
                                        if (hjf1Var != null) {
                                            str = hjf1Var.b;
                                        } else {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    arrayList3.add(str);
                                }
                                aek1Var = bdz0Var.b;
                                if (aek1Var.c != null || !arrayList3.equals(bdz0Var.c)) {
                                    bdz0Var.c = arrayList3;
                                    if (aek1Var.c == null) {
                                        aek1Var.a(bdz0Var.d);
                                    }
                                    aek1Var.c = Integer.valueOf(arrayList3.size());
                                    bdz0Var.a();
                                }
                            }
                            if (obz0Var.O0) {
                                obz0Var.O0 = false;
                                recyclerView2 = obz0Var.Z;
                                if (recyclerView2 != null) {
                                    recyclerView2.setItemAnimator((e611) null);
                                }
                                j4uVarP.b(obz0Var);
                                recyclerView3 = obz0Var.Z;
                                if (recyclerView3 != null) {
                                    recyclerView3.post(new an90(obz0Var, (byte) 28));
                                }
                            } else {
                                j4uVarP.b(obz0Var);
                            }
                            if (yoo1.w(eh4Var)) {
                                hjf1VarX2 = yoo1.x(hcz0Var, eh4Var);
                                if (hjf1VarX2 == null) {
                                    cnoVar = null;
                                } else {
                                    cnoVar = new cno(hjf1VarX2.b, d9y0.w(hjf1VarX2, z21), hjf1VarX2.x, l4o1.C(hjf1VarX2.h));
                                }
                                if (cnoVar != null) {
                                    ((dtw) ccz0Var.O0.getValue()).f(cnoVar);
                                }
                            } else {
                                qzh qzhVar = (qzh) ccz0Var.N0.getValue();
                                hjf1VarX = yoo1.x(hcz0Var, eh4Var);
                                if (hjf1VarX == null) {
                                    hjf1VarX = new hjf1("", "", "", "", null, 0, false, ContextTrack.create(""), ezf1.c, true, true, 1, false, false, true, k4m.d, list2, false, false, false, false, false, null, false);
                                }
                                qzhVar.f(d9y0.w(hjf1VarX, z21));
                            }
                            if (z26) {
                                aiq0.a(recyclerView, new xwn1(recyclerView, recyclerView, (byte) 20));
                                return;
                            }
                            return;
                        }
                        next2 = it.next();
                        i14 = r14 + 1;
                        if (r14 >= 0) {
                            p7h.T();
                            throw null;
                        }
                        contextTrack3 = (ContextTrack) next2;
                        list3 = listA;
                        Iterator it7 = it;
                        kw21Var = (kw21) hcz0Var.A.get(contextTrack3.uri());
                        String strUri = contextTrack3.uri();
                        if (z19) {
                            zJ = u890.j(hcz0Var.D.get(contextTrack3.uri()), Boolean.TRUE);
                        } else if (l4o1.C(contextTrack3)) {
                            zJ = false;
                        } else {
                            zJ = true;
                        }
                        boolean zContains = linkedHashSetR.contains(l4o1.c0(contextTrack3));
                        Restrictions restrictions = hcz0Var.j;
                        boolean z27 = zJ;
                        if (z22 != 0) {
                            list4 = hcz0Var.n;
                        } else {
                            list4 = list2;
                        }
                        if (r14 == p7h.L(list3)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean zF = eh4Var.f();
                        ktw0 ktw0Var2 = hcz0Var.k;
                        boolean zB = ydh.b(ln91.a(contextTrack3));
                        if (i15 == 2) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean zContainsKey = map.containsKey(l4o1.c0(contextTrack3));
                        if (z19 || !l4o1.C(contextTrack3)) {
                            if (kw21Var != null) {
                                strA0 = kw21Var.a;
                            } else {
                                str2 = null;
                            }
                            if (kw21Var != null) {
                                str3 = kw21Var.c;
                            } else {
                                str3 = null;
                            }
                            if (!eh4Var.k() || l4o1.L(contextTrack3)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (hcz0Var.C || !z27 || zContains) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String str7 = (String) hcz0Var.E.get(strUri);
                            if (kw21Var != null || (hlk0Var = kw21Var.e) == null) {
                                aak0VarB = null;
                            } else {
                                if (!hcz0Var.u || z22) {
                                    hlk0Var = null;
                                }
                                if (hlk0Var != null) {
                                    aak0VarB = yoo1.B(hlk0Var);
                                } else {
                                    aak0VarB = null;
                                }
                            }
                            arrayList.add(new ivf1(d4o1.r(contextTrack3, r14 == true ? 1 : 0, restrictions, list4, zF, z7, ktw0Var2, zB, z8, zContainsKey, str2, str3, z9, zContains, z10, str7, aak0VarB, eh4Var.m())));
                            listA = list3;
                            r14 = i14;
                            it = it7;
                            recyclerView4 = recyclerView4;
                            ccz0Var2 = ccz0Var2;
                        } else {
                            strA0 = l4o1.a0(contextTrack3, "image_url");
                        }
                        str2 = strA0;
                        if (kw21Var != null) {
                            str3 = kw21Var.c;
                        } else {
                            str3 = null;
                        }
                        if (eh4Var.k()) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (hcz0Var.C) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        String str8 = (String) hcz0Var.E.get(strUri);
                        if (kw21Var != null) {
                            aak0VarB = null;
                        } else {
                            aak0VarB = null;
                        }
                        arrayList.add(new ivf1(d4o1.r(contextTrack3, r14 == true ? 1 : 0, restrictions, list4, zF, z7, ktw0Var2, zB, z8, zContainsKey, str2, str3, z9, zContains, z10, str8, aak0VarB, eh4Var.m())));
                        listA = list3;
                        r14 = i14;
                        it = it7;
                        recyclerView4 = recyclerView4;
                        ccz0Var2 = ccz0Var2;
                    }
                } else {
                    i8 = 1;
                }
                z3 = z2;
                lx01Var.f(new jx01(z3));
                if (ktw0Var instanceof jtw0) {
                    z4 = z2;
                } else {
                    z4 = z2;
                }
                int size3 = list8.size();
                if (ktw0Var instanceof jtw0) {
                    z5 = z2;
                } else {
                    z5 = z2;
                }
                sfgVar = new sfg(size3, z4, !z5);
                vfgVar = ccz0Var2.R0;
                tfgVar = ccz0Var2.Q0;
                if (z25) {
                    tfgVar.z(sfgVar);
                    vfgVar.z(sfg.a(sfgVar));
                } else {
                    tfgVar.z(sfg.a(sfgVar));
                    vfgVar.z(sfgVar);
                }
                ccz0Var2.S0.f(new xnv(z5, !z4));
                krg krgVar2 = ccz0Var2.T0;
                if (z25) {
                    z6 = z2;
                } else {
                    z6 = z2;
                }
                krgVar2.f(Boolean.valueOf(z6));
                obz0Var = ccz0Var2.e;
                list = list7;
                arrayListN0 = o7h.N0(list, list8);
                set = hcz0Var.G;
                Set set3 = wlm.a;
                if (!set.isEmpty()) {
                    arrayList4 = new ArrayList();
                    while (r5.hasNext()) {
                        if (!set.contains(l4o1.c0((ContextTrack) obj3))) {
                            arrayList4.add(obj3);
                        }
                    }
                    arrayListN0 = arrayList4;
                }
                listA = wlm.a(arrayListN0, hcz0Var.B, hcz0Var.o);
                linkedHashSetR = v1p1.r(hcz0Var);
                arrayList = new ArrayList(q7h.U(listA, 10));
                it = listA.iterator();
                r14 = z2;
                while (true) {
                    zHasNext = it.hasNext();
                    list2 = z6x.a;
                    if (zHasNext) {
                        recyclerView = recyclerView4;
                        ccz0Var = ccz0Var2;
                        arrayList2 = new ArrayList(arrayList);
                        arrayList2.add(0, new sq41());
                        if (contextTrack4 != 0) {
                            zS = l4o1.S(contextTrack4);
                        } else {
                            zS = false;
                        }
                        if (contextTrack4 != 0) {
                            zI = l4o1.I(contextTrack4);
                        } else {
                            zI = false;
                        }
                        it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                caz0Var2 = (caz0) next;
                                if (caz0Var2 instanceof ivf1) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next instanceof ivf1) {
                            ivf1Var = (ivf1) next;
                        } else {
                            ivf1Var = null;
                        }
                        if (ivf1Var != null) {
                            zI2 = false;
                        } else {
                            zI2 = false;
                        }
                        i9 = -1;
                        if (z25) {
                            it4 = arrayList2.iterator();
                            i12 = 0;
                            while (true) {
                                if (it4.hasNext()) {
                                    caz0Var = (caz0) it4.next();
                                    if (caz0Var instanceof ivf1) {
                                        hjf1Var3 = ((ivf1) caz0Var).a;
                                        if (!l4o1.I(hjf1Var3.h)) {
                                            continue;
                                        }
                                    }
                                    i12++;
                                } else {
                                    i12 = -1;
                                }
                            }
                            objT0 = o7h.t0(i12, arrayList2);
                            if (objT0 instanceof ivf1) {
                                ivf1Var3 = (ivf1) objT0;
                            } else {
                                ivf1Var3 = null;
                            }
                            if (ivf1Var3 != null) {
                                hjf1Var2 = ivf1Var3.a;
                            } else {
                                hjf1Var2 = null;
                            }
                            if (hjf1Var2 != null) {
                                contextTrack = hjf1Var2.h;
                                if (i12 >= 0) {
                                    if (h4o1.o(contextTrack)) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                    arrayList2.add(i12, new vg51(i13));
                                }
                            }
                        }
                        if (ktw0Var.j()) {
                            if (!ktw0Var.h()) {
                                i11 = 0;
                                while (r1.hasNext()) {
                                    if (caz0Var3 instanceof ivf1) {
                                    }
                                    i11++;
                                }
                                if (i9 >= 0) {
                                    arrayList2.add(i9, new vg51(3));
                                }
                            }
                        } else if (ktw0Var instanceof htw0) {
                            i10 = 0;
                            while (r1.hasNext()) {
                                if (caz0Var4 instanceof ivf1) {
                                }
                                i10++;
                            }
                            if (list instanceof Collection) {
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (h4o1.o((ContextTrack) it3.next())) {
                                        if (i9 >= 0) {
                                            arrayList2.add(i9, new vg51(3));
                                        }
                                    }
                                }
                            } else {
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (h4o1.o((ContextTrack) it3.next())) {
                                        if (i9 >= 0) {
                                            arrayList2.add(i9, new vg51(3));
                                        }
                                    }
                                }
                            }
                        }
                        j4uVarP = w0h1.p(new e7v0(obz0Var.X, arrayList2, (byte) 1));
                        obz0Var.X = new ArrayList(arrayList2);
                        bdz0Var = obz0Var.P0;
                        if (bdz0Var != null) {
                            arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                            while (r2.hasNext()) {
                                if (caz0Var5 instanceof ivf1) {
                                    ivf1Var2 = (ivf1) caz0Var5;
                                } else {
                                    ivf1Var2 = null;
                                }
                                if (ivf1Var2 != null) {
                                    hjf1Var = ivf1Var2.a;
                                    if (l4o1.C(hjf1Var.h)) {
                                        hjf1Var = null;
                                    }
                                    if (hjf1Var != null) {
                                        str = hjf1Var.b;
                                    } else {
                                        str = null;
                                    }
                                } else {
                                    str = null;
                                }
                                arrayList3.add(str);
                            }
                            aek1Var = bdz0Var.b;
                            if (aek1Var.c != null) {
                                bdz0Var.c = arrayList3;
                                if (aek1Var.c == null) {
                                    aek1Var.a(bdz0Var.d);
                                }
                                aek1Var.c = Integer.valueOf(arrayList3.size());
                                bdz0Var.a();
                            } else {
                                bdz0Var.c = arrayList3;
                                if (aek1Var.c == null) {
                                    aek1Var.a(bdz0Var.d);
                                }
                                aek1Var.c = Integer.valueOf(arrayList3.size());
                                bdz0Var.a();
                            }
                        }
                        if (obz0Var.O0) {
                            obz0Var.O0 = false;
                            recyclerView2 = obz0Var.Z;
                            if (recyclerView2 != null) {
                                recyclerView2.setItemAnimator((e611) null);
                            }
                            j4uVarP.b(obz0Var);
                            recyclerView3 = obz0Var.Z;
                            if (recyclerView3 != null) {
                                recyclerView3.post(new an90(obz0Var, (byte) 28));
                            }
                        } else {
                            j4uVarP.b(obz0Var);
                        }
                        if (yoo1.w(eh4Var)) {
                            hjf1VarX2 = yoo1.x(hcz0Var, eh4Var);
                            if (hjf1VarX2 == null) {
                                cnoVar = null;
                            } else {
                                cnoVar = new cno(hjf1VarX2.b, d9y0.w(hjf1VarX2, z21), hjf1VarX2.x, l4o1.C(hjf1VarX2.h));
                            }
                            if (cnoVar != null) {
                                ((dtw) ccz0Var.O0.getValue()).f(cnoVar);
                            }
                        } else {
                            qzh qzhVar2 = (qzh) ccz0Var.N0.getValue();
                            hjf1VarX = yoo1.x(hcz0Var, eh4Var);
                            if (hjf1VarX == null) {
                                hjf1VarX = new hjf1("", "", "", "", null, 0, false, ContextTrack.create(""), ezf1.c, true, true, 1, false, false, true, k4m.d, list2, false, false, false, false, false, null, false);
                            }
                            qzhVar2.f(d9y0.w(hjf1VarX, z21));
                        }
                        if (z26) {
                            aiq0.a(recyclerView, new xwn1(recyclerView, recyclerView, (byte) 20));
                            return;
                        }
                        return;
                    }
                    next2 = it.next();
                    i14 = r14 + 1;
                    if (r14 >= 0) {
                        p7h.T();
                        throw null;
                    }
                    contextTrack3 = (ContextTrack) next2;
                    list3 = listA;
                    Iterator it8 = it;
                    kw21Var = (kw21) hcz0Var.A.get(contextTrack3.uri());
                    String strUri2 = contextTrack3.uri();
                    if (z19) {
                        zJ = u890.j(hcz0Var.D.get(contextTrack3.uri()), Boolean.TRUE);
                    } else if (l4o1.C(contextTrack3)) {
                        zJ = true;
                    } else {
                        zJ = false;
                    }
                    boolean zContains2 = linkedHashSetR.contains(l4o1.c0(contextTrack3));
                    Restrictions restrictions2 = hcz0Var.j;
                    boolean z28 = zJ;
                    if (z22 != 0) {
                        list4 = hcz0Var.n;
                    } else {
                        list4 = list2;
                    }
                    if (r14 == p7h.L(list3)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zF2 = eh4Var.f();
                    ktw0 ktw0Var3 = hcz0Var.k;
                    boolean zB2 = ydh.b(ln91.a(contextTrack3));
                    if (i15 == 2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean zContainsKey2 = map.containsKey(l4o1.c0(contextTrack3));
                    if (z19) {
                        if (kw21Var != null) {
                            strA0 = kw21Var.a;
                            str2 = strA0;
                        } else {
                            str2 = null;
                        }
                    } else if (kw21Var != null) {
                        strA0 = kw21Var.a;
                        str2 = strA0;
                    } else {
                        str2 = null;
                    }
                    if (kw21Var != null) {
                        str3 = kw21Var.c;
                    } else {
                        str3 = null;
                    }
                    if (eh4Var.k()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (hcz0Var.C) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    String str9 = (String) hcz0Var.E.get(strUri2);
                    if (kw21Var != null) {
                        aak0VarB = null;
                    } else {
                        aak0VarB = null;
                    }
                    arrayList.add(new ivf1(d4o1.r(contextTrack3, r14 == true ? 1 : 0, restrictions2, list4, zF2, z7, ktw0Var3, zB2, z8, zContainsKey2, str2, str3, z9, zContains2, z10, str9, aak0VarB, eh4Var.m())));
                    listA = list3;
                    r14 = i14;
                    it = it8;
                    recyclerView4 = recyclerView4;
                    ccz0Var2 = ccz0Var2;
                }
                break;
            case 19:
                ufz0 ufz0Var = (ufz0) obj2;
                pfz0 pfz0Var = ((mr61) obj).c.a ? pfz0.a : pfz0.b;
                qfz0 qfz0Var2 = ufz0Var.b;
                if ((qfz0Var2 != null ? qfz0Var2.a() : null) == pfz0Var || (qfz0Var = ufz0Var.b) == null) {
                    return;
                }
                qfz0Var.g(pfz0Var);
                return;
            case 20:
                ((ven0) obj2).setValue((l201) obj);
                return;
            case 21:
                ((a901) obj2).X.e((m901) obj);
                return;
            case 22:
                a(obj);
                return;
            case 23:
                b(obj);
                return;
            case 24:
                c(obj);
                return;
            case 25:
                d(obj);
                return;
            case 26:
                yi21 yi21Var = (yi21) obj;
                sj21 sj21Var = (sj21) ((fsg0) obj2).f;
                if (sj21Var != null) {
                    sj21Var.e.e(yi21Var);
                    return;
                } else {
                    u890.C("viewBinder");
                    throw null;
                }
            case 27:
                e(obj);
                return;
            case 28:
                return;
            default:
                mr61 mr61Var = (mr61) obj;
                cr6 cr6Var2 = (cr6) obj2;
                vr61 vr61Var = (tr61) cr6Var2.c;
                u800 u800Var = (u800) cr6Var2.b;
                an anVar = (an) cr6Var2.f;
                if (anVar != null) {
                    a layoutManager2 = u800Var.a().getLayoutManager();
                    h5zVarX0 = layoutManager2 != null ? layoutManager2.x0() : null;
                    uqz0 uqz0VarA = vr61Var.a(mr61Var);
                    c21 c21Var2 = (c21) anVar.e;
                    ArrayList arrayList6 = (ArrayList) c21Var2.f;
                    j4u j4uVarP3 = w0h1.p(new r0i((byte) 0, arrayList6, (LinkedHashMap) c21Var2.b, uqz0VarA));
                    arrayList6.clear();
                    arrayList6.addAll(uqz0VarA);
                    j4uVarP3.b(anVar);
                    l0x0 l0x0Var = (l0x0) anVar.f;
                    l0x0Var.b = uqz0VarA;
                    l0x0Var.d = tr80.d;
                    a layoutManager3 = u800Var.a().getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.w0(h5zVarX0);
                        return;
                    }
                    return;
                }
                q961 q961Var = new q961(cr6Var2, (byte) 13);
                vr61 vr61Var2 = vr61Var;
                vr61Var2.getClass();
                ny51 ny51Var = new ny51(vr61Var2, mr61Var, q961Var, (byte) 3);
                qqz0 qqz0Var = new qqz0();
                ny51Var.invoke(qqz0Var);
                uqz0 uqz0Var = qqz0Var.a;
                h5z h5zVar = qqz0Var.f;
                h5zVarX0 = h5zVar != null ? h5zVar : null;
                h5z h5zVar2 = qqz0Var.g;
                if (h5zVar2 == null) {
                    throw RangedComponentRecyclerAdapter.NoPreloadRangeConsumerFound.a;
                }
                an anVar2 = new an(new c21(uqz0Var, qqz0Var.b, qqz0Var.c, qqz0Var.d, qqz0Var.e), new l0x0(uqz0Var, h5zVar2), h5zVarX0, (byte) 5);
                cr6Var2.f = anVar2;
                Parcelable parcelable = (Parcelable) cr6Var2.g;
                if (parcelable != null && (layoutManager = u800Var.a().getLayoutManager()) != null) {
                    layoutManager.w0(parcelable);
                }
                u800Var.a().setAdapter(anVar2);
                ufz0 ufz0Var2 = (ufz0) cr6Var2.d;
                ViewGroup viewGroup = (ViewGroup) u800Var.d.getValue();
                RecyclerView recyclerViewA = u800Var.a();
                ufz0Var2.c = recyclerViewA;
                qfz0 qfz0VarA = ufz0Var2.a.a(recyclerViewA, viewGroup, (h5a1) null, new vyq0(ufz0Var2, b2), 1);
                ufz0Var2.b = qfz0VarA;
                qfz0VarA.e(ufz0Var2.f);
                anVar2.w(new v01(anVar2, new v3v0(1, ufz0Var2, ufz0.class, "updateVisibility", "updateVisibility(I)V", 0, (byte) 13), (byte) 0));
                aiq0.a(recyclerViewA, new aih0(recyclerViewA, ufz0Var2, anVar2));
                return;
        }
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                ((heb0) obj).d = null;
                break;
            case 2:
                break;
            case 3:
                ppd0 ppd0Var = (ppd0) obj;
                ppd0Var.g.c();
                ppd0Var.h = god0.f;
                break;
            case 4:
                ppd0 ppd0Var2 = (ppd0) obj;
                ppd0Var2.g.c();
                ppd0Var2.h = god0.g;
                break;
            case 5:
                kqd0 kqd0Var = (kqd0) obj;
                kqd0Var.h.setOnClickListener(null);
                kqd0Var.Y.setOnClickListener(null);
                break;
            case 6:
                break;
            case 7:
                ((s59) obj).b = null;
                break;
            case 8:
            case 9:
            case 10:
                break;
            case 11:
                ((vam0) obj).d = null;
                break;
            case 12:
            case 13:
                break;
            case 14:
                ((vku) ((cr6) obj).g).c();
                break;
            case 15:
            case 16:
            case 17:
                break;
            case 18:
                ccz0 ccz0Var = (ccz0) obj;
                ((View) ccz0Var.Z.c).removeOnLayoutChangeListener(ccz0Var.b1);
                obz0 obz0Var = ccz0Var.e;
                obz0Var.i = h0x0.d1;
                obz0Var.h = v9z0.t;
                bdz0 bdz0Var = obz0Var.P0;
                if (bdz0Var != null) {
                    z6x z6xVar = z6x.a;
                    bdz0Var.c = z6xVar;
                    bdz0Var.b.c = null;
                    bdz0Var.e = z6xVar;
                    ((rhg0) bdz0Var.a.b).a(w7x.a, (ArrayList) null, (ArrayList) null);
                }
                ccz0Var.Q0.O0 = v9z0.X;
                ccz0Var.R0.O0 = v9z0.Y;
                ccz0Var.S0.O0 = v9z0.Z;
                ccz0Var.T0.O0 = v9z0.N0;
                ccz0Var.U0.O0 = v9z0.O0;
                ccz0Var.V0.O0 = v9z0.P0;
                ccz0Var.W0.O0 = v9z0.Q0;
                ccz0Var.Y0.O0 = v9z0.i;
                ccz0Var.a1 = null;
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                break;
            case 23:
                ((g111) obj).d = null;
                break;
            case 24:
                ((vku) ((bfz) obj).e).c();
                break;
            case 25:
            case 26:
                break;
            case 27:
                ((e061) obj).d = null;
                break;
            case 28:
                ((Disposable) obj).dispose();
                break;
            default:
                ((cr6) obj).e = null;
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }
}
