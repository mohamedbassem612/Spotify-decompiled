package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xsw0 extends z511 {
    public final /* synthetic */ byte d;
    public List e;

    public xsw0(byte b) {
        this.d = b;
        switch (b) {
            case 1:
                break;
            default:
                this.e = z6x.a;
                break;
        }
    }

    public void A(List list) {
        j4u j4uVarP = w0h1.p(new e7v0(this.e, list, (byte) 3));
        this.e = list;
        j4uVarP.b(this);
    }

    public final int e() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.e.size();
    }

    public int g(int i) {
        switch (this.d) {
            case 0:
                atw0 atw0Var = (atw0) this.e.get(i);
                if (atw0Var instanceof zsw0) {
                    return 2131625104;
                }
                if (atw0Var instanceof ysw0) {
                    return 2131625103;
                }
                eg.o();
                return 0;
            case 1:
                return i;
            default:
                return super.g(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:113:0x02be A[LOOP:4: B:111:0x02b8->B:113:0x02be, LOOP_END] */
    public final void n(int i, w611 w611Var) {
        Integer num;
        int i2;
        switch (this.d) {
            case 0:
                atw0 atw0Var = (atw0) this.e.get(i);
                if (atw0Var instanceof zsw0) {
                    zsw0 zsw0Var = (zsw0) atw0Var;
                    int i3 = zsw0Var.b;
                    wp20 wp20Var = ((wsw0) w611Var).U0;
                    TextView textView = (TextView) wp20Var.b;
                    TextView textView2 = (TextView) wp20Var.c;
                    TextView textView3 = (TextView) wp20Var.e;
                    ConstraintLayout constraintLayout = (ConstraintLayout) wp20Var.a;
                    List listM = p7h.M(new TextView[]{textView, textView2, textView3});
                    textView.setText(zsw0Var.c);
                    textView2.setText(zsw0Var.d);
                    String str = zsw0Var.e;
                    textView3.setVisibility(str != null ? 0 : 8);
                    if (str != null) {
                        textView3.setText(str);
                    }
                    List<TextView> list = listM;
                    for (TextView textView4 : list) {
                        textView4.setPaintFlags(i3 == 4 ? textView4.getPaintFlags() | 16 : textView4.getPaintFlags() & (-17));
                    }
                    int iC = l1d.C(i3);
                    if (iC == 0) {
                        for (TextView textView5 : list) {
                            textView5.getClass();
                            textView5.setTextAppearance(2132018006);
                            textView5.setTextColor(hqq0.M(textView5.getContext(), 2130970418));
                        }
                    } else if (iC == 1) {
                        for (TextView textView6 : list) {
                            textView6.getClass();
                            textView6.setTextAppearance(2132018007);
                            textView6.setTextColor(hqq0.M(textView6.getContext(), 2130970438));
                        }
                    } else if (iC == 2) {
                        for (TextView textView7 : list) {
                            textView7.getClass();
                            textView7.setTextAppearance(2132018007);
                            textView7.setTextColor(hqq0.M(textView7.getContext(), 2130970433));
                        }
                    } else if (iC == 3) {
                        while (r2.hasNext()) {
                            textView5.getClass();
                            textView5.setTextAppearance(2132018006);
                            textView5.setTextColor(hqq0.M(textView5.getContext(), 2130970418));
                        }
                    } else if (iC != 4) {
                        eg.o();
                    } else {
                        for (TextView textView8 : list) {
                            textView8.getClass();
                            textView8.setTextAppearance(2132018007);
                            textView8.setTextColor(hqq0.M(textView8.getContext(), 2130970418));
                        }
                    }
                    int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(2131165907);
                    constraintLayout.setPadding(constraintLayout.getPaddingLeft(), dimensionPixelSize, constraintLayout.getPaddingRight(), dimensionPixelSize);
                    int iC2 = l1d.C(zsw0Var.a);
                    if (iC2 == 0) {
                        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), 0);
                        num = 2131233779;
                    } else if (iC2 == 1) {
                        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), 0, constraintLayout.getPaddingRight(), 0);
                        num = 2131233778;
                    } else if (iC2 == 2) {
                        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), 0, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
                        num = 2131233777;
                    } else if (iC2 == 3) {
                        num = 2131233780;
                    } else if (iC2 != 4) {
                        eg.o();
                    } else {
                        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), 0, constraintLayout.getPaddingRight(), 0);
                        num = null;
                    }
                    if (num != null) {
                        ((ConstraintLayout) wp20Var.d).setBackgroundResource(num.intValue());
                    }
                    break;
                } else if (!(atw0Var instanceof ysw0)) {
                    eg.o();
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                wqe1 wqe1Var = (wqe1) w611Var;
                List list2 = this.e;
                dme1 dme1Var = (dme1) list2.get(i);
                int size = list2.size();
                if (size == 1) {
                    i2 = 4;
                } else if (i == 0) {
                    i2 = 1;
                } else {
                    i2 = i == size - 1 ? 3 : 2;
                }
                ur00 ur00Var = wqe1Var.U0;
                View view = (View) ur00Var.c;
                View view2 = (View) ur00Var.f;
                int iC3 = l1d.C(i2);
                if (iC3 == 0) {
                    view2.setVisibility(4);
                    view.setVisibility(0);
                } else if (iC3 == 1) {
                    view2.setVisibility(0);
                    view.setVisibility(0);
                } else if (iC3 == 2) {
                    view2.setVisibility(0);
                    view.setVisibility(4);
                } else if (iC3 != 3) {
                    eg.o();
                } else {
                    view2.setVisibility(4);
                    view.setVisibility(4);
                }
                ((ImageView) ur00Var.d).setImageResource(dme1Var.a ? 2131233975 : 2131233976);
                ((TextView) ur00Var.e).setText(Html.fromHtml(dme1Var.b, 0));
                break;
            default:
                wue1 wue1Var = (wue1) w611Var;
                ose1 ose1Var = (ose1) this.e.get(i);
                int i4 = wue1Var.W0;
                int i5 = wue1Var.V0;
                p410 p410Var = wue1Var.U0;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) p410Var.b;
                Space space = (Space) p410Var.d;
                ImageView imageView = (ImageView) p410Var.g;
                TextView textView9 = (TextView) p410Var.c;
                TextView textView10 = (TextView) p410Var.e;
                int color = constraintLayout2.getContext().getColor(2131104462);
                Context context = constraintLayout2.getContext();
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(2130968791, typedValue, true);
                int i6 = typedValue.data;
                View view3 = (View) p410Var.h;
                view3.setBackgroundTintList(ColorStateList.valueOf(ose1Var.q0() ? color : i6));
                ((View) p410Var.f).setBackgroundTintList(ColorStateList.valueOf(ose1Var.I() ? color : i6));
                if (ose1Var instanceof nse1) {
                    nse1 nse1Var = (nse1) ose1Var;
                    boolean z = nse1Var.c;
                    view3.setVisibility(!z ? 0 : 8);
                    imageView.setVisibility(0);
                    imageView.setImageResource(z ? 2131233975 : 2131233976);
                    if (!nse1Var.b) {
                        color = i6;
                    }
                    imageView.setImageTintList(ColorStateList.valueOf(color));
                    space.setVisibility(8);
                    textView10.setVisibility(0);
                    textView9.setVisibility(0);
                    textView10.setTextColor(i5);
                    textView9.setTextColor(i5);
                    textView10.setPaddingRelative(0, textView10.getPaddingTop(), textView10.getPaddingEnd(), textView10.getPaddingBottom());
                    textView10.setText(Html.fromHtml(nse1Var.d, 0));
                    String str2 = nse1Var.e;
                    textView9.setText(str2 != null ? Html.fromHtml(str2, 0) : null);
                } else if (ose1Var instanceof mse1) {
                    view3.setVisibility(0);
                    imageView.setVisibility(8);
                    space.setVisibility(8);
                    textView10.setVisibility(0);
                    textView9.setVisibility(0);
                    mse1 mse1Var = (mse1) ose1Var;
                    textView10.setPaddingRelative(mse1Var.c ? constraintLayout2.getContext().getResources().getDimensionPixelOffset(2131165904) : 0, textView10.getPaddingTop(), textView10.getPaddingEnd(), textView10.getPaddingBottom());
                    textView10.setTextColor(i4);
                    textView9.setTextColor(i4);
                    textView10.setText(Html.fromHtml(mse1Var.d, 0));
                    String str3 = mse1Var.e;
                    textView9.setText(str3 != null ? Html.fromHtml(str3, 0) : null);
                } else if (ose1Var instanceof kse1) {
                    view3.setVisibility(0);
                    imageView.setVisibility(8);
                    space.setVisibility(0);
                    textView10.setVisibility(8);
                    textView9.setVisibility(8);
                } else {
                    eg.o();
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007c A[PHI: r2
      0x007c: PHI (r2v7 int) = (r2v6 int), (r2v8 int), (r2v9 int), (r2v10 int), (r2v11 int) binds: [B:5:0x002d, B:7:0x0038, B:9:0x0044, B:11:0x0050, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    public final w611 p(int i, ViewGroup viewGroup) {
        wsw0 l4xVar;
        int i2 = 2131431343;
        switch (this.d) {
            case 0:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                if (i == 2131625104) {
                    ConstraintLayout constraintLayoutInflate = layoutInflaterFrom.inflate(2131625104, viewGroup, false);
                    int i3 = 2131429710;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131429710);
                    if (textView != null) {
                        i3 = 2131430493;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430493);
                        if (textView2 != null) {
                            i3 = 2131430713;
                            ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131430713);
                            if (constraintLayoutT != null) {
                                i3 = 2131431217;
                                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431217);
                                if (textView3 != null) {
                                    l4xVar = new wsw0(this, new wp20(constraintLayoutInflate, textView, textView2, constraintLayoutT, textView3));
                                }
                            }
                        }
                    }
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i3)));
                    return null;
                }
                if (i != 2131625103) {
                    hhg1.n("Received incompatible viewType");
                    return null;
                }
                View viewInflate = layoutInflaterFrom.inflate(2131625103, viewGroup, false);
                if (m5n1.t(viewInflate, 2131427742) == null) {
                    bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131427742)));
                    return null;
                }
                l4xVar = new l4x((FrameLayout) viewInflate);
                return l4xVar;
            case 1:
                e491 e491Var = (e491) this.e.get(i);
                Context context = viewGroup.getContext();
                return new g391(e491Var.a(context, LayoutInflater.from(context), viewGroup));
            case 2:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(2131625106, viewGroup, false);
                View viewT = m5n1.t(constraintLayoutInflate2, 2131427763);
                if (viewT != null) {
                    ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate2, 2131431343);
                    if (imageView != null) {
                        i2 = 2131431345;
                        TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431345);
                        if (textView4 != null) {
                            i2 = 2131431452;
                            View viewT2 = m5n1.t(constraintLayoutInflate2, 2131431452);
                            if (viewT2 != null) {
                                return new wqe1(new ur00(constraintLayoutInflate2, viewT, imageView, textView4, viewT2, (byte) 14));
                            }
                        }
                    }
                } else {
                    i2 = 2131427763;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i2)));
                return null;
            default:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(2131625107, viewGroup, false);
                int i4 = 2131428652;
                TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate3, 2131428652);
                if (textView5 != null) {
                    i4 = 2131429067;
                    if (m5n1.t(constraintLayoutInflate3, 2131429067) != null) {
                        i4 = 2131431031;
                        Space space = (Space) m5n1.t(constraintLayoutInflate3, 2131431031);
                        if (space != null) {
                            i4 = 2131431076;
                            TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431076);
                            if (textView6 != null) {
                                i4 = 2131431342;
                                View viewT3 = m5n1.t(constraintLayoutInflate3, 2131431342);
                                if (viewT3 != null) {
                                    ImageView imageView2 = (ImageView) m5n1.t(constraintLayoutInflate3, 2131431343);
                                    if (imageView2 != null) {
                                        i2 = 2131431346;
                                        View viewT4 = m5n1.t(constraintLayoutInflate3, 2131431346);
                                        if (viewT4 != null) {
                                            return new wue1(new p410(constraintLayoutInflate3, textView5, space, textView6, viewT3, imageView2, viewT4, (byte) 13));
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                            } else {
                                i2 = i4;
                            }
                        } else {
                            i2 = i4;
                        }
                    } else {
                        i2 = i4;
                    }
                } else {
                    i2 = i4;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i2)));
                return null;
        }
    }

    public /* synthetic */ xsw0(List list, byte b) {
        this.d = b;
        this.e = list;
    }
}
