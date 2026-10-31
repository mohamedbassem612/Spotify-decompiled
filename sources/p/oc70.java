package p;

import android.app.Activity;
import android.content.Context;
import android.database.Observable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueHeaderBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.headers.v2.GlueHeaderV2Behavior;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oc70 extends Observable {
    /* JADX WARN: Code duplicated, block: B:101:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0200  */
    /* JADX WARN: Code duplicated, block: B:106:0x0209  */
    /* JADX WARN: Code duplicated, block: B:107:0x020d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0211  */
    /* JADX WARN: Code duplicated, block: B:117:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup, com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a() {
        View viewE;
        dg30 dg30VarF0;
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ic70 ic70Var = (ic70) ((Observable) this).mObservers.get(size);
            View viewE2 = null;
            switch (ic70Var.a) {
                case 0:
                    jc70 jc70Var = (jc70) ic70Var.c;
                    int i = jc70Var.h;
                    Context context = jc70Var.a;
                    kz50 kz50Var = ic70Var.b;
                    ?? r9 = jc70Var.c;
                    y570 y570Var = (y570) kz50Var.g;
                    if (y570Var != null) {
                        pe70 pe70VarT = ((zsc) kz50Var.a).t((pe70) kz50Var.f, y570Var, (ViewGroup) r9, -1);
                        kz50Var.f = pe70VarT;
                        viewE = pe70VarT.e();
                    } else {
                        viewE = null;
                    }
                    if (!(jc70Var.l.l() == null ? false : l1d.C(i) != 0 ? xoi1.c(context) : true)) {
                        jc70Var.l();
                    } else if (r9.B(true) != viewE) {
                        if (viewE != null && viewE.getId() == -1) {
                            viewE.setId(2131429006);
                        }
                        if (viewE instanceof bx40) {
                            r9.D((bx40) viewE, new GlueHeaderBehavior(), false);
                            r9.setWillNotDraw(true);
                        } else if (viewE instanceof fx40) {
                            r9.D((fx40) viewE, new GlueHeaderV2Behavior(), false);
                            r9.setWillNotDraw(true);
                        } else {
                            jc70Var.l();
                        }
                    }
                    kz50 kz50Var2 = ((nc70) kz50Var.h).d;
                    y570 y570Var2 = (y570) kz50Var2.g;
                    y570 y570VarB = y570Var2 != null ? ((de70) kz50Var2.e).b(y570Var2) : null;
                    zf30 zf30Var = jc70Var.i;
                    boolean z = xoi1.a(context) && jc70Var.j;
                    if (z) {
                        r9.setAccessory(null);
                        if (!z) {
                            if (zf30Var != null) {
                                zf30Var.U0();
                                dg30VarF0 = zf30Var.f0();
                                if (dg30VarF0 != null) {
                                    dg30VarF0.invalidateOptionsMenu();
                                }
                            } else if (context instanceof Activity) {
                                ((Activity) context).invalidateOptionsMenu();
                            }
                        }
                    } else {
                        if (jc70Var.l.l() == null ? false : l1d.C(i) != 0 ? xoi1.c(context) : true) {
                            o860 o860Var = jc70Var.e;
                            o860Var.getClass();
                            zsc zscVar = (zsc) o860Var.b;
                            List listL = y570VarB != null ? y570VarB.l() : Collections.EMPTY_LIST;
                            if (y570VarB == null || listL.isEmpty()) {
                                LinearLayout linearLayout = (LinearLayout) o860Var.e;
                                if (linearLayout != null) {
                                    linearLayout.removeAllViews();
                                    o860Var.e = null;
                                }
                                pe70 pe70Var = (pe70) o860Var.c;
                                if (pe70Var != null) {
                                    zscVar.F(pe70Var);
                                    o860Var.c = null;
                                }
                                pe70 pe70Var2 = (pe70) o860Var.d;
                                if (pe70Var2 != null) {
                                    zscVar.F(pe70Var2);
                                    o860Var.d = null;
                                }
                            } else if (listL.size() == 1) {
                                LinearLayout linearLayout2 = (LinearLayout) o860Var.e;
                                if (linearLayout2 != null) {
                                    linearLayout2.removeAllViews();
                                    o860Var.e = null;
                                }
                                pe70 pe70Var3 = (pe70) o860Var.d;
                                if (pe70Var3 != null) {
                                    zscVar.F(pe70Var3);
                                    o860Var.d = null;
                                }
                                pe70 pe70VarC = o860Var.c((pe70) o860Var.c, r9, y570VarB, (y570) listL.get(0));
                                o860Var.c = pe70VarC;
                                viewE2 = pe70VarC.b;
                            } else {
                                Context context2 = r9.getContext();
                                y570 y570Var3 = (y570) listL.get(0);
                                y570 y570Var4 = (y570) listL.get(1);
                                LinearLayout linearLayout3 = (LinearLayout) o860Var.e;
                                if (linearLayout3 == null) {
                                    linearLayout3 = new LinearLayout(context2);
                                    linearLayout3.setOrientation(0);
                                    linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                    o860Var.e = linearLayout3;
                                }
                                int iY = a8o.y(8.0f, context2.getResources());
                                pe70 pe70VarC2 = o860Var.c((pe70) o860Var.c, linearLayout3, y570VarB, y570Var3);
                                o860Var.c = pe70VarC2;
                                View view = pe70VarC2.b;
                                int i2 = iY * 2;
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
                                layoutParams.leftMargin = i2;
                                layoutParams.rightMargin = iY;
                                View childAt = linearLayout3.getChildAt(0);
                                if (childAt != view) {
                                    if (childAt != null) {
                                        linearLayout3.removeView(childAt);
                                    }
                                    linearLayout3.addView(view, 0, layoutParams);
                                }
                                pe70 pe70VarC3 = o860Var.c((pe70) o860Var.d, linearLayout3, y570VarB, y570Var4);
                                o860Var.d = pe70VarC3;
                                View view2 = pe70VarC3.b;
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 1.0f);
                                layoutParams2.leftMargin = iY;
                                layoutParams2.rightMargin = i2;
                                View childAt2 = linearLayout3.getChildAt(1);
                                if (childAt2 != view2) {
                                    if (childAt2 != null) {
                                        linearLayout3.removeView(childAt2);
                                    }
                                    linearLayout3.addView(view2, 1, layoutParams2);
                                }
                                viewE2 = linearLayout3;
                            }
                            r9.C(viewE2, true);
                        } else {
                            r9.setAccessory(null);
                            if (!z) {
                                if (zf30Var != null) {
                                    zf30Var.U0();
                                    dg30VarF0 = zf30Var.f0();
                                    if (dg30VarF0 != null) {
                                        dg30VarF0.invalidateOptionsMenu();
                                    }
                                } else if (context instanceof Activity) {
                                    ((Activity) context).invalidateOptionsMenu();
                                }
                            }
                        }
                    }
                    break;
                default:
                    oe70 oe70Var = ic70Var.c;
                    kz50 kz50Var3 = ic70Var.b;
                    v470 v470Var = oe70Var.a;
                    y570 y570Var5 = (y570) kz50Var3.g;
                    if (y570Var5 != null) {
                        pe70 pe70VarT2 = ((zsc) kz50Var3.a).t((pe70) kz50Var3.f, y570Var5, v470Var, -1);
                        kz50Var3.f = pe70VarT2;
                        viewE2 = pe70VarT2.e();
                    }
                    if (viewE2 != null && v470Var.findViewById(2131429006) == null) {
                        viewE2.setId(2131429006);
                        v470Var.addView(viewE2);
                    }
                    break;
            }
        }
    }
}
