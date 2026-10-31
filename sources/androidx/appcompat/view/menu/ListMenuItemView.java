package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import app.p000rive.semantics.SemanticState;
import p.lvc1;
import p.moz0;
import p.msi0;
import p.rti0;
import p.ysi0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ListMenuItemView extends LinearLayout implements rti0, AbsListView.SelectionBoundsAdjuster {
    public final int N0;
    public final Context O0;
    public boolean P0;
    public final Drawable Q0;
    public final boolean R0;
    public LayoutInflater S0;
    public boolean T0;
    public ysi0 a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public final Drawable t;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        lvc1 lvc1VarE = lvc1.E(getContext(), attributeSet, moz0.r, i);
        this.t = lvc1VarE.k(5);
        TypedArray typedArray = (TypedArray) lvc1VarE.c;
        this.N0 = typedArray.getResourceId(1, -1);
        this.P0 = typedArray.getBoolean(7, false);
        this.O0 = context;
        this.Q0 = lvc1VarE.k(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, 2130969177, 0);
        this.R0 = typedArrayObtainStyledAttributes.hasValue(0);
        lvc1VarE.I();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.S0;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.S0 = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // p.rti0
    public final void d(ysi0 ysi0Var) {
        boolean z;
        int i;
        String string;
        this.a = ysi0Var;
        boolean zIsVisible = ysi0Var.isVisible();
        msi0 msi0Var = ysi0Var.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(ysi0Var.e);
        setCheckable(ysi0Var.isCheckable());
        if (msi0Var.p()) {
            if ((msi0Var.o() ? ysi0Var.j : ysi0Var.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        msi0Var.o();
        if (z) {
            ysi0 ysi0Var2 = this.a;
            msi0 msi0Var2 = ysi0Var2.n;
            if (msi0Var2.p()) {
                i = (msi0Var2.o() ? ysi0Var2.j : ysi0Var2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.f;
            ysi0 ysi0Var3 = this.a;
            msi0 msi0Var3 = ysi0Var3.n;
            Context context = msi0Var3.a;
            char c = msi0Var3.o() ? ysi0Var3.j : ysi0Var3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(2131951641));
                }
                int i2 = msi0Var3.o() ? ysi0Var3.k : ysi0Var3.i;
                ysi0.c(sb, resources.getString(2131951637), i2, 65536);
                ysi0.c(sb, resources.getString(2131951633), i2, SemanticState.Obscured);
                ysi0.c(sb, resources.getString(2131951632), i2, 2);
                ysi0.c(sb, resources.getString(2131951638), i2, 1);
                ysi0.c(sb, resources.getString(2131951640), i2, 4);
                ysi0.c(sb, resources.getString(2131951636), i2, 8);
                if (c == '\b') {
                    sb.append(resources.getString(2131951634));
                } else if (c == '\n') {
                    sb.append(resources.getString(2131951635));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(2131951639));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
        setIcon(ysi0Var.getIcon());
        setEnabled(ysi0Var.isEnabled());
        setSubMenuArrowVisible(ysi0Var.hasSubMenu());
        setContentDescription(ysi0Var.q);
    }

    @Override // p.rti0
    public ysi0 getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.t);
        TextView textView = (TextView) findViewById(app.p000rive.runtime.kotlin.R.id.title);
        this.d = textView;
        int i = this.N0;
        if (i != -1) {
            textView.setTextAppearance(this.O0, i);
        }
        this.f = (TextView) findViewById(2131430957);
        ImageView imageView = (ImageView) findViewById(2131431107);
        this.g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.Q0);
        }
        this.h = (ImageView) findViewById(2131429042);
        this.i = (LinearLayout) findViewById(2131428203);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.P0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131623953, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            compoundButton2 = this.e;
            compoundButton3 = compoundButton2;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131623950, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            compoundButton2 = this.c;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.a.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131623953, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131623950, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.T0 = z;
        this.P0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.R0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        msi0 msi0Var = this.a.n;
        boolean z = this.T0;
        if (z || this.P0) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.P0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(2131623951, (ViewGroup) this, false);
                this.b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.P0) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969652);
    }
}
