package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p.g611;
import p.h46;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b5x extends FrameLayout {
    public static boolean O0;
    public dkl N0;
    public Float a;
    public int b;
    public final r2a1 c;
    public final llm d;
    public am01 e;
    public boolean f;
    public final ArrayList g;
    public lj90 h;
    public h46 i;
    public m4x t;

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    public b5x(Context context) {
        super(context, null, 0);
        this.b = 9;
        this.c = new r2a1(context);
        llm llmVarE = smo1.e(o6x.a);
        this.d = llmVarE;
        this.e = new zfr(context, (byte) 19);
        this.f = true;
        this.g = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, joz0.a, 0, 0);
        this.a = typedArrayObtainStyledAttributes.hasValue(1) ? Float.valueOf(typedArrayObtainStyledAttributes.getFloat(1, 0.0f)) : null;
        setEmojiGridColumns(typedArrayObtainStyledAttributes.getInt(0, 9));
        typedArrayObtainStyledAttributes.recycle();
        byte b = 2;
        if (a4x.d()) {
            int iC = a4x.a().c();
            if (iC == 0) {
                a4x.a().i(new p2s(this, context, b));
            } else if (iC == 1) {
                O0 = true;
            } else if (iC == 3) {
                a4x.a().i(new p2s(this, context, b));
            }
        }
        fns fnsVar = igu.a;
        fn31.T(llmVarE, b3s.c, 0, new hxn(this, context, false, (lnm) null, (byte) 27), 2);
    }

    public final h46 a() {
        smc0 smc0VarN = k4p1.n();
        lj90 lj90Var = new lj90(2131233792, new o9e(getContext().getString(2131955458)), this.g, Integer.valueOf(this.b * 3), new q6t0(getContext().getString(2131955463)));
        this.h = lj90Var;
        smc0VarN.add(lj90Var);
        List<bdc> list = uwg.P0;
        if (list == null) {
            eg.m("BundledEmojiListLoader.load is not called or complete");
            return null;
        }
        int i = 0;
        for (bdc bdcVar : list) {
            int i2 = i + 1;
            int i3 = bdcVar.a;
            o9e o9eVar = new o9e(bdcVar.b);
            List list2 = bdcVar.c;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = ((p5x) obj).a;
                String str2 = (String) ((Map) ((idd1) this.c.c).getValue()).get(str);
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(new m5x(str, i4 + i, 2));
                i4 = i5;
            }
            smc0VarN.add(new lj90(i3, o9eVar, arrayList, null, null));
            i = i2;
        }
        return new h46(k4p1.k(smc0VarN));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            hhg1.h("Adding views to the EmojiPickerView is unsupported");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        x4x x4xVar;
        int iB;
        if (onmVar instanceof x4x) {
            x4xVar = (x4x) onmVar;
            int i = x4xVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                x4xVar.d = i - os00.INVALID_ID;
            } else {
                x4xVar = new x4x(this, onmVar);
            }
        } else {
            x4xVar = new x4x(this, onmVar);
        }
        Object objB = x4xVar.b;
        int i2 = x4xVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            if (this.f) {
                lj90 lj90Var = this.h;
                iB = lj90Var != null ? lj90Var.b() : 0;
                am01 am01Var = this.e;
                x4xVar.a = iB;
                x4xVar.d = 1;
                objB = am01Var.b(x4xVar);
                if (objB != d9nVar) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objB);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iB = x4xVar.a;
        hm5.M(objB);
        int i3 = iB;
        List list = (List) objB;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        v2b v2bVar = new v2b((Object) this, (Object) list, i3, (lnm) null, (byte) 5);
        x4xVar.d = 2;
        return fn31.Y(bs50Var, v2bVar, x4xVar) == d9nVar ? d9nVar : rih1Var;
    }

    public final void c() {
        this.i = a();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.b, 0);
        gridLayoutManager.m1 = new a5x(this, (byte) 0);
        Context context = getContext();
        h46 h46Var = this.i;
        if (h46Var == null) {
            u890.C("emojiPickerItems");
            throw null;
        }
        o4x o4xVar = new o4x(context, h46Var, new b6(this, gridLayoutManager, (byte) 19));
        super.removeAllViews();
        View viewInflate = View.inflate(getContext(), 2131624561, this);
        RecyclerView recyclerViewN = b8k1.n(viewInflate, 2131428607);
        recyclerViewN.getContext();
        recyclerViewN.setLayoutManager(new LinearLayoutManager() { // from class: androidx.emoji2.emojipicker.EmojiPickerView$showEmojiPickerView$1$1$1
            {
                super(0);
            }

            public final boolean s(g611 g611Var) {
                int paddingStart = (((a) this).O0 - getPaddingStart()) - getPaddingEnd();
                h46 h46Var2 = this.g1.i;
                if (h46Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) g611Var).width = paddingStart / ((List) h46Var2.b).size();
                    return true;
                }
                u890.C("emojiPickerItems");
                throw null;
            }
        });
        recyclerViewN.setAdapter(o4xVar);
        RecyclerView recyclerViewN2 = b8k1.n(viewInflate, 2131428605);
        recyclerViewN2.setLayoutManager(gridLayoutManager);
        m4x m4xVar = new m4x(getContext(), this.b, this.a, this.c, new hx4(this, (byte) 28), new w9(this, (byte) 8));
        m4xVar.x(true);
        this.t = m4xVar;
        recyclerViewN2.setAdapter(m4xVar);
        recyclerViewN2.m(new z4x(o4xVar, this, gridLayoutManager));
        recyclerViewN2.setItemAnimator((e611) null);
        m611 m611Var = new m611();
        l611 l611VarA = m611Var.a(2);
        l611VarA.b = (byte) 100;
        ArrayList arrayList = l611VarA.a;
        while (arrayList.size() > 100) {
            arrayList.remove(arrayList.size() - 1);
        }
        recyclerViewN2.setRecycledViewPool(m611Var);
    }

    public final int getEmojiGridColumns() {
        return this.b;
    }

    public final float getEmojiGridRows() {
        Float f = this.a;
        if (f != null) {
            return f.floatValue();
        }
        return -1.0f;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    public final void setEmojiGridColumns(int i) {
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        this.b = numValueOf != null ? numValueOf.intValue() : 9;
        if (isLaidOut()) {
            c();
        }
    }

    public final void setEmojiGridRows(float f) {
        Float fValueOf = Float.valueOf(f);
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        this.a = fValueOf;
        if (isLaidOut()) {
            c();
        }
    }

    public final void setOnEmojiPickedListener(dkl dklVar) {
        this.N0 = dklVar;
    }

    public final void setRecentEmojiProvider(am01 am01Var) {
        this.e = am01Var;
        fn31.T(this.d, null, 0, new y4x(this, null, (byte) 0), 3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            hhg1.h("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            hhg1.h("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            hhg1.h("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i, i2);
        } else {
            hhg1.h("Adding views to the EmojiPickerView is unsupported");
        }
    }
}
