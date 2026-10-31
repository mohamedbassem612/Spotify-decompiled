package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p.asj0;
import p.ctf1;
import p.gl61;
import p.h0g1;
import p.ie30;
import p.l0g1;
import p.lqr;
import p.n3g1;
import p.pnf1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class TrackSelectionView extends LinearLayout {
    public static final /* synthetic */ int P0 = 0;
    public CheckedTextView[][] N0;
    public boolean O0;
    public final int a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final gl61 e;
    public final ArrayList f;
    public final HashMap g;
    public boolean h;
    public boolean i;
    public ctf1 t;

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.b = layoutInflaterFrom;
        View.OnClickListener gl61Var = new gl61(this, (byte) 13);
        this.e = gl61Var;
        this.t = new lqr(getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(2131955830);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(gl61Var);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(2131624618, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(2131955829);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(gl61Var);
        addView(checkedTextView2);
    }

    public final void a() {
        this.c.setChecked(this.O0);
        boolean z = this.O0;
        HashMap map = this.g;
        this.d.setChecked(!z && map.isEmpty());
        for (int i = 0; i < this.N0.length; i++) {
            h0g1 h0g1Var = (h0g1) map.get(((n3g1) this.f.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.N0[i];
                if (i2 < checkedTextViewArr.length) {
                    if (h0g1Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.N0[i][i2].setChecked(h0g1Var.b.contains(Integer.valueOf(((l0g1) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.ViewGroup, androidx.media3.ui.TrackSelectionView] */
    public final void b() {
        String strC;
        String string;
        boolean z;
        boolean z2;
        boolean z3 = true;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.d;
        boolean z4 = false;
        CheckedTextView checkedTextView2 = this.c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.N0 = new CheckedTextView[arrayList.size()][];
        boolean z5 = this.i && arrayList.size() > 1;
        int i = 0;
        while (i < arrayList.size()) {
            n3g1 n3g1Var = (n3g1) arrayList.get(i);
            boolean z6 = (this.h && n3g1Var.c) ? z3 : z4;
            CheckedTextView[][] checkedTextViewArr = this.N0;
            int i2 = n3g1Var.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            l0g1[] l0g1VarArr = new l0g1[i2];
            for (?? r10 = z4; r10 < n3g1Var.a; r10++) {
                l0g1VarArr[r10] = new l0g1(n3g1Var, r10);
            }
            for (?? r11 = z4; r11 < i2; r11++) {
                LayoutInflater layoutInflater = this.b;
                if (r11 == 0) {
                    addView(layoutInflater.inflate(2131624618, (ViewGroup) this, z4));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z6 || z5) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, z4);
                checkedTextView3.setBackgroundResource(this.a);
                lqr lqrVar = this.t;
                l0g1 l0g1Var = l0g1VarArr[r11];
                ie30 ie30Var = l0g1Var.a.b.d[l0g1Var.b];
                lqr lqrVar2 = lqrVar;
                Resources resources = (Resources) lqrVar2.b;
                Resources resources2 = (Resources) lqrVar2.b;
                String str = ie30Var.f66p;
                int i3 = ie30Var.k;
                ArrayList arrayList2 = arrayList;
                int i4 = ie30Var.J;
                boolean z7 = z5;
                int i5 = ie30Var.x;
                int i6 = i;
                int i7 = ie30Var.w;
                String str2 = ie30Var.l;
                int i8 = asj0.i(str);
                boolean z8 = z6;
                l0g1[] l0g1VarArr2 = l0g1VarArr;
                if (i8 == -1) {
                    if (asj0.j(str2) != null) {
                        i8 = 2;
                    } else if (asj0.b(str2) != null) {
                        i8 = 1;
                    } else if (i7 != -1 || i5 != -1) {
                        i8 = 2;
                    } else if (i4 == -1 && ie30Var.L == -1) {
                        i8 = -1;
                    } else {
                        i8 = 1;
                    }
                }
                if (i8 == 2) {
                    strC = lqrVar2.k(new String[]{lqrVar2.d(ie30Var), (i7 == -1 || i5 == -1) ? "" : resources.getString(2131955824, Integer.valueOf(i7), Integer.valueOf(i5)), i3 != -1 ? resources2.getString(2131955822, Float.valueOf(i3 / 1000000.0f)) : ""});
                } else if (i8 == 1) {
                    String strC2 = lqrVar2.c(ie30Var);
                    if (i4 == -1 || i4 < 1) {
                        string = "";
                    } else if (i4 == 1) {
                        string = resources.getString(2131955823);
                    } else if (i4 == 2) {
                        string = resources.getString(2131955832);
                    } else if (i4 == 6 || i4 == 7) {
                        string = resources.getString(2131955834);
                    } else {
                        string = i4 != 8 ? resources.getString(2131955833) : resources.getString(2131955835);
                    }
                    strC = lqrVar2.k(new String[]{strC2, string, i3 != -1 ? resources2.getString(2131955822, Float.valueOf(i3 / 1000000.0f)) : ""});
                } else {
                    strC = lqrVar2.c(ie30Var);
                }
                if (strC.isEmpty()) {
                    String str3 = ie30Var.d;
                    strC = (str3 == null || str3.trim().isEmpty()) ? resources.getString(2131955836) : resources.getString(2131955837, str3);
                }
                checkedTextView3.setText(strC);
                checkedTextView3.setTag(l0g1VarArr2[r11]);
                if (n3g1Var.d[r11] != 4) {
                    z = false;
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                    z2 = true;
                } else {
                    z = false;
                    z2 = true;
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.e);
                }
                this.N0[i6][r11] = checkedTextView3;
                addView(checkedTextView3);
                z4 = z;
                z3 = z2;
                arrayList = arrayList2;
                z5 = z7;
                i = i6;
                z6 = z8;
                l0g1VarArr = l0g1VarArr2;
            }
            i++;
            arrayList = arrayList;
            z5 = z5;
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.O0;
    }

    public Map<pnf1, h0g1> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.h != z) {
            this.h = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z) {
                HashMap map = this.g;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        h0g1 h0g1Var = (h0g1) map.get(((n3g1) arrayList.get(i)).b);
                        if (h0g1Var != null && map2.isEmpty()) {
                            map2.put(h0g1Var.a, h0g1Var);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(ctf1 ctf1Var) {
        ctf1Var.getClass();
        this.t = ctf1Var;
        b();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
