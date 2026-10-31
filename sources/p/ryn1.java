package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.allboarding.model.v1.proto.Item;
import com.spotify.allboarding.model.v1.proto.Tag;
import com.spotify.allboarding.model.v2.proto.Action;
import com.spotify.allboarding.model.v2.proto.Carousel;
import com.spotify.allboarding.model.v2.proto.CarouselCard;
import com.spotify.allboarding.model.v2.proto.ContentPicker;
import com.spotify.allboarding.model.v2.proto.ExperimentProperty;
import com.spotify.allboarding.model.v2.proto.OnboardingResponse;
import com.spotify.allboarding.model.v2.proto.Screen;
import com.spotify.allboarding.model.v2.proto.Section;
import com.spotify.allboarding.model.v2.proto.Step;
import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.personalizedepisodes.contentservice.v1.ContentServiceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ryn1 {
    public static final int[][] a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, CtaType.CTA_SHARE_FIELD_NUMBER, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, CtaType.BUY_TICKETS_FIELD_NUMBER, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, CtaType.SEE_ALL_SHOWS_FIELD_NUMBER, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, CtaType.CTA_SHARE_FIELD_NUMBER, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, CtaType.CTA_WAITLISTED_FIELD_NUMBER, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, CtaType.BUY_TICKETS_FIELD_NUMBER, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};
    public static b180 b;

    public static final GenerationServiceException A(sy21 sy21Var) {
        lzr0 lzr0Var;
        uz21 uz21Var = sy21Var.c;
        if (uz21Var != null) {
            try {
                ContentServiceError contentServiceErrorQ = ContentServiceError.q(uz21Var.c());
                String message = contentServiceErrorQ.getMessage();
                message.getClass();
                if (ihc1.y0(message)) {
                    message = null;
                }
                lzr0Var = new lzr0(message, contentServiceErrorQ.o());
            } catch (Exception unused) {
                lzr0Var = null;
            }
        } else {
            lzr0Var = null;
        }
        String str = lzr0Var != null ? lzr0Var.a : null;
        int i = sy21Var.a.d;
        int i2 = 1;
        if (lzr0Var != null) {
            switch (lzr0Var.b.ordinal()) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 8;
                    break;
            }
        }
        return new GenerationServiceException(str, i, i2);
    }

    public static final String B(byte[] bArr) {
        return new String(bArr, nne.a);
    }

    public static final void a(op41 op41Var, xmu0 xmu0Var, Function0 function0, int i, List list, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var;
        h2c h2cVar;
        boolean z;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-37843472);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(op41Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? x340Var.g(xmu0Var) : x340Var.i(xmu0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(list) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            op41 op41Var2 = op41.b;
            h2c h2cVar2 = h2c.a;
            if (op41Var2 == op41Var) {
                x340Var.i0(-509993710);
                olx olxVar = olx.c;
                jsl jslVar = new jsl(cwl1.o0(x340Var, 2131958028));
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).b.a;
                qim0 qim0VarA = h2cVar2.a(qim0Var2, een.g);
                String strO0 = cwl1.o0(x340Var, 2131958028);
                boolean z2 = ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && x340Var.i(xmu0Var)));
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new g1x0(xmu0Var, function0, (byte) 17);
                    x340Var.s0(objT);
                }
                qim0Var = qim0Var2;
                h2cVar = h2cVar2;
                z = false;
                w0h1.a(olxVar, jslVar, bin.x(qim0VarA, true, strO0, null, null, (Function0) objT, 12), j, 0L, false, x340Var, olx.d, 48);
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                h2cVar = h2cVar2;
                z = false;
                x340Var.i0(-509459208);
                x340Var.r(false);
            }
            if (op41.a == op41Var) {
                strK = x0d.k(x340Var, -509369711, 2131958030, x340Var, z);
            } else {
                x340Var.i0(-509293575);
                x340Var.r(z);
                strK = ((x2y0) list.get(i)).b;
            }
            String str = strK;
            uwr uwrVar2 = cbx.a;
            uwo1.e(str, h2cVar.a(qim0Var, een.h), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(op41Var, xmu0Var, function0, i, list, i2, (byte) 16);
        }
    }

    public static final void b(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1977090676);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new gob(iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, anm1.N("parental_hub_entity_row_cancel_button_trailing_action", nim0.a), null, gdxVarS, null, false, null, null, qai.b, x340Var, 0, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 2, i, iu30Var, false);
        }
    }

    public static final void c(ni00 ni00Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1680289304);
        int i2 = i | (x340Var.g(ni00Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            vy71 vy71VarF = dem0.f(0, 3, x340Var, (iu30) null, false);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zI = x340Var.i(c9nVar) | x340Var.i(vy71VarF) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ssm(c9nVar, vy71VarF, function0, (byte) 25);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            j2i j2iVarR = apo.r(1560229824, new utt(ni00Var, (byte) 24), x340Var);
            qim0Var2 = nim0.a;
            poo1.k(qim0Var2, function1, vy71VarF, 0L, null, 0, 0.0f, null, j2iVarR, x340Var, 100663302);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(ni00Var, function0, qim0Var2, i, (byte) 3);
        }
    }

    public static final void d(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-134222071);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarH);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, cbx.b(x340Var).b.c, 5);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = z6w.Q0;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(qim0Var3, false, (iu30) objT), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
            uwo1.e(str2, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 18);
        }
    }

    public static final void e(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1906054303);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("group-device-volume-slider", uyn1.z(16.0f, 0.0f, 2, nim0.a));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ak10(j2iVar, i, (byte) 5);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1458894928);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131959644);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new w8c(strO0, (byte) 8);
                x340Var.s0(objT);
            }
            xto1.e(anm1.N("cancel_request_loading", s161.b(qim0VarB, false, (iu30) objT)), 3, j, 0L, x340Var, 48, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 4, i, false);
        }
    }

    public static final void g(List list, p40 p40Var, hz5 hz5Var, op41 op41Var, int i, xmu0 xmu0Var, Function0 function0, iu30 iu30Var, Function0 function1, iu30 iu30Var2, qim0 qim0Var, int i2, b0k b0kVar, int i3) {
        int i4;
        iu30 iu30Var3;
        b0k b0kVar2;
        qim0 qim0Var2;
        int i5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1542323789);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i3 & 6) == 0) {
            i4 = (b0kVar3.g(list) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar3.i(p40Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar3.i(hz5Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.e(op41Var.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar3.e(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= (262144 & i3) == 0 ? b0kVar3.g(xmu0Var) : b0kVar3.i(xmu0Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= b0kVar3.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= b0kVar3.i(iu30Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= b0kVar3.i(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            iu30Var3 = iu30Var2;
            i4 |= b0kVar3.i(iu30Var3) ? 536870912 : 268435456;
        } else {
            iu30Var3 = iu30Var2;
        }
        if (b0kVar3.Y(i4 & 1, (306783379 & i4) != 306783378)) {
            int i6 = Build.VERSION.SDK_INT;
            ung ungVar = (ung) b0kVar3.k(t4k.f);
            String strO0 = cwl1.o0(b0kVar3, 2131958036);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new r2y0(function0);
                b0kVar3.s0(objT);
            }
            r2y0 r2y0Var = (r2y0) objT;
            ((cir0) b0kVar3.k(k2r0.a)).j(r2y0Var);
            boolean zI = b0kVar3.i(r2y0Var) | ((i4 & 7168) == 2048);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cqu0(r2y0Var, op41Var, (lnm) null, (byte) 22);
                b0kVar3.s0(objT2);
            }
            int i7 = (i4 >> 9) & 14;
            qxd0.t(op41Var, b0kVar3, (vu30) objT2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = u291.c(qim0Var3, 0.5f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarC, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            int i8 = i4;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            int i9 = i8 >> 12;
            a(op41Var, xmu0Var, function0, i, list, b0kVar3, ((i8 >> 3) & 7168) | i7 | (i9 & 112) | (i9 & 896) | ((i8 << 12) & 57344));
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            qim0 qim0VarO = ab80.o(qim0Var3, 16.0f, b0kVar3, qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarO);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            boolean z2 = op41Var == op41.a;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = g2y0.f;
                b0kVar3.s0(objT3);
            }
            bby bbyVarN = xay.n(1, (iu30) objT3);
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = g2y0.g;
                b0kVar3.s0(objT4);
            }
            fq7.g(z2, (qim0) null, bbyVarN, xay.r(1, (iu30) objT4), (String) null, apo.r(1585341919, new n2y0(list, p40Var, hz5Var, op41Var, iu30Var3, (byte) 0), b0kVar3), b0kVar3, 196608, 18);
            boolean z3 = op41Var == op41.b;
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = g2y0.h;
                b0kVar3.s0(objT5);
            }
            bby bbyVarN2 = xay.n(1, (iu30) objT5);
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar) {
                objT6 = g2y0.i;
                b0kVar3.s0(objT6);
            }
            b0kVar2 = b0kVar3;
            fq7.g(z3, (qim0) null, bbyVarN2, xay.r(1, (iu30) objT6), (String) null, apo.r(-1054100536, new p2y0(list, i, p40Var, hz5Var, op41Var, iu30Var, ungVar, strO0, i6, function1), b0kVar3), b0kVar2, 196608, 18);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
            i5 = i6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            i5 = i2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q2y0(list, p40Var, hz5Var, op41Var, i, xmu0Var, function0, iu30Var, function1, iu30Var2, qim0Var2, i5, i3);
        }
    }

    public static final void h(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(619089443);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
            long j = u7h.f;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarN = anm1.N("search_bar_root", dug.f(qim0VarJ, j, er31.b(4.0f)));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            esx esxVar = esx.c;
            jsl jslVar = new jsl(str2);
            zsc zscVar = zex.a;
            long j2 = ((vex) zscVar.e).g;
            cvx cvxVar = cbx.b(x340Var).b;
            w0h1.a(esxVar, jslVar, uyn1.x(nim0.a, 8.0f), j2, 0L, false, x340Var, esx.d, 48);
            long j3 = ((yex) zscVar.d).e;
            lee1 lee1Var = cbx.d(x340Var).h;
            cjc0 cjc0Var = new cjc0(2);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(wnb0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), lee1Var, j3, new a0e1(5), null, 0, false, cjc0Var, 0, null, x340Var, i2 & 14, 0, 1760);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 29);
        }
    }

    public static final void i(List list, p40 p40Var, hz5 hz5Var, op41 op41Var, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i, int i2) {
        iu30 iu30Var3;
        int i3;
        qim0 qim0Var2;
        iu30 iu30Var4;
        iu30 iu30Var5;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2051133627);
        int i4 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.i(p40Var) ? 32 : 16) | (x340Var.i(hz5Var) ? 256 : 128) | (x340Var.e(op41Var.ordinal()) ? 2048 : 1024) | 24576 | (x340Var.i(iu30Var) ? 131072 : 65536);
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 = i4 | 1572864;
            iu30Var3 = iu30Var2;
        } else {
            iu30Var3 = iu30Var2;
            i3 = i4 | (x340Var.i(iu30Var3) ? 1048576 : 524288);
        }
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            if (i5 != 0) {
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = g2y0.t;
                    x340Var.s0(objT);
                }
                iu30Var5 = (iu30) objT;
            } else {
                iu30Var5 = iu30Var3;
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(new bgc0(lhc.g(x340Var).g, 32), x340Var);
            boolean zI = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | x340Var.i(hz5Var) | ((458752 & i3) == 131072) | ((i3 & 3670016) == 1048576) | x340Var.i(p40Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                t3t0 t3t0Var = new t3t0(list, op41Var, hz5Var, iu30Var, iu30Var5, p40Var, (byte) 2);
                x340Var.s0(t3t0Var);
                objT2 = t3t0Var;
            }
            qim0 qim0Var3 = nim0.a;
            ujo1.d(qim0Var3, null, vk80VarX, false, d36Var, null, null, false, null, (iu30) objT2, x340Var, 6, 490);
            qim0Var2 = qim0Var3;
            iu30Var4 = iu30Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            iu30Var4 = iu30Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new crw0(list, p40Var, hz5Var, op41Var, qim0Var2, iu30Var, iu30Var4, i, i2);
        }
    }

    public static final AnimatorSet j(View view, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        float dimensionPixelOffset = view.getResources().getDimensionPixelOffset(2131167178);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(600L);
        PathInterpolator pathInterpolator = hlv.b;
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, dimensionPixelOffset, 0.0f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setStartDelay(j);
        return animatorSet;
    }

    public static AnimatorSet l(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        float dimensionPixelOffset = view.getResources().getDimensionPixelOffset(2131167178);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        PathInterpolator pathInterpolator = hlv.b;
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -dimensionPixelOffset);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setStartDelay(0L);
        return animatorSet;
    }

    public static final byte[] m(String str) {
        return str.getBytes(nne.a);
    }

    public static final o860 n(o860 o860Var, n9r n9rVar, p8a0 p8a0Var, int i, znb0 znb0Var) {
        return new o860((uw0) o860Var.b, p8a0Var != null ? new o0g1(o860Var, n9rVar, p8a0Var, i) : (b1h1) o860Var.c, znb0Var);
    }

    public static o860 o(o860 o860Var, leg legVar, mb11 mb11Var, int i) {
        if ((i & 2) != 0) {
            mb11Var = null;
        }
        return n(o860Var, legVar, mb11Var, 0, dm5.S(3, new na(o860Var, legVar, (byte) 4)));
    }

    public static final o860 p(o860 o860Var, fg5 fg5Var) {
        return fg5Var.isEmpty() ? o860Var : new o860((uw0) o860Var.b, (b1h1) o860Var.c, dm5.S(3, new na(o860Var, fg5Var, (byte) 5)));
    }

    public static zpi0 q(String str, Collection collection) {
        zbe zbeVar;
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(q7h.U(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((a8b0) it.next()).E());
        }
        zh91 zh91VarT = zpn1.t(arrayList);
        int i = zh91VarT.a;
        if (i != 0) {
            zbeVar = i != 1 ? new zbe(str, (zpi0[]) zh91VarT.toArray(new zpi0[0])) : (zpi0) zh91VarT.get(0);
        } else {
            zbeVar = ypi0.b;
        }
        return zh91VarT.a <= 1 ? zbeVar : new iub0(zbeVar);
    }

    public static String r(String str) {
        String strY0 = ihc1.Y0(ihc1.Y0(str, '?'), '#');
        int iW0 = ihc1.w0(strY0, "://", 0, false, 6);
        if (iW0 >= 0) {
            int i = iW0 + 3;
            String strY1 = ihc1.Y0(strY0.substring(i), '/');
            return strY0.substring(0, i).concat(ihc1.V0(strY1, '@', strY1));
        }
        List listP0 = ihc1.P0(strY0, new char[]{':'}, 6);
        List list = listP0;
        ArrayList arrayList = new ArrayList(o7h.d1(list, 2));
        if (listP0.size() > 2 && mwn0.k.contains(listP0.get(1))) {
            for (String str2 : o7h.k0(list, 2)) {
                if (arrayList.size() == 4 || !mwn0.l.e(str2)) {
                    break;
                }
                arrayList.add(str2);
            }
        }
        return o7h.y0(arrayList, ":", (String) null, (String) null, (iu30) null, 62);
    }

    public static final void s(Animator animator) {
        animator.removeAllListeners();
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animator.cancel();
        if (animator instanceof AnimatorSet) {
            for (Animator animator2 : ((AnimatorSet) animator).getChildAnimations()) {
                animator2.getClass();
                s(animator2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01cb  */
    public static final zo41 t(Screen screen, String str, wub1 wub1Var, wub1 wub1Var2, h290 h290Var) {
        p791 p791Var;
        SearchConfiguration searchConfiguration;
        boolean z;
        int iT = screen.t();
        int i = iT == 0 ? -1 : bqg0.a[l1d.C(iT)];
        List list = z6x.a;
        if (i == 1) {
            return new xo41(screen.r().getTitle(), list);
        }
        if (i != 2) {
            if (i == 3) {
                screen.s();
                return wo41.a;
            }
            if (i == 4) {
                return new so41(screen.p().getPlaylistUri(), list);
            }
            if (i != 6) {
                return yo41.a;
            }
            Carousel carouselN = screen.n();
            h290<CarouselCard> h290VarO = carouselN.o();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
            for (CarouselCard carouselCard : h290VarO) {
                arrayList.add(new oo41(carouselCard.getTitle(), carouselCard.getSubtitle(), carouselCard.getImageUrl(), carouselCard.n(), carouselCard.q(), carouselCard.p(), carouselCard.o()));
            }
            return new po41(carouselN.n(), arrayList, str);
        }
        ContentPicker contentPickerO = screen.o();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = contentPickerO.t().iterator();
        int i2 = 0;
        while (true) {
            hxs0 m20Var = null;
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    p791Var = p791.b;
                    break;
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        p791Var = p791.b;
                        break;
                    }
                    gxs0 gxs0Var = (jxs0) it2.next();
                    gxs0 gxs0Var2 = gxs0Var instanceof gxs0 ? gxs0Var : null;
                    if ((gxs0Var2 != null ? gxs0Var2.c : null) instanceof w4a) {
                        p791Var = p791.a;
                        break;
                    }
                }
                p791 p791Var2 = p791Var;
                String value = contentPickerO.u().getValue();
                h290<Section> h290VarT = contentPickerO.t();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarT, 10));
                for (Section section : h290VarT) {
                    arrayList3.add(new qo41(section.n(), section.o().getValue()));
                }
                com.spotify.allboarding.model.v2.proto.SearchConfiguration searchConfigurationR = contentPickerO.r();
                if (searchConfigurationR == null) {
                    searchConfiguration = null;
                } else {
                    if (ihc1.y0(searchConfigurationR.q())) {
                        searchConfigurationR = null;
                    }
                    if (searchConfigurationR != null) {
                        searchConfiguration = new SearchConfiguration(searchConfigurationR.q(), searchConfigurationR.p(), searchConfigurationR.o());
                    } else {
                        searchConfiguration = null;
                    }
                }
                h290 h290VarO2 = contentPickerO.o();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarO2, 10));
                int i3 = 0;
                for (Object obj : h290VarO2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    Tag tag = (Tag) obj;
                    arrayList4.add(new txs0(tag.getTitle(), tag.getUri(), i3 == 0));
                    i3 = i4;
                }
                String value2 = contentPickerO.q().getValue();
                if (value2 == null) {
                    value2 = "";
                }
                m20 m20Var2 = wub1Var != null ? new m20(value2) : null;
                String value3 = contentPickerO.s().getValue();
                m20Var = wub1Var2 != null ? new m20(value3 != null ? value3 : "") : null;
                int iP = contentPickerO.p();
                if (h290Var.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = h290Var.iterator();
                    while (it3.hasNext()) {
                        if (u890.j(((ExperimentProperty) it3.next()).getKey(), "content_picker_footer_label")) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return new ro41(str, value, arrayList2, arrayList3, searchConfiguration, m20Var2, m20Var, iP, arrayList4, z, p791Var2, 2560);
            }
            Object next = it.next();
            int i5 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            Section section2 = (Section) next;
            String value4 = section2.o().getValue();
            if (value4 != null) {
                if (ihc1.y0(value4)) {
                    value4 = null;
                }
                if (value4 != null) {
                    m20Var = new hxs0(value4);
                }
            }
            if (m20Var != null) {
                arrayList2.add(m20Var);
            }
            List<Item> itemsList = section2.getItemsList();
            ArrayList arrayList5 = new ArrayList(q7h.U(itemsList, 10));
            for (Item item : itemsList) {
                item.getClass();
                yod1 yod1VarB = cpn1.B(item);
                ArrayList arrayList6 = arrayList5;
                arrayList6.add(new gxs0(section2.n(), i2, yod1VarB, yod1VarB instanceof hv51 ? ((hv51) yod1VarB).f() : false, yod1VarB instanceof yod1 ? yod1VarB.getTags() : list, 80));
                arrayList5 = arrayList6;
            }
            arrayList2.addAll(arrayList5);
            arrayList2.add(ixs0.a);
            i2 = i5;
        }
    }

    public static ObjectAnimator u(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(900L);
        objectAnimatorOfFloat.setInterpolator(hlv.b);
        objectAnimatorOfFloat.setStartDelay(0L);
        return objectAnimatorOfFloat;
    }

    public static void v(EditText editText) {
        editText.getClass();
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static final wub1 w(OnboardingResponse onboardingResponse, EntryPoint entryPoint) {
        wub1 wub1VarX = onboardingResponse.s() ? x(onboardingResponse.o(), entryPoint, onboardingResponse.n()) : null;
        wub1 wub1VarX2 = onboardingResponse.t() ? x(onboardingResponse.p(), entryPoint, onboardingResponse.n()) : null;
        return new wub1(onboardingResponse.r(), xz.a, t(onboardingResponse.q(), onboardingResponse.r(), wub1VarX, wub1VarX2, onboardingResponse.n()), wub1VarX, wub1VarX2);
    }

    public static final wub1 x(Step step, EntryPoint entryPoint, h290 h290Var) {
        h10 y00Var;
        h10 h10Var;
        wub1 wub1VarX = step.r() ? x(step.p(), entryPoint, h290Var) : null;
        Action actionN = step.n();
        int i = bqg0.b[actionN.p().ordinal()];
        if (i != 1) {
            if (i != 2) {
                h10Var = i != 3 ? xz.a : ez.a;
            } else {
                String value = actionN.o().getValue();
                y00Var = new r00(value != null ? value : "");
            }
            return new wub1("", h10Var, t(step.q(), "", wub1VarX, null, h290Var), wub1VarX, null);
        }
        String value2 = actionN.o().getValue();
        y00Var = new y00(value2 != null ? value2 : "");
        h10Var = y00Var;
        return new wub1("", h10Var, t(step.q(), "", wub1VarX, null, h290Var), wub1VarX, null);
    }

    public static final yeb1 y(yeb1 yeb1Var, Map map) {
        List<qpc1> list = yeb1Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (qpc1 qpc1Var : list) {
            String str = qpc1Var.b;
            d13 d13Var = (d13) map.get(str);
            if (d13Var == null || ihc1.y0(str)) {
                d13Var = null;
            }
            arrayList.add(new qpc1(qpc1Var.a, str, d13Var));
        }
        return new yeb1(arrayList, yeb1Var.b);
    }

    public static void z(EditText editText) {
        editText.getClass();
        editText.requestFocus();
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
    }
}
