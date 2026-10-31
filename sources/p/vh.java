package p;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.transcript.list.TranscriptListView;
import java.util.Optional;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vh implements isw {
    public final /* synthetic */ byte a = 12;
    public final Object b;
    public final Object c;
    public final Object d;

    public vh(Context context, iu30 iu30Var, vyf1 vyf1Var) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626169, (ViewGroup) null, false);
        int i = 2131430599;
        if (((TextView) m5n1.t(constraintLayoutInflate, 2131430599)) != null) {
            i = 2131430600;
            if (((TextView) m5n1.t(constraintLayoutInflate, 2131430600)) != null) {
                i = 2131430601;
                RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430601);
                if (recyclerViewT != null) {
                    i = 2131430602;
                    EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131430602);
                    if (encoreButtonT != null) {
                        i = 2131430608;
                        if (m5n1.t(constraintLayoutInflate, 2131430608) != null) {
                            i = 2131430609;
                            if (m5n1.t(constraintLayoutInflate, 2131430609) != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                q881 q881Var = new q881(constraintLayout, recyclerViewT, encoreButtonT);
                                recyclerViewT.setNestedScrollingEnabled(false);
                                encoreButtonT.setOnClickListener(new zl51(iu30Var, (byte) 7));
                                this.c = q881Var;
                                this.b = new kdn0();
                                new ne(3, new iv81(this, vyf1Var, (byte) 5)).f(recyclerViewT, new LinearLayoutManager(1), false);
                                constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                                ((GradientDrawable) constraintLayout.getBackground()).setColor(ago1.o(context, 2130968769, 0));
                                this.d = constraintLayout;
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    private final void c(Object obj, ysw yswVar) {
        q9g1 q9g1Var = (q9g1) obj;
        keg1 keg1Var = (keg1) this.c;
        r4u r4uVar = keg1Var.T0;
        n9g1 n9g1Var = q9g1Var.h;
        gcg1 gcg1VarW = q9g1Var.f.a == 0 ? keg1Var.w(q9g1Var.i) : null;
        if (gcg1VarW != null) {
            if (q9g1Var.j) {
                gcg1VarW = new gcg1(gcg1VarW.a, 4, gcg1VarW.c);
            }
            k441 k441Var = (k441) this.d;
            c9g1 c9g1Var = new c9g1(gcg1VarW);
            if (k441Var.b.get()) {
                k441Var.a.invoke(c9g1Var);
                return;
            }
            return;
        }
        iu30 iu30Var = q9g1Var.k;
        if (iu30Var != null) {
            iu30Var.invoke(Boolean.valueOf(n9g1Var instanceof n9g1));
        }
        if (u890.j(n9g1Var, o9g1.a)) {
            r4uVar.e(g860.a);
        } else if (n9g1Var instanceof n9g1) {
            r4uVar.e(new gku(q9g1Var.c, q9g1Var.b, q9g1Var.d, q9g1Var.e, n9g1Var.a, q9g1Var.i, q9g1Var.j));
        } else {
            eg.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:260:0x0858  */
    /* JADX WARN: Code duplicated, block: B:262:0x0870  */
    /* JADX WARN: Code duplicated, block: B:264:0x0873  */
    /* JADX WARN: Code duplicated, block: B:266:0x0876  */
    /* JADX WARN: Code duplicated, block: B:267:0x0880  */
    /* JADX WARN: Code duplicated, block: B:268:0x089c  */
    /* JADX WARN: Code duplicated, block: B:269:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:274:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:276:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:280:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:283:0x0909  */
    /* JADX WARN: Code duplicated, block: B:284:0x090c  */
    /* JADX WARN: Code duplicated, block: B:287:0x0922  */
    /* JADX WARN: Code duplicated, block: B:289:0x0925  */
    /* JADX WARN: Code duplicated, block: B:290:0x0927  */
    /* JADX WARN: Code duplicated, block: B:291:0x092c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0936 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:295:0x0938  */
    /* JADX WARN: Code duplicated, block: B:297:0x093b  */
    /* JADX WARN: Code duplicated, block: B:298:0x093d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0942  */
    /* JADX WARN: Code duplicated, block: B:300:0x0945  */
    /* JADX WARN: Code duplicated, block: B:304:0x0971  */
    /* JADX WARN: Code duplicated, block: B:310:0x0997  */
    /* JADX WARN: Code duplicated, block: B:312:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:314:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:316:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:320:0x09be  */
    /* JADX WARN: Code duplicated, block: B:322:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:324:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:326:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:327:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:328:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:329:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:332:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:333:0x09df  */
    /* JADX WARN: Code duplicated, block: B:339:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:341:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:344:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:345:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:44:0x0196  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:505:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:? A[LOOP:2: B:45:0x019a->B:507:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x097e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x096b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0201  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    /* JADX WARN: Code duplicated, block: B:70:0x0209  */
    /* JADX WARN: Code duplicated, block: B:71:0x020d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0211  */
    /* JADX WARN: Code duplicated, block: B:73:0x0215  */
    /* JADX WARN: Code duplicated, block: B:74:0x0217  */
    /* JADX WARN: Code duplicated, block: B:75:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:78:0x0227  */
    /* JADX WARN: Code duplicated, block: B:79:0x022b  */
    /* JADX WARN: Code duplicated, block: B:80:0x022d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0231  */
    /* JADX WARN: Code duplicated, block: B:82:0x0235  */
    /* JADX WARN: Code duplicated, block: B:83:0x0239  */
    /* JADX WARN: Code duplicated, block: B:84:0x023d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0241  */
    /* JADX WARN: Code duplicated, block: B:88:0x024b  */
    /* JADX WARN: Code duplicated, block: B:89:0x024f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v37 java.lang.Object, still in use, count: 2, list:
          (r4v37 java.lang.Object) from 0x0192: PHI (r4 I:??) = (r4v27 java.lang.Object), (r4v37 java.lang.Object) binds: [B:41:0x0191, B:503:0x0192] A[DONT_GENERATE, DONT_INLINE]
          (r4v37 java.lang.Object) from 0x018a: CHECK_CAST (p.a5u0) (r4v37 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final void a(java.lang.Object r40, p.ysw r41) {
        /*
            Method dump skipped, instruction units count: 3476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vh.a(java.lang.Object, p.ysw):void");
    }

    public ComposeView b(hux huxVar) {
        ComposeView composeView = new ComposeView((Context) this.d, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(1467536744, new hm0((iu30) this.b, huxVar, (byte) 1), true));
        return composeView;
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return ((isw) obj3).getView();
            case 1:
                return (View) obj3;
            case 2:
                return (FrameLayout) obj2;
            case 3:
                return (View) obj;
            case 4:
                return (AppCompatImageView) obj;
            case 5:
                return (u58) obj3;
            case 6:
                return (EncoreButton) obj2;
            case 7:
                return (FrameLayout) obj3;
            case 8:
                return (ConstraintLayout) ((err) obj3).e.b;
            case 9:
                return (View) obj2;
            case 10:
                return (FrameLayout) obj;
            case 11:
                return (FrameLayout) obj;
            case 12:
                return (NestedScrollView) obj2;
            case 13:
                return (View) obj;
            case 14:
                return (FrameLayout) obj3;
            case 15:
                return (View) ((idd1) obj).getValue();
            case 16:
                return (View) obj2;
            case 17:
                return (View) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (PlayButtonView) obj2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (View) obj3;
            case 20:
                return (View) obj3;
            case 21:
                return (ConstraintLayout) obj2;
            case 22:
                return (EncoreButton) obj3;
            case 23:
                return (FrameLayout) obj3;
            case 24:
                return (View) obj2;
            case 25:
                return (keg1) obj;
            default:
                return (LinearLayout) obj2;
        }
    }

    public vh(yfx yfxVar, iu30 iu30Var, Context context) {
        this.d = context;
        this.c = new idd1(new z6v0(yfxVar, (byte) 7));
        this.b = new idd1(new wpu0((byte) 23, this, iu30Var));
    }

    public vh(vnd1 vnd1Var, iu30 iu30Var) {
        this.c = vnd1Var;
        this.b = iu30Var;
        Spannable.Factory cee1Var = new cee1();
        View view = (View) vnd1Var.c;
        this.d = view;
        ((EncoreTextView) vnd1Var.b).setSpannableFactory(cee1Var);
        view.setOnClickListener(new gl61(this, (byte) 9));
    }

    public vh(rok0 rok0Var, iu30 iu30Var) {
        this.d = rok0Var;
        qzh qzhVarA = ((hjc) rok0Var.b).a((l0i) null);
        this.c = qzhVarA;
        h98 h98Var = (h98) qzhVarA;
        h98Var.n(new wck0(iu30Var, (byte) 17));
        this.b = (RoundedConstraintLayout) h98Var.c;
    }

    public vh(Context context, ViewGroup viewGroup, bs0 bs0Var, iu30 iu30Var) {
        NestedScrollView nestedScrollViewInflate = LayoutInflater.from(context).inflate(2131624559, viewGroup, false);
        int i = 2131429696;
        EncoreButton encoreButtonT = m5n1.t(nestedScrollViewInflate, 2131429696);
        if (encoreButtonT != null) {
            i = 2131429697;
            FrameLayout frameLayout = (FrameLayout) m5n1.t(nestedScrollViewInflate, 2131429697);
            if (frameLayout != null) {
                NestedScrollView nestedScrollView = nestedScrollViewInflate;
                this.c = new rmr(nestedScrollView, encoreButtonT, frameLayout);
                tka0 tka0Var = dtw.C;
                dtw dtwVarD = mhc.d(context, frameLayout, new zhc0((gw70) bs0Var.d, (nww0) bs0Var.b), (drw) null, 24);
                this.b = dtwVarD;
                this.d = nestedScrollView;
                frameLayout.addView(dtwVarD.w);
                encoreButtonT.setOnClickListener(new jn90(iu30Var, (byte) 0));
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(nestedScrollViewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public vh(Context context, ViewGroup viewGroup, iu30 iu30Var) {
        this.b = iu30Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131624097, viewGroup, false);
        this.c = viewInflate;
        this.d = viewInflate.findViewById(2131430659);
    }

    public vh(Context context, ViewGroup viewGroup, sma1 sma1Var) {
        b6s b6sVarA = ((yfx) sma1Var.d).a((l0i) null);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131166958);
        View view = b6sVarA.b;
        view.setPadding(view.getPaddingLeft(), dimensionPixelOffset, view.getPaddingRight(), dimensionPixelOffset);
        this.c = b6sVarA;
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, (wpw) sma1Var.e, (drw) null, 24);
        this.b = dtwVarD;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        linearLayout.addView(view, layoutParams == null ? new LinearLayout.LayoutParams(-1, -2) : layoutParams);
        linearLayout.addView(dtwVarD.w, new LinearLayout.LayoutParams(-1, -2));
        this.d = linearLayout;
    }

    public vh(Context context, ViewGroup viewGroup, ne neVar, bpb1 bpb1Var) {
        this.d = bpb1Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131624314, viewGroup, false);
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131427920);
        this.c = (TextView) viewInflate.findViewById(2131431356);
        recyclerViewFindViewById.setItemAnimator((e611) null);
        recyclerViewFindViewById.j(new j1e(recyclerViewFindViewById, (byte) 10));
        neVar.f(recyclerViewFindViewById, new LinearLayoutManager(0), false);
        this.b = viewInflate;
    }

    public vh(Context context, ViewGroup viewGroup, rt01 rt01Var) {
        this.d = rt01Var;
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, (wpw) rt01Var.c, (drw) null, 24);
        this.c = dtwVarD;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(dtwVarD.w);
        this.b = frameLayout;
    }

    public vh(Context context, k441 k441Var) {
        this.d = k441Var;
        keg1 keg1Var = new keg1(context);
        keg1Var.addOnAttachStateChangeListener(new y22(k441Var, (byte) 21));
        this.c = keg1Var;
        this.b = keg1Var;
    }

    public vh(Context context, ViewGroup viewGroup, ne neVar, rt01 rt01Var) {
        this.d = rt01Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131625223, viewGroup, false);
        this.c = (TextView) viewInflate.findViewById(2131431356);
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131429958);
        recyclerViewFindViewById.j(upn1.a);
        neVar.f(recyclerViewFindViewById, new LinearLayoutManager(0), false);
        this.b = viewInflate;
    }

    public vh(bs0 bs0Var, iu30 iu30Var) {
        this.b = iu30Var;
        qzh qzhVarA = ((ofx) bs0Var.d).a((hsz0) bs0Var.e);
        qzhVarA.getView().setVisibility(8);
        this.c = qzhVarA;
        this.d = qzhVarA.getView();
    }

    public vh(ViewGroup viewGroup, Context context, jb3 jb3Var) {
        qbo0 qbo0VarU = h7p1.u(viewGroup);
        this.c = qbo0VarU == null ? new qbo0() : qbo0VarU;
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, f6o1.A(fgi0.a((fgi0) jb3Var.f, (qa2) jb3Var.c, (epb1) jb3Var.d, (z83) jb3Var.e, new uei0(false, new har0(0), true, false, false, false, true, false, false, 7672), (cgi0) null, new g82(this, (byte) 11), (ojv0) jb3Var.g, 6048), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        this.b = dtwVarD;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(dtwVarD.w);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165612);
        frameLayout.setPaddingRelative(dimensionPixelSize, frameLayout.getPaddingTop(), dimensionPixelSize, frameLayout.getPaddingBottom());
        this.d = frameLayout;
    }

    public vh(ViewGroup viewGroup, Context context, jb3 jb3Var, byte b) {
        qbo0 qbo0VarU = h7p1.u(viewGroup);
        this.c = qbo0VarU == null ? new qbo0() : qbo0VarU;
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, f6o1.A(fgi0.a((fgi0) jb3Var.f, (oqg) jb3Var.c, (epb1) jb3Var.d, (kko) jb3Var.e, new uei0(false, new har0(context.getResources().getDimensionPixelSize(2131167023)), true, false, false, false, true, false, false, 7672), (cgi0) null, new j3m(this, (byte) 26), (ojv0) jb3Var.g, 6048), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        this.b = dtwVarD;
        this.d = dtwVarD.w;
    }

    public vh(Context context, f37 f37Var) {
        this.d = f37Var;
        this.c = new fr31(Integer.valueOf(context.getResources().getDimensionPixelSize(2131167027)));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView.setPivotX(0.0f);
        this.b = appCompatImageView;
    }

    public vh(Context context, qm91 qm91Var) {
        this.b = context;
        this.d = qm91Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new g611(-1, -1));
        this.c = frameLayout;
    }

    public vh(Context context, ViewGroup viewGroup, dx0 dx0Var, gpq gpqVar) {
        View viewInflate = LayoutInflater.from(context).inflate(2131626286, viewGroup, false);
        viewInflate.getClass();
        d1u.C(viewInflate);
        this.c = viewInflate;
        TranscriptListView transcriptListView = (TranscriptListView) viewInflate.findViewById(2131431507);
        transcriptListView.setVerticalFadingEdgeEnabled(true);
        transcriptListView.setFadingEdgeLength(150);
        this.b = transcriptListView;
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(2131430573);
        this.d = r4u.c(new r4u[]{r4u.d(new rrr(vx51.b, (byte) 3), r4u.a(new ij01(((dpq) dx0Var.d).a(transcriptListView), (byte) 19))), r4u.d(new rrr(wx51.b, (byte) 3), r4u.a(new n801(this, (byte) 16))), r4u.d(new rrr(xx51.b, (byte) 3), r4u.a(new xaz0(gpqVar.a(frameLayout, transcriptListView), (byte) 24)))});
    }

    public vh(wpw wpwVar, Context context, ViewGroup viewGroup, d75 d75Var, iu30 iu30Var, wf wfVar) {
        this.b = iu30Var;
        this.d = wfVar;
        this.c = wpwVar.c().a(context, viewGroup, d75Var.c, iu30Var);
    }

    public vh(im0 im0Var, Context context, iu30 iu30Var) {
        ComposeView composeViewB;
        this.d = context;
        this.b = iu30Var;
        if (((u601) im0Var.t).getValue() instanceof ck7) {
            composeViewB = b(ppx.c);
        } else if (((hnl) im0Var.X).d().getValue() == bq00.b) {
            composeViewB = b(opx.c);
        } else {
            emr emrVar = new emr(((xfx) im0Var.i).a.a);
            View.OnClickListener v20Var = new v20(iu30Var, (byte) 1);
            ComposeView composeView = emrVar.a;
            composeView.setOnClickListener(v20Var);
            composeViewB = composeView;
        }
        this.c = composeViewB;
    }

    public vh(FrameLayout frameLayout, dtw dtwVar, nou0 nou0Var) {
        this.b = dtwVar;
        this.d = nou0Var;
        this.c = frameLayout;
    }

    public vh(Context context, ViewGroup viewGroup, kfh kfhVar) {
        this.d = kfhVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.c = frameLayout;
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, kfhVar.c, (drw) null, 24);
        this.b = dtwVarD;
        View view = dtwVarD.w;
        frameLayout.addView(view);
        if (kfhVar.a) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(context.getResources().getDimensionPixelSize(2131165413), context.getResources().getDimensionPixelSize(2131165413), context.getResources().getDimensionPixelSize(2131165413), marginLayoutParams.bottomMargin);
        }
    }

    public vh(Context context, r4o r4oVar, ViewGroup viewGroup) {
        this.d = r4oVar;
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(context.getResources().getDimensionPixelSize(2131167023));
        layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(2131167023));
        frameLayout.setLayoutParams(layoutParams);
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, frameLayout, f6o1.A(v7l1.a(r4oVar.f, r4oVar.c, r4oVar.d, new sqm((Object) r4oVar, (Object) viewGroup, (byte) 12), null, 24), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        frameLayout.addView(dtwVarD.w);
        this.c = dtwVarD;
        this.b = frameLayout;
    }

    public vh(Context context, m68 m68Var, iu30 iu30Var) {
        this.d = m68Var;
        this.b = iu30Var;
        this.c = new u58(context);
    }

    public vh(Context context, w2s w2sVar, iu30 iu30Var) {
        this.b = iu30Var;
        PlayButtonView playButtonView = new PlayButtonView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.c = playButtonView;
        this.d = playButtonView;
    }

    public vh(EncoreButton encoreButton, Context context) {
        this.b = encoreButton;
        this.d = context;
        this.c = encoreButton;
    }

    public vh(xyn xynVar, iu30 iu30Var, Context context) {
        this.b = xynVar;
        this.d = context;
        d9p d9pVar = xynVar.g;
        kko kkoVar = xynVar.f;
        epb1 epb1Var = xynVar.e;
        rzo rzoVar = (rzo) ((a0m) ((d3p) d9pVar.a.b).a).b;
        c8o.l(rzoVar);
        br0 br0Var = new br0(rzoVar, kkoVar, epb1Var);
        ng20 ng20Var = xynVar.d.d ? new ng20(epb1Var, (Optional) xynVar.X.b) : null;
        ufx ufxVar = xynVar.a.b;
        err errVar = new err(ufxVar.a, ufxVar.b, br0Var, ng20Var);
        this.c = errVar;
        errVar.Z = new usj(iu30Var, (byte) 29);
    }

    public vh(Context context, iu30 iu30Var) {
        this.b = iu30Var;
        EncoreButton encoreButton = new EncoreButton(context, (AttributeSet) null, 2130969239, (eix) null, 10, (DefaultConstructorMarker) null);
        encoreButton.setContentDescription(context.getString(2131963747));
        encoreButton.setIconResource(2131232711);
        encoreButton.setVisibility(8);
        this.c = encoreButton;
        this.d = encoreButton;
    }
}
