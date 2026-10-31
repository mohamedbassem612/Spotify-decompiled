package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.card.EncoreCard;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eg1 implements bik1 {
    public final /* synthetic */ byte a;
    public final uaq0 b;

    public /* synthetic */ eg1(gml gmlVar, byte b) {
        this.a = b;
        this.b = gmlVar;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x037d A[PHI: r2
      0x037d: PHI (r2v9 int) = (r2v8 int), (r2v12 int), (r2v13 int), (r2v17 int), (r2v18 int), (r2v20 int), (r2v22 int), (r2v24 int) binds: [B:120:0x02bc, B:124:0x02d1, B:126:0x02de, B:134:0x0309, B:136:0x0316, B:140:0x0330, B:144:0x0347, B:148:0x035d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0242 A[PHI: r2
      0x0242: PHI (r2v42 int) = (r2v41 int), (r2v44 int), (r2v45 int) binds: [B:88:0x01ff, B:92:0x0219, B:96:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.bik1
    public final w611 a(ViewGroup viewGroup) {
        int i = 2131431313;
        int i2 = 2131431301;
        int i3 = 2131430538;
        int i4 = 2131427868;
        switch (this.a) {
            case 0:
                EncoreCard encoreCardL = eqq.l(viewGroup, 2131624022, viewGroup, false);
                int i5 = 2131427520;
                EncoreButton encoreButtonT = m5n1.t(encoreCardL, 2131427520);
                if (encoreButtonT != null) {
                    i5 = 2131431294;
                    EncoreTextView encoreTextViewT = m5n1.t(encoreCardL, 2131431294);
                    if (encoreTextViewT != null) {
                        i5 = 2131431295;
                        EncoreTextView encoreTextViewT2 = m5n1.t(encoreCardL, 2131431295);
                        if (encoreTextViewT2 != null) {
                            return new dg1(this, new bg1(encoreCardL, encoreButtonT, encoreTextViewT, encoreTextViewT2));
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(encoreCardL.getResources().getResourceName(i5)));
                return null;
            case 1:
                EncoreCard encoreCardL2 = eqq.l(viewGroup, 2131625142, viewGroup, false);
                int i6 = 2131429625;
                if (((ImageView) m5n1.t(encoreCardL2, 2131429625)) == null) {
                    i2 = i6;
                } else if (((ImageView) m5n1.t(encoreCardL2, 2131429626)) != null) {
                    i6 = 2131429885;
                    RelativeLayout relativeLayout = (RelativeLayout) m5n1.t(encoreCardL2, 2131429885);
                    if (relativeLayout != null) {
                        i6 = 2131430537;
                        LinearProgressIndicator linearProgressIndicatorT = m5n1.t(encoreCardL2, 2131430537);
                        if (linearProgressIndicatorT == null) {
                            i2 = i6;
                        } else {
                            LinearProgressIndicator linearProgressIndicatorT2 = m5n1.t(encoreCardL2, 2131430538);
                            if (linearProgressIndicatorT2 != null) {
                                EncoreTextView encoreTextViewT3 = m5n1.t(encoreCardL2, 2131431300);
                                if (encoreTextViewT3 != null) {
                                    EncoreTextView encoreTextViewT4 = m5n1.t(encoreCardL2, 2131431301);
                                    if (encoreTextViewT4 != null) {
                                        i6 = 2131431302;
                                        EncoreTextView encoreTextViewT5 = m5n1.t(encoreCardL2, 2131431302);
                                        if (encoreTextViewT5 != null) {
                                            i6 = 2131431304;
                                            EncoreTextView encoreTextViewT6 = m5n1.t(encoreCardL2, 2131431304);
                                            if (encoreTextViewT6 != null) {
                                                i2 = 2131431305;
                                                EncoreTextView encoreTextViewT7 = m5n1.t(encoreCardL2, 2131431305);
                                                if (encoreTextViewT7 != null) {
                                                    i6 = 2131431307;
                                                    EncoreTextView encoreTextViewT8 = m5n1.t(encoreCardL2, 2131431307);
                                                    if (encoreTextViewT8 == null) {
                                                        i2 = i6;
                                                    } else {
                                                        EncoreTextView encoreTextViewT9 = m5n1.t(encoreCardL2, 2131431309);
                                                        if (encoreTextViewT9 != null) {
                                                            i6 = 2131431310;
                                                            EncoreTextView encoreTextViewT10 = m5n1.t(encoreCardL2, 2131431310);
                                                            if (encoreTextViewT10 != null) {
                                                                i2 = 2131431314;
                                                                EncoreTextView encoreTextViewT11 = m5n1.t(encoreCardL2, 2131431314);
                                                                if (encoreTextViewT11 != null) {
                                                                    i6 = 2131431613;
                                                                    View viewT = m5n1.t(encoreCardL2, 2131431613);
                                                                    if (viewT != null) {
                                                                        i2 = 2131431614;
                                                                        View viewT2 = m5n1.t(encoreCardL2, 2131431614);
                                                                        if (viewT2 != null) {
                                                                            return new cid0(this, new wj3(encoreCardL2, relativeLayout, linearProgressIndicatorT, linearProgressIndicatorT2, encoreTextViewT3, encoreTextViewT4, encoreTextViewT5, encoreTextViewT6, encoreTextViewT7, encoreTextViewT8, encoreTextViewT9, encoreTextViewT10, encoreTextViewT11, viewT, viewT2, (byte) 17));
                                                                        }
                                                                    } else {
                                                                        i2 = i6;
                                                                    }
                                                                }
                                                            } else {
                                                                i2 = i6;
                                                            }
                                                        } else {
                                                            i2 = 2131431309;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i2 = i6;
                                            }
                                        } else {
                                            i2 = i6;
                                        }
                                    }
                                } else {
                                    i2 = 2131431300;
                                }
                            } else {
                                i2 = 2131430538;
                            }
                        }
                    } else {
                        i2 = i6;
                    }
                } else {
                    i2 = 2131429626;
                }
                bhn0.i("Missing required view with ID: ".concat(encoreCardL2.getResources().getResourceName(i2)));
                return null;
            case 2:
                EncoreCard encoreCardL3 = eqq.l(viewGroup, 2131625590, viewGroup, false);
                EncoreButton encoreButtonT2 = m5n1.t(encoreCardL3, 2131427868);
                if (encoreButtonT2 != null) {
                    i4 = 2131431296;
                    EncoreTextView encoreTextViewT12 = m5n1.t(encoreCardL3, 2131431296);
                    if (encoreTextViewT12 != null) {
                        return new wo21(this, new k811(encoreCardL3, encoreButtonT2, encoreTextViewT12, (byte) 25));
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(encoreCardL3.getResources().getResourceName(i4)));
                return null;
            case 3:
                EncoreCard encoreCardL4 = eqq.l(viewGroup, 2131626209, viewGroup, false);
                EncoreButton encoreButtonT3 = m5n1.t(encoreCardL4, 2131427869);
                if (encoreButtonT3 == null) {
                    i2 = 2131427869;
                } else if (((ImageView) m5n1.t(encoreCardL4, 2131429626)) != null) {
                    LinearProgressIndicator linearProgressIndicatorT3 = m5n1.t(encoreCardL4, 2131430538);
                    if (linearProgressIndicatorT3 != null) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) m5n1.t(encoreCardL4, 2131430898);
                        if (relativeLayout2 != null) {
                            EncoreTextView encoreTextViewT13 = m5n1.t(encoreCardL4, 2131431300);
                            if (encoreTextViewT13 != null) {
                                EncoreTextView encoreTextViewT14 = m5n1.t(encoreCardL4, 2131431301);
                                if (encoreTextViewT14 != null) {
                                    EncoreTextView encoreTextViewT15 = m5n1.t(encoreCardL4, 2131431305);
                                    if (encoreTextViewT15 != null) {
                                        EncoreTextView encoreTextViewT16 = m5n1.t(encoreCardL4, 2131431308);
                                        if (encoreTextViewT16 != null) {
                                            EncoreTextView encoreTextViewT17 = m5n1.t(encoreCardL4, 2131431309);
                                            if (encoreTextViewT17 != null) {
                                                EncoreTextView encoreTextViewT18 = m5n1.t(encoreCardL4, 2131431310);
                                                if (encoreTextViewT18 != null) {
                                                    int i7 = 2131431311;
                                                    EncoreTextView encoreTextViewT19 = m5n1.t(encoreCardL4, 2131431311);
                                                    if (encoreTextViewT19 == null) {
                                                        i2 = i7;
                                                    } else {
                                                        EncoreTextView encoreTextViewT20 = m5n1.t(encoreCardL4, 2131431314);
                                                        if (encoreTextViewT20 != null) {
                                                            i7 = 2131431455;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) m5n1.t(encoreCardL4, 2131431455);
                                                            if (relativeLayout3 == null) {
                                                                i2 = i7;
                                                            } else {
                                                                View viewT3 = m5n1.t(encoreCardL4, 2131431613);
                                                                if (viewT3 != null) {
                                                                    i7 = 2131431615;
                                                                    View viewT4 = m5n1.t(encoreCardL4, 2131431615);
                                                                    if (viewT4 != null) {
                                                                        return new hlc1(this, new wj3(encoreCardL4, encoreButtonT3, linearProgressIndicatorT3, relativeLayout2, encoreTextViewT13, encoreTextViewT14, encoreTextViewT15, encoreTextViewT16, encoreTextViewT17, encoreTextViewT18, encoreTextViewT19, encoreTextViewT20, relativeLayout3, viewT3, viewT4, (byte) 19));
                                                                    }
                                                                    i2 = i7;
                                                                } else {
                                                                    i2 = 2131431613;
                                                                }
                                                            }
                                                        } else {
                                                            i2 = 2131431314;
                                                        }
                                                    }
                                                } else {
                                                    i2 = 2131431310;
                                                }
                                            } else {
                                                i2 = 2131431309;
                                            }
                                        } else {
                                            i2 = 2131431308;
                                        }
                                    } else {
                                        i2 = 2131431305;
                                    }
                                }
                            } else {
                                i2 = 2131431300;
                            }
                        } else {
                            i2 = 2131430898;
                        }
                    } else {
                        i2 = 2131430538;
                    }
                } else {
                    i2 = 2131429626;
                }
                bhn0.i("Missing required view with ID: ".concat(encoreCardL4.getResources().getResourceName(i2)));
                return null;
            case 4:
                EncoreCard encoreCardL5 = eqq.l(viewGroup, 2131626210, viewGroup, false);
                EncoreButton encoreButtonT4 = m5n1.t(encoreCardL5, 2131427868);
                if (encoreButtonT4 != null) {
                    EncoreTextView encoreTextViewT21 = m5n1.t(encoreCardL5, 2131431312);
                    if (encoreTextViewT21 != null) {
                        EncoreTextView encoreTextViewT22 = m5n1.t(encoreCardL5, 2131431313);
                        if (encoreTextViewT22 != null) {
                            return new llc1(this, new bg1(encoreCardL5, encoreButtonT4, encoreTextViewT21, encoreTextViewT22));
                        }
                    } else {
                        i = 2131431312;
                    }
                } else {
                    i = 2131427868;
                }
                bhn0.i("Missing required view with ID: ".concat(encoreCardL5.getResources().getResourceName(i)));
                return null;
            case 5:
                EncoreCard encoreCardL6 = eqq.l(viewGroup, 2131626270, viewGroup, false);
                EncoreButton encoreButtonT5 = m5n1.t(encoreCardL6, 2131427869);
                if (encoreButtonT5 == null) {
                    i3 = 2131427869;
                } else if (((ImageView) m5n1.t(encoreCardL6, 2131429626)) != null) {
                    LinearProgressIndicator linearProgressIndicatorT4 = m5n1.t(encoreCardL6, 2131430538);
                    if (linearProgressIndicatorT4 != null) {
                        RelativeLayout relativeLayout4 = (RelativeLayout) m5n1.t(encoreCardL6, 2131430898);
                        if (relativeLayout4 != null) {
                            EncoreTextView encoreTextViewT23 = m5n1.t(encoreCardL6, 2131431300);
                            if (encoreTextViewT23 != null) {
                                EncoreTextView encoreTextViewT24 = m5n1.t(encoreCardL6, 2131431301);
                                if (encoreTextViewT24 != null) {
                                    EncoreTextView encoreTextViewT25 = m5n1.t(encoreCardL6, 2131431308);
                                    if (encoreTextViewT25 != null) {
                                        EncoreTextView encoreTextViewT26 = m5n1.t(encoreCardL6, 2131431309);
                                        if (encoreTextViewT26 != null) {
                                            EncoreTextView encoreTextViewT27 = m5n1.t(encoreCardL6, 2131431310);
                                            if (encoreTextViewT27 != null) {
                                                EncoreTextView encoreTextViewT28 = m5n1.t(encoreCardL6, 2131431311);
                                                if (encoreTextViewT28 != null) {
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) m5n1.t(encoreCardL6, 2131431455);
                                                    if (relativeLayout5 != null) {
                                                        View viewT5 = m5n1.t(encoreCardL6, 2131431613);
                                                        if (viewT5 != null) {
                                                            View viewT6 = m5n1.t(encoreCardL6, 2131431615);
                                                            if (viewT6 != null) {
                                                                return new ugf1(this, new s24(encoreCardL6, encoreButtonT5, linearProgressIndicatorT4, relativeLayout4, encoreTextViewT23, encoreTextViewT24, encoreTextViewT25, encoreTextViewT26, encoreTextViewT27, encoreTextViewT28, relativeLayout5, viewT5, viewT6, (byte) 22));
                                                            }
                                                            i3 = 2131431615;
                                                        } else {
                                                            i3 = 2131431613;
                                                        }
                                                    } else {
                                                        i3 = 2131431455;
                                                    }
                                                } else {
                                                    i3 = 2131431311;
                                                }
                                            } else {
                                                i3 = 2131431310;
                                            }
                                        } else {
                                            i3 = 2131431309;
                                        }
                                    } else {
                                        i3 = 2131431308;
                                    }
                                } else {
                                    i3 = 2131431301;
                                }
                            } else {
                                i3 = 2131431300;
                            }
                        } else {
                            i3 = 2131430898;
                        }
                    }
                } else {
                    i3 = 2131429626;
                }
                bhn0.i("Missing required view with ID: ".concat(encoreCardL6.getResources().getResourceName(i3)));
                return null;
            default:
                EncoreCard encoreCardL7 = eqq.l(viewGroup, 2131626272, viewGroup, false);
                EncoreButton encoreButtonT6 = m5n1.t(encoreCardL7, 2131427868);
                if (encoreButtonT6 != null) {
                    EncoreTextView encoreTextViewT29 = m5n1.t(encoreCardL7, 2131431312);
                    if (encoreTextViewT29 != null) {
                        EncoreTextView encoreTextViewT30 = m5n1.t(encoreCardL7, 2131431313);
                        if (encoreTextViewT30 != null) {
                            return new chf1(this, new bg1(encoreCardL7, encoreButtonT6, encoreTextViewT29, encoreTextViewT30));
                        }
                    } else {
                        i = 2131431312;
                    }
                } else {
                    i = 2131427868;
                }
                bhn0.i("Missing required view with ID: ".concat(encoreCardL7.getResources().getResourceName(i)));
                return null;
        }
    }

    @Override // p.bik1
    public final void b(w611 w611Var, aik1 aik1Var) {
        String string;
        String string2;
        int i;
        TextView textView;
        eg1 eg1Var;
        byte b = this.a;
        ngv ngvVar = ngv.f;
        ngv ngvVar2 = ngv.e;
        ngv ngvVar3 = ngv.g;
        switch (b) {
            case 0:
                dg1 dg1Var = (dg1) w611Var;
                fg1 fg1Var = (fg1) aik1Var;
                bg1 bg1Var = dg1Var.U0;
                EncoreButton encoreButton = bg1Var.b;
                ag1 ag1Var = fg1Var.a;
                if (ag1Var.b.length() > 0) {
                    bg1Var.d.setText(ag1Var.a);
                    bg1Var.c.setText(ag1Var.b);
                    encoreButton.setText(ag1Var.c);
                }
                encoreButton.setOnClickListener(new cg1(dg1Var.V0, fg1Var, (byte) 0));
                break;
            case 1:
                ey11 ey11Var = ey11.d;
                ey11 ey11Var2 = ey11.c;
                cid0 cid0Var = (cid0) w611Var;
                pid0 pid0Var = (pid0) aik1Var;
                int i2 = pid0Var.c;
                int i3 = pid0Var.b;
                Integer num = pid0Var.e;
                ooc1 ooc1Var = pid0Var.h;
                boolean z = pid0Var.j;
                long j = pid0Var.a;
                b5p1 b5p1Var = pid0Var.g;
                int i4 = pid0Var.d;
                roc1 roc1Var = pid0Var.i;
                String str = roc1Var.b;
                String str2 = roc1Var.c;
                String str3 = roc1Var.f;
                String str4 = roc1Var.e;
                int length = str.length();
                wj3 wj3Var = cid0Var.U0;
                EncoreTextView encoreTextView = (EncoreTextView) wj3Var.X;
                EncoreTextView encoreTextView2 = (EncoreTextView) wj3Var.f;
                EncoreTextView encoreTextView3 = (EncoreTextView) wj3Var.Z;
                EncoreTextView encoreTextView4 = (EncoreTextView) wj3Var.N0;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) wj3Var.e;
                EncoreTextView encoreTextView5 = (EncoreTextView) wj3Var.Y;
                EncoreTextView encoreTextView6 = (EncoreTextView) wj3Var.g;
                EncoreCard encoreCard = (EncoreCard) wj3Var.b;
                if (length <= 0) {
                    Context context = encoreCard.getContext();
                    int i5 = i2 == i4 ? 2131820733 : 2131820734;
                    if (ooc1Var.b.length() > 0) {
                        encoreTextView3.setText(ooc1Var.a);
                        encoreTextView5.setText(ooc1Var.b);
                    } else {
                        encoreTextView3.setText(context.getString(2131957456));
                        encoreTextView5.setText(context.getResources().getQuantityString(i5, i4, Integer.valueOf(i4)));
                    }
                    encoreTextView2.setText((i3 >= 60 || j <= 0) ? context.getString(2131956636, Integer.valueOf(i2)) : context.getString(2131957242));
                    encoreTextView4.setVisibility(4);
                    encoreTextView6.setVisibility(0);
                    ytw0 ytw0Var = jfv.b;
                    encoreTextView6.setText(context.getString(2131956635, Integer.valueOf((int) Math.floor((jfv.u(fdg1.k0(29, ngvVar), ngvVar2) + (((long) (i4 * 3600)) - j)) / jfv.u(fdg1.k0(1, ngvVar3), ngvVar2)))));
                    linearProgressIndicator.setMax(i4 * 60);
                    linearProgressIndicator.setProgress(i3 == 0 ? 1 : i3);
                    if (b5p1Var instanceof cy11) {
                        Resources resources = context.getResources();
                        int i6 = ((cy11) b5p1Var).c;
                        string = resources.getQuantityString(2131820655, i6, Integer.valueOf(i6));
                    } else if (b5p1Var instanceof dy11) {
                        Resources resources2 = context.getResources();
                        int i7 = ((dy11) b5p1Var).c;
                        string = resources2.getQuantityString(2131820700, i7, Integer.valueOf(i7));
                    } else if (b5p1Var.equals(ey11Var2)) {
                        string = context.getString(2131957244);
                    } else if (!b5p1Var.equals(ey11Var)) {
                        eg.o();
                    } else {
                        string = context.getString(2131963403);
                    }
                    string.getClass();
                    encoreTextView.setText(string);
                } else {
                    RelativeLayout relativeLayout = (RelativeLayout) wj3Var.c;
                    EncoreTextView encoreTextView7 = (EncoreTextView) wj3Var.t;
                    TextView textView2 = (EncoreTextView) wj3Var.i;
                    LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) wj3Var.d;
                    Context context2 = encoreCard.getContext();
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = pid0Var.f;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    int i8 = i2 == i4 ? 2131820733 : 2131820734;
                    if (str.length() > 0) {
                        encoreTextView3.setText(roc1Var.a);
                        encoreTextView5.setText(str);
                    } else {
                        encoreTextView3.setText(context2.getString(2131957456));
                        encoreTextView5.setText(context2.getResources().getQuantityString(i8, i4, Integer.valueOf(i4)));
                    }
                    encoreTextView2.setText((i3 >= 60 || j <= 0) ? context2.getString(2131956636, Integer.valueOf(i2 + iIntValue)) : context2.getString(2131957242));
                    encoreTextView4.setText(context2.getString(2131956638, Integer.valueOf(i4)));
                    linearProgressIndicator.setMax(i4 * 60);
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    linearProgressIndicator.setProgress(i3);
                    if (b5p1Var instanceof cy11) {
                        Resources resources3 = context2.getResources();
                        int i9 = z ? 2131820654 : 2131820655;
                        int i10 = ((cy11) b5p1Var).c;
                        string2 = resources3.getQuantityString(i9, i10, Integer.valueOf(i10));
                    } else if (b5p1Var instanceof dy11) {
                        Resources resources4 = context2.getResources();
                        int i11 = z ? 2131820699 : 2131820700;
                        int i12 = ((dy11) b5p1Var).c;
                        string2 = resources4.getQuantityString(i11, i12, Integer.valueOf(i12));
                    } else if (b5p1Var.equals(ey11Var2)) {
                        string2 = context2.getString(z ? 2131957243 : 2131957244);
                    } else if (!b5p1Var.equals(ey11Var)) {
                        eg.o();
                    } else {
                        string2 = context2.getString(2131963403);
                    }
                    string2.getClass();
                    qhl layoutParams = linearProgressIndicator.getLayoutParams();
                    float f = i4;
                    int i13 = i4 + iIntValue2;
                    float f2 = i13;
                    layoutParams.R = f / f2;
                    linearProgressIndicator.setLayoutParams(layoutParams);
                    qhl layoutParams2 = linearProgressIndicator2.getLayoutParams();
                    layoutParams2.R = iIntValue2 / f2;
                    linearProgressIndicator2.setLayoutParams(layoutParams2);
                    encoreTextView.setText(string2);
                    if (str4.length() > 0) {
                        i = 0;
                        encoreTextView7.setVisibility(0);
                        encoreTextView7.setText(str4);
                    } else {
                        i = 0;
                    }
                    encoreTextView4.setVisibility(4);
                    encoreTextView6.setVisibility(i);
                    int i14 = iIntValue * 60;
                    ytw0 ytw0Var2 = jfv.b;
                    encoreTextView6.setText(context2.getString(2131956635, Integer.valueOf((int) Math.floor((jfv.u(fdg1.k0(29, ngvVar), ngvVar2) + (((long) (i13 * 3600)) - (j + ((long) (iIntValue * 3600))))) / jfv.u(fdg1.k0(1, ngvVar3), ngvVar2)))));
                    if ((num != null ? new jfv(fdg1.k0(num.intValue(), ngvVar3)) : null) != null) {
                        linearProgressIndicator2.setVisibility(0);
                        linearProgressIndicator2.setMax(iIntValue2 * 60);
                        if (i14 == 0) {
                            i14 = 0;
                        }
                        linearProgressIndicator2.setProgress(i14);
                        ((View) wj3Var.P0).setVisibility(0);
                        if (str3.length() > 0) {
                            textView = textView2;
                            textView.setVisibility(0);
                            textView.setText(str3);
                        } else {
                            textView = textView2;
                        }
                        ((View) wj3Var.O0).getLayoutParams().j = textView.getId();
                        if (str2.length() > 0) {
                            relativeLayout.setVisibility(0);
                            ((EncoreTextView) wj3Var.h).setText(str2);
                            relativeLayout.setOnClickListener(new t230(cid0Var.V0, pid0Var, (byte) 12));
                        }
                    }
                }
                break;
            case 2:
                wo21 wo21Var = (wo21) w611Var;
                zo21 zo21Var = (zo21) aik1Var;
                k811 k811Var = wo21Var.U0;
                ((EncoreTextView) k811Var.c).setText(zo21Var.b);
                EncoreButton encoreButton2 = (EncoreButton) k811Var.d;
                encoreButton2.setText(zo21Var.a);
                encoreButton2.setOnClickListener(new kw6(wo21Var.V0, zo21Var, wo21Var, (byte) 18));
                break;
            case 3:
                hlc1 hlc1Var = (hlc1) w611Var;
                nlc1 nlc1Var = (nlc1) aik1Var;
                eg1 eg1Var2 = hlc1Var.V0;
                boolean z2 = nlc1Var.e;
                wj3 wj3Var2 = hlc1Var.U0;
                EncoreCard encoreCard2 = (EncoreCard) wj3Var2.b;
                EncoreTextView encoreTextView8 = (EncoreTextView) wj3Var2.Y;
                EncoreTextView encoreTextView9 = (EncoreTextView) wj3Var2.g;
                EncoreTextView encoreTextView10 = (EncoreTextView) wj3Var2.h;
                LinearProgressIndicator linearProgressIndicator3 = (LinearProgressIndicator) wj3Var2.d;
                EncoreTextView encoreTextView11 = (EncoreTextView) wj3Var2.Z;
                EncoreButton encoreButton3 = (EncoreButton) wj3Var2.c;
                Context context3 = encoreCard2.getContext();
                int i15 = nlc1Var.a;
                int i16 = nlc1Var.b;
                glc1 glc1Var = nlc1Var.f;
                String str5 = glc1Var.a;
                String str6 = glc1Var.h;
                String str7 = glc1Var.b;
                int length2 = str5.length();
                EncoreTextView encoreTextView12 = (EncoreTextView) wj3Var2.X;
                if (length2 > 0) {
                    encoreTextView12.setText(glc1Var.a);
                } else {
                    encoreTextView12.setVisibility(8);
                }
                int length3 = str7.length();
                EncoreTextView encoreTextView13 = (EncoreTextView) wj3Var2.t;
                if (length3 > 0) {
                    encoreTextView13.setText(str7);
                } else {
                    encoreTextView13.setVisibility(8);
                }
                ((EncoreTextView) wj3Var2.f).setText(context3.getString(2131956636, Integer.valueOf(i15)));
                encoreTextView11.setText(context3.getString(2131956638, Integer.valueOf(i16)));
                int i17 = i15 * 60;
                linearProgressIndicator3.setMax(i16 * 60);
                if (i17 == 0) {
                    i17 = 1;
                }
                linearProgressIndicator3.setProgress(i17);
                ((EncoreTextView) wj3Var2.i).setText(glc1Var.f);
                ((RelativeLayout) wj3Var2.e).setOnClickListener(new wa21(eg1Var2, nlc1Var, (byte) 18));
                if (str6.length() > 0) {
                    encoreTextView10.setVisibility(0);
                    encoreTextView10.setText(str6);
                }
                encoreTextView11.setVisibility(8);
                encoreTextView9.setVisibility(0);
                ytw0 ytw0Var3 = jfv.b;
                encoreTextView9.setText(context3.getString(2131956635, Integer.valueOf((int) Math.floor((jfv.u(fdg1.k0(29, ngvVar), ngvVar2) + (((long) (i16 * 3600)) - (((long) i15) * 3600))) / jfv.u(fdg1.k0(1, ngvVar3), ngvVar2)))));
                ((RelativeLayout) wj3Var2.N0).setVisibility(z2 ? 0 : 8);
                ((View) wj3Var2.P0).setVisibility(z2 ? 0 : 8);
                encoreTextView8.setVisibility(z2 ? 0 : 8);
                encoreTextView8.setText(glc1Var.e);
                encoreButton3.setText(glc1Var.c);
                encoreButton3.setVisibility(z2 ? 0 : 8);
                encoreButton3.setOnClickListener(new kw6(eg1Var2, nlc1Var, hlc1Var, (byte) 26));
                break;
            case 4:
                llc1 llc1Var = (llc1) w611Var;
                mlc1 mlc1Var = (mlc1) aik1Var;
                bg1 bg1Var2 = llc1Var.U0;
                EncoreTextView encoreTextView14 = bg1Var2.c;
                EncoreTextView encoreTextView15 = bg1Var2.d;
                klc1 klc1Var = mlc1Var.b;
                if (klc1Var.a.length() == 0) {
                    encoreTextView15.setVisibility(8);
                    encoreTextView14.getLayoutParams().i = 0;
                }
                EncoreButton encoreButton4 = bg1Var2.b;
                encoreTextView15.setText(klc1Var.a);
                encoreTextView14.setText(klc1Var.b);
                encoreButton4.setVisibility(mlc1Var.a ? 0 : 8);
                encoreButton4.setText(klc1Var.c);
                encoreButton4.setOnClickListener(new kw6(llc1Var.V0, mlc1Var, llc1Var, (byte) 27));
                break;
            case 5:
                ugf1 ugf1Var = (ugf1) w611Var;
                mhf1 mhf1Var = (mhf1) aik1Var;
                eg1 eg1Var3 = ugf1Var.V0;
                int i18 = mhf1Var.d;
                int i19 = mhf1Var.c;
                boolean z3 = mhf1Var.g;
                s24 s24Var = ugf1Var.U0;
                EncoreCard encoreCard3 = (EncoreCard) s24Var.b;
                EncoreButton encoreButton5 = (EncoreButton) s24Var.c;
                RelativeLayout relativeLayout2 = (RelativeLayout) s24Var.e;
                LinearProgressIndicator linearProgressIndicator4 = (LinearProgressIndicator) s24Var.d;
                EncoreTextView encoreTextView16 = (EncoreTextView) s24Var.g;
                EncoreTextView encoreTextView17 = (EncoreTextView) s24Var.i;
                EncoreTextView encoreTextView18 = (EncoreTextView) s24Var.t;
                EncoreTextView encoreTextView19 = (EncoreTextView) s24Var.X;
                Context context4 = encoreCard3.getContext();
                sgf1 sgf1Var = mhf1Var.h;
                String str8 = sgf1Var.b;
                String str9 = sgf1Var.f;
                String str10 = sgf1Var.e;
                if (str8.length() > 0) {
                    encoreTextView18.setText(sgf1Var.a);
                    encoreTextView17.setText(sgf1Var.b);
                    encoreTextView19.setText(str10);
                } else {
                    int i20 = mhf1Var.f ? 2131963314 : 2131963315;
                    encoreTextView18.setText(context4.getString(2131954274));
                    encoreTextView17.setText(context4.getString(i20));
                }
                encoreTextView16.setVisibility(0);
                ytw0 ytw0Var4 = jfv.b;
                encoreTextView16.setText(context4.getString(2131956635, Integer.valueOf((int) Math.floor((jfv.u(fdg1.k0(29, ngvVar), ngvVar2) + (((long) (i18 * 3600)) - ((long) (i19 * 3600)))) / jfv.u(fdg1.k0(1, ngvVar3), ngvVar2)))));
                ((EncoreTextView) s24Var.f).setText(context4.getString(2131956636, Integer.valueOf(i19)));
                int i21 = i19 * 60;
                linearProgressIndicator4.setMax(i18 * 60);
                if (i21 == 0) {
                    i21 = 1;
                }
                linearProgressIndicator4.setProgress(i21);
                int length4 = str9.length();
                EncoreTextView encoreTextView20 = (EncoreTextView) s24Var.h;
                if (length4 > 0) {
                    encoreTextView20.setText(str9);
                    eg1Var = eg1Var3;
                    relativeLayout2.setOnClickListener(new tgf1(eg1Var, mhf1Var, (byte) 0));
                } else {
                    eg1Var = eg1Var3;
                    encoreTextView20.setText(context4.getResources().getString(2131961590));
                    relativeLayout2.setOnClickListener(new gl61(eg1Var, (byte) 12));
                }
                if (str10.length() > 0) {
                    encoreTextView19.setText(str10);
                } else {
                    encoreTextView19.setText(mhf1Var.b);
                }
                ((RelativeLayout) s24Var.Y).setVisibility(z3 ? 0 : 8);
                ((View) s24Var.N0).setVisibility(z3 ? 0 : 8);
                encoreTextView19.setVisibility(z3 ? 0 : 8);
                encoreButton5.setVisibility(z3 ? 0 : 8);
                encoreButton5.setOnClickListener(new tgf1(eg1Var, mhf1Var, (byte) 1));
                break;
            default:
                chf1 chf1Var = (chf1) w611Var;
                dhf1 dhf1Var = (dhf1) aik1Var;
                bg1 bg1Var3 = chf1Var.U0;
                EncoreTextView encoreTextView21 = bg1Var3.c;
                EncoreButton encoreButton6 = bg1Var3.b;
                bhf1 bhf1Var = dhf1Var.d;
                if (bhf1Var.b.length() > 0) {
                    bg1Var3.d.setText(bhf1Var.a);
                    encoreTextView21.setText(bhf1Var.b);
                    encoreButton6.setText(bhf1Var.c);
                } else {
                    encoreTextView21.setText(dhf1Var.a + "\n\n" + dhf1Var.b);
                }
                encoreButton6.setVisibility(dhf1Var.c ? 0 : 8);
                encoreButton6.setOnClickListener(new wa21(chf1Var.V0, dhf1Var, (byte) 22));
                break;
        }
    }
}
