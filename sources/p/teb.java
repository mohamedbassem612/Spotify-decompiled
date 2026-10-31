package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class teb implements mod1 {
    public boolean a;
    public boolean b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Serializable g;
    public Object h;

    public teb(twa twaVar, zu30 zu30Var, boolean z, boolean z2, int i) {
        zu30Var = (i & 2) != 0 ? null : zu30Var;
        z2 = (i & 8) != 0 ? false : z2;
        int i2 = (i & 16) != 0 ? 5 : 1;
        this.d = twaVar;
        this.a = z;
        this.b = z2;
        this.c = i2;
        this.h = zu30Var != null ? new g23(zu30Var) : null;
    }

    public static final void a(teb tebVar, lvc1 lvc1Var, iu30 iu30Var) {
        View view;
        LinearLayout linearLayout = (LinearLayout) lvc1Var.b;
        if (iu30Var == null || (view = (View) iu30Var.invoke(linearLayout)) == null) {
            view = null;
        } else {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388611;
            view.setLayoutParams(layoutParams);
            linearLayout.addView(view, linearLayout.indexOfChild((ViewPager2) lvc1Var.d));
        }
        tebVar.e = view;
    }

    public static final void c(teb tebVar, lvc1 lvc1Var, List list) {
        TabLayout tabLayout = (TabLayout) lvc1Var.c;
        int size = list.size();
        ViewPager2 viewPager2 = (ViewPager2) lvc1Var.d;
        if (size == 1) {
            viewPager2.setUserInputEnabled(false);
            tabLayout.setVisibility(8);
        } else {
            viewPager2.setUserInputEnabled(!tebVar.a);
            tabLayout.setVisibility(0);
        }
    }

    public static final void d(teb tebVar, lvc1 lvc1Var, ArrayList arrayList, fai0 fai0Var, String str, f2t f2tVar, qwc1 qwc1Var) {
        ViewPager2 viewPager2 = (ViewPager2) lvc1Var.d;
        TabLayout tabLayout = (TabLayout) lvc1Var.c;
        jhc1.q(0, viewPager2).setId(2131428389);
        if (arrayList.size() > 1) {
            new vrv0(tabLayout, viewPager2, (hhd1) new zeu(fai0Var, lvc1Var, tebVar)).b();
            tabLayout.a(new wiv(fai0Var, f2tVar, tebVar, str, qwc1Var));
        }
    }

    public View b(ViewGroup viewGroup, jto jtoVar, iu30 iu30Var, iu30 iu30Var2, boolean z, Function0 function0, qwc1 qwc1Var) {
        String str;
        fai0 fai0Var;
        lvc1 lvc1Var;
        ArrayList<ito> arrayList = jtoVar.a;
        kdn0 kdn0Var = jtoVar.b;
        iu30 iu30Var3 = jtoVar.c;
        String str2 = ((ito) arrayList.get(jtoVar.d)).b;
        iac0 iac0VarH = x9p1.h(viewGroup);
        if (iac0VarH == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        lvc1 lvc1VarB = lvc1.B(LayoutInflater.from(viewGroup.getContext()));
        ViewPager2 viewPager2 = (ViewPager2) lvc1VarB.d;
        f2t f2tVar = new f2t(this, viewGroup, (byte) 17);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 0;
        while (i < size) {
            arrayList2.add(new ubd1(new pgr(new rm5(new zun(viewGroup, (byte) 2), (byte) 13), true)));
            i++;
            str2 = str2;
            viewPager2 = viewPager2;
        }
        String str3 = str2;
        ViewPager2 viewPager3 = viewPager2;
        fai0 fai0Var2 = new fai0();
        f2t f2tVar2 = new f2t(fai0Var2, arrayList, (byte) 18);
        for (ito itoVar : arrayList) {
            fai0Var2.n(t5p1.j(itoVar.c.c(), 3), new ziv(f2tVar2, (byte) 0));
            fai0Var2.n(t5p1.j(itoVar.c.b(), 3), new ziv(f2tVar2, (byte) 1));
        }
        f2tVar2.invoke();
        fai0 fai0VarH = w6d1.h(fai0Var2);
        fai0VarH.f(iac0VarH, new ip5(this, lvc1VarB, (byte) 1));
        byte b = 3;
        ne neVar = new ne(3, new yiv(fai0VarH, viewGroup, (twa) this.d, iu30Var, function0, this.b, new utt(this, (byte) 15), arrayList, z, arrayList2, new viv(this, (byte) 1)));
        lap1.p(viewPager3, (h3h1) null);
        l4o1.e0(viewPager3, (iu30) neVar.c, (nzb0) neVar.d);
        viewPager3.setOffscreenPageLimit(this.c);
        z511 adapter = viewPager3.getAdapter();
        if (adapter != null) {
            fai0Var = fai0VarH;
            str = str3;
            hyo1.p(new riv(this, lvc1VarB, arrayList, fai0Var, str3, f2tVar, qwc1Var, iu30Var3), o6v.e1, adapter);
            lvc1Var = lvc1VarB;
        } else {
            str = str3;
            fai0Var = fai0VarH;
            lvc1Var = lvc1VarB;
        }
        fai0 fai0Var3 = fai0Var;
        lvc1 lvc1Var2 = lvc1Var;
        viewPager3.b(new siv(qwc1Var, new l811(), lvc1Var, arrayList2, viewGroup, fai0Var3, this));
        tiv tivVar = new tiv(fai0Var3, this, lvc1Var2, str);
        p811 p811Var = new p811();
        zjr zjrVar = new zjr(tivVar, kdn0Var, p811Var, b);
        p811Var.a = zjrVar;
        kdn0Var.f((iac0) 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x015c: INVOKE (r14v0 'kdn0Var' p.kdn0), (wrap p.iac0:?: CAST (p.iac0) (r17v0 ?? I:??[OBJECT, ARRAY])), (r5v5 'zjrVar' p.zjr) VIRTUAL call: p.ymd0.f(p.iac0, p.rjp0):void (LINE:349) in method: p.teb.b(android.view.ViewGroup, p.jto, p.iu30, p.iu30, boolean, kotlin.jvm.functions.Function0, p.qwc1):android.view.View, file: /workspace/spotify-analysis/dex-input/classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.teb.b(android.view.ViewGroup, p.jto, p.iu30, p.iu30, boolean, kotlin.jvm.functions.Function0, p.qwc1):android.view.View");
    }

    public void e() {
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        arrayDeque.getClass();
        arrayDeque.clear();
        bi91 bi91Var = (bi91) this.h;
        bi91Var.getClass();
        bi91Var.clear();
    }

    public boolean f(e8b0 e8b0Var, e8b0 e8b0Var2) {
        return true;
    }

    public String g() {
        String str = (String) this.g;
        return str == null ? (String) this.f : str;
    }

    public void h() {
        if (((ArrayDeque) this.g) == null) {
            this.g = new ArrayDeque(4);
        }
        if (((bi91) this.h) == null) {
            this.h = new bi91();
        }
    }

    public void i(lvc1 lvc1Var, int i, String str, String str2) {
        ViewPager2 viewPager2 = (ViewPager2) lvc1Var.d;
        if (!viewPager2.isLaidOut() || viewPager2.isLayoutRequested()) {
            viewPager2.addOnLayoutChangeListener(new zts(lvc1Var, i, (byte) 1));
        } else {
            viewPager2.setCurrentItem(i);
        }
        View view = (View) this.e;
        if (view != null) {
            view.setVisibility(u890.j(str, str2) ? 0 : 8);
        }
    }

    public void j(String str, ti tiVar) {
        ((ohv0) this.e).a(new mhv0(((gp41) this.d).a, str, tiVar, (String) null));
    }

    public void k(at80 at80Var, String str) {
        ((ohv0) this.e).a(new khv0(((gp41) this.d).a, "signup_intent_inline_form_picker", sqg0.J(new mmr0[]{new mmr0("assigned_variant", sqe.s(at80Var)), new mmr0("rendered_form", sqe.r(md80.c)), new mmr0("action", str)})));
    }

    public teb(boolean z, boolean z2, boolean z3, m1h1 m1h1Var, tto1 tto1Var, xto1 xto1Var) {
        this.a = z;
        this.b = z2;
        this.d = m1h1Var;
        this.e = tto1Var;
        this.f = xto1Var;
    }

    public teb(gp41 gp41Var, ohv0 ohv0Var, i8h1 i8h1Var) {
        this.d = gp41Var;
        this.e = ohv0Var;
        this.f = i8h1Var;
        this.h = new LinkedHashSet();
    }
}
