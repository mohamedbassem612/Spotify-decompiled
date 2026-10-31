package p;

import android.R;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.View;
import android.widget.ProgressBar;
import com.spotify.gpb.googlecheckout.GoogleCheckoutActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class f050 implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ GoogleCheckoutActivity b;

    public /* synthetic */ f050(GoogleCheckoutActivity googleCheckoutActivity, byte b) {
        this.a = b;
        this.b = googleCheckoutActivity;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x02fe  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(Object obj) {
        a250 a250Var;
        byte b = this.a;
        dg30 dg30Var = this.b;
        switch (b) {
            case 0:
                e821 e821Var = dg30Var.h1;
                fza fzaVar = GoogleCheckoutActivity.j1;
                a250 a250Var2 = ((g150) obj).d;
                byte b2 = 0;
                if (a250Var2 instanceof y150) {
                    gid gidVar = dg30Var.i1;
                    if (gidVar == null) {
                        u890.C("viewBinding");
                        throw null;
                    }
                    ((ProgressBar) gidVar.c).setVisibility(8);
                    e821Var.v(GoogleCheckoutActivity.k1[0], dg30Var, v150.INSTANCE);
                    return;
                }
                if (a250Var2 instanceof z150) {
                    gid gidVar2 = dg30Var.i1;
                    if (gidVar2 == null) {
                        u890.C("viewBinding");
                        throw null;
                    }
                    ((ProgressBar) gidVar2.c).setVisibility(0);
                    e821Var.v(GoogleCheckoutActivity.k1[0], dg30Var, v150.INSTANCE);
                    return;
                }
                if (!(a250Var2 instanceof x150)) {
                    eg.o();
                    return;
                }
                gid gidVar3 = dg30Var.i1;
                if (gidVar3 == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                ((ProgressBar) gidVar3.c).setVisibility(8);
                if (((x150) e821Var.m(dg30Var, GoogleCheckoutActivity.k1[0])).equals(a250Var2)) {
                    a250Var = a250Var2;
                } else {
                    x150 x150Var = (x150) a250Var2;
                    lmw lmwVar = dg30Var.U0;
                    if (x150Var instanceof v150) {
                        a250Var = a250Var2;
                    } else if (x150Var instanceof u150) {
                        boolean z = ((u150) x150Var).a;
                        String string = dg30Var.getString(2131955717);
                        String string2 = z ? dg30Var.getString(2131955745) : dg30Var.getString(2131955744);
                        string2.getClass();
                        Parcelable wvfVar = new wvf(string, string2, z ? dg30Var.getString(2131961070) : dg30Var.getString(R.string.ok), (String) null);
                        dwf dwfVar = new dwf();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("ARGS_KEY", wvfVar);
                        dwfVar.T0(bundle);
                        dwfVar.g1(((tg30) lmwVar.b).g, "TAG_GENERIC_ERROR");
                        a250Var = a250Var2;
                    } else if (x150Var instanceof r150) {
                        ttk0 ttk0Var = new ttk0(new xok0(dg30Var.l0().b()), (byte) 9, false);
                        String string3 = dg30Var.getString(2131956344);
                        CharSequence string4 = dg30Var.getString(2131956342, "https://support.google.com/googleplay/answer/7431675");
                        fz40 fz40Var = new fz40(dg30Var, ttk0Var, (byte) 2);
                        Pattern patternCompile = Pattern.compile("\\[([^\\]]+)\\]\\(([^\\)]+)\\)");
                        ArrayList<jjc0> arrayList = new ArrayList();
                        mbh0 mbh0VarM = mno1.m(patternCompile.matcher(string4), 0, string4);
                        while (mbh0VarM != null) {
                            tr80 tr80VarB = mbh0VarM.b();
                            string4 = ihc1.M0(string4, ((rr80) tr80VarB).a, ((rr80) tr80VarB).b + 1, (CharSequence) mbh0VarM.a().get(1));
                            arrayList.add(new jjc0(((rr80) mbh0VarM.b()).a, (String) mbh0VarM.a().get(1), (String) mbh0VarM.a().get(2)));
                            b2 = 0;
                            mbh0VarM = mno1.m(patternCompile.matcher(string4), 0, string4);
                            a250Var2 = a250Var2;
                        }
                        a250Var = a250Var2;
                        SpannableString spannableString = new SpannableString(string4);
                        for (jjc0 jjc0Var : arrayList) {
                            sjc0 sjc0Var = new sjc0(b2, jjc0Var, fz40Var);
                            int i = jjc0Var.c;
                            spannableString.setSpan(sjc0Var, i, jjc0Var.a.length() + i, 33);
                            b2 = 0;
                        }
                        Parcelable wvfVar2 = new wvf(string3, spannableString, dg30Var.getString(2131956343), (String) null);
                        dwf dwfVar2 = new dwf();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("ARGS_KEY", wvfVar2);
                        dwfVar2.T0(bundle2);
                        dwfVar2.h1(((tg30) lmwVar.b).g, "TAG_COUNTRY_MISMATCH");
                        View view = ((zf30) dwfVar2).j1;
                        if (view != null) {
                            gik1 gik1Var = dg30Var.d1;
                            if (gik1Var == null) {
                                u890.C("viewUbiImpressionLogger");
                                throw null;
                            }
                            gik1Var.a(view, new g050(ttk0Var, (byte) 0));
                        }
                    } else {
                        a250Var = a250Var2;
                        if (x150Var instanceof m150) {
                            Parcelable wvfVar3 = new wvf(dg30Var.getString(2131956337), dg30Var.getString(2131956335), dg30Var.getString(2131956336), (String) null);
                            dwf dwfVar3 = new dwf();
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("ARGS_KEY", wvfVar3);
                            dwfVar3.T0(bundle3);
                            dwfVar3.g1(((tg30) lmwVar.b).g, "TAG_OTHER_USER_SUBSCRIBED");
                        } else if (x150Var instanceof w150) {
                            Parcelable wvfVar4 = new wvf(dg30Var.getString(2131956350), dg30Var.getString(2131956348), dg30Var.getString(2131956349), (String) null);
                            dwf dwfVar4 = new dwf();
                            Bundle bundle4 = new Bundle();
                            bundle4.putParcelable("ARGS_KEY", wvfVar4);
                            dwfVar4.T0(bundle4);
                            dwfVar4.g1(((tg30) lmwVar.b).g, "TAG_WRONG_GOOGLE_USER");
                        } else {
                            if (!(x150Var instanceof p150)) {
                                eg.o();
                                return;
                            }
                            String str = ((p150) x150Var).a;
                            ttk0 ttk0Var2 = new ttk0(new xok0(dg30Var.l0().b()), (byte) 10, false);
                            Parcelable wvfVar5 = new wvf(dg30Var.getString(2131956341), dg30Var.getString(2131956338, str), dg30Var.getString(2131956340, str), dg30Var.getString(2131956339));
                            dwf dwfVar5 = new dwf();
                            Bundle bundle5 = new Bundle();
                            bundle5.putParcelable("ARGS_KEY", wvfVar5);
                            dwfVar5.T0(bundle5);
                            dwfVar5.h1(((tg30) lmwVar.b).g, "TAG_CHANGE_COUNTRY");
                            View view2 = ((zf30) dwfVar5).j1;
                            if (view2 != null) {
                                gik1 gik1Var2 = dg30Var.d1;
                                if (gik1Var2 == null) {
                                    u890.C("viewUbiImpressionLogger");
                                    throw null;
                                }
                                gik1Var2.a(view2, new f710(ttk0Var2, (byte) 29));
                            }
                        }
                    }
                }
                e821Var.v(GoogleCheckoutActivity.k1[0], dg30Var, (x150) a250Var);
                return;
            case 1:
                fza fzaVar2 = GoogleCheckoutActivity.j1;
                dg30Var.o0((n050) obj);
                return;
            default:
                fza fzaVar3 = GoogleCheckoutActivity.j1;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    dg30Var.o0((n050) it.next());
                }
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new tv30(1, this.b, GoogleCheckoutActivity.class, "render", "render(Lcom/spotify/gpb/googlecheckout/GoogleCheckoutPageModel;)V", 0);
            case 1:
                return new tv30(1, this.b, GoogleCheckoutActivity.class, "trigger", "trigger(Lcom/spotify/gpb/googlecheckout/GoogleCheckoutPageEffect$ViewEffect;)V", 0);
            default:
                return new tv30(1, this.b, GoogleCheckoutActivity.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
