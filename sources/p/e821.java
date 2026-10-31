package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import com.spotify.base.java.logging.Logger;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e821 implements ipc1, Function {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public e821(zwg1 zwg1Var, HashMap map, HashMap map2, HashMap map3) {
        this.b = zwg1Var;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zwg1Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.a = jArr;
    }

    public static void e(Animator... animatorArr) {
        int length = animatorArr.length;
        Animator[] animatorArr2 = new Animator[length];
        for (int i = 0; i < animatorArr.length; i++) {
            animatorArr2[i] = animatorArr[i].clone();
        }
        if (length == 1) {
            animatorArr2[0].start();
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorArr2);
        animatorSet.start();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0261 A[PHI: r0
      0x0261: PHI (r0v11 java.lang.String) = (r0v4 java.lang.String), (r0v20 java.lang.String) binds: [B:119:0x0290, B:110:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0263 A[PHI: r0
      0x0263: PHI (r0v9 java.lang.String) = (r0v4 java.lang.String), (r0v20 java.lang.String) binds: [B:119:0x0290, B:110:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0295  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bd A[PHI: r0
      0x01bd: PHI (r0v37 java.lang.String) = (r0v25 java.lang.String), (r0v44 java.lang.String) binds: [B:100:0x0216, B:91:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01bf A[PHI: r0
      0x01bf: PHI (r0v34 java.lang.String) = (r0v25 java.lang.String), (r0v44 java.lang.String) binds: [B:100:0x0216, B:91:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public static ArrayList f(e821 e821Var, YourLibraryResponse yourLibraryResponse, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        gtm1 gtm1VarS;
        int i2;
        int i3;
        String strA;
        Uri uri;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        String str;
        String strO;
        boolean z8;
        ?? r12;
        SimpleDateFormat simpleDateFormat;
        Date date;
        u310 u310Var;
        e821 e821Var2 = e821Var;
        Integer num = (i & 64) != 0 ? null : 2131954023;
        int i5 = 1;
        boolean z9 = (i & 128) != 0 ? true : z4;
        Context context = (Context) e821Var2.b;
        zwm1 zwm1Var = (zwm1) e821Var2.d;
        Resources resources = zwm1Var.b;
        h290 h290VarN = yourLibraryResponse.n();
        ArrayList<YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity> arrayList = new ArrayList();
        for (Object obj : h290VarN) {
            if (((Set) e821Var2.e).contains(((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj).s())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity : arrayList) {
            String uri2 = yourLibraryDecoratedEntity.e().getUri();
            Uri uri3 = Uri.EMPTY;
            String name = yourLibraryDecoratedEntity.e().getName();
            aai0 aai0Var = (aai0) e821Var2.c;
            Uri uriC = Uri.parse(yourLibraryDecoratedEntity.e().q());
            if (uriC == null) {
                gtm1VarS = yourLibraryDecoratedEntity.s();
                if (gtm1VarS == null) {
                    i2 = -1;
                } else {
                    i2 = txm1.a[gtm1VarS.ordinal()];
                }
                if (i2 != i5) {
                    uriC = aai0Var.c(2131230928);
                } else if (i2 != 2) {
                    uriC = aai0Var.c(2131230960);
                } else if (i2 != 3) {
                    uriC = aai0Var.c(2131233766);
                } else if (i2 != 4) {
                    uriC = aai0Var.c(2131233768);
                } else if (i2 != 7) {
                    uriC = uri3;
                } else {
                    uriC = aai0Var.c(2131230965);
                }
            } else {
                if (uriC.equals(uri3)) {
                    uriC = null;
                }
                if (uriC == null) {
                    gtm1VarS = yourLibraryDecoratedEntity.s();
                    if (gtm1VarS == null) {
                        i2 = -1;
                    } else {
                        i2 = txm1.a[gtm1VarS.ordinal()];
                    }
                    if (i2 != i5) {
                        uriC = aai0Var.c(2131230928);
                    } else if (i2 != 2) {
                        uriC = aai0Var.c(2131230960);
                    } else if (i2 != 3) {
                        uriC = aai0Var.c(2131233766);
                    } else if (i2 != 4) {
                        uriC = aai0Var.c(2131233768);
                    } else if (i2 != 7) {
                        uriC = uri3;
                    } else {
                        uriC = aai0Var.c(2131230965);
                    }
                }
            }
            boolean zU = yourLibraryDecoratedEntity.e().u();
            String strD = k4s0.d(4);
            gtm1 gtm1VarS2 = yourLibraryDecoratedEntity.s();
            switch (gtm1VarS2 == null ? -1 : txm1.a[gtm1VarS2.ordinal()]) {
                case 1:
                case 2:
                    if (z2 && (z || z3)) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    break;
                case 3:
                    String uri4 = yourLibraryDecoratedEntity.e().getUri();
                    n3q0 n3q0Var = (n3q0) e821Var2.a;
                    uri4.getClass();
                    Boolean boolA = n3q0Var.a(uri4);
                    boolean z10 = p5y.a(uri4) != null;
                    if (!z2 || (!(z3 || z || (boolA != null && boolA.booleanValue())) || z10)) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    i3 = 2;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            gtm1 gtm1VarS3 = yourLibraryDecoratedEntity.s();
            int i6 = gtm1VarS3 != null ? txm1.a[gtm1VarS3.ordinal()] : -1;
            atm1 atm1Var = atm1.d;
            switch (i6) {
                case 1:
                    strA = zwm1Var.a(yourLibraryDecoratedEntity.n().n(), z9);
                    if (yourLibraryDecoratedEntity.e().s() == atm1Var) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z5 = z6;
                    uri = uriC;
                    i4 = 3;
                    if (num == null) {
                        if (yourLibraryDecoratedEntity.s() == gtm1.d) {
                            strO = yourLibraryDecoratedEntity.e().o();
                            if (strO != null) {
                                r12 = 0;
                                z8 = true;
                                if (nhc1.Y(strO, "S:", false)) {
                                    strO = ihc1.l0(2, strO);
                                }
                            } else {
                                z8 = true;
                                r12 = 0;
                            }
                            if (strO != null && nhc1.Y(strO, "D:", (boolean) r12) == z8) {
                                Locale localeB = yoi1.A(context.getResources().getConfiguration()).b((int) r12);
                                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd", localeB);
                                simpleDateFormat = new SimpleDateFormat("MMMM yyyy", localeB);
                                date = simpleDateFormat2.parse(strO, new ParsePosition(2));
                                if (date != null) {
                                    strO = simpleDateFormat.format(date);
                                } else {
                                    strO = null;
                                }
                            }
                        } else {
                            str = null;
                        }
                        u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    } else {
                        strO = context.getString(num.intValue());
                    }
                    str = strO;
                    u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    break;
                case 2:
                    strA = z9 ? resources.getString(2131956835) : null;
                    uri = uriC;
                    z5 = false;
                    i4 = 1;
                    if (num == null) {
                        if (yourLibraryDecoratedEntity.s() == gtm1.d) {
                            strO = yourLibraryDecoratedEntity.e().o();
                            if (strO != null) {
                                r12 = 0;
                                z8 = true;
                                if (nhc1.Y(strO, "S:", false)) {
                                    strO = ihc1.l0(2, strO);
                                }
                            } else {
                                z8 = true;
                                r12 = 0;
                            }
                            if (strO != null) {
                                Locale localeB2 = yoi1.A(context.getResources().getConfiguration()).b((int) r12);
                                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyyMMdd", localeB2);
                                simpleDateFormat = new SimpleDateFormat("MMMM yyyy", localeB2);
                                date = simpleDateFormat3.parse(strO, new ParsePosition(2));
                                if (date != null) {
                                    strO = simpleDateFormat.format(date);
                                } else {
                                    strO = null;
                                }
                            }
                        } else {
                            str = null;
                        }
                        u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    } else {
                        strO = context.getString(num.intValue());
                    }
                    str = strO;
                    u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    break;
                case 3:
                    String uri5 = yourLibraryDecoratedEntity.e().getUri();
                    uri5.getClass();
                    strA = xrm1.a(uri5) ? resources.getString(2131956875) : uri5.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD") ? resources.getString(2131956876) : zwm1Var.e(yourLibraryDecoratedEntity.w().o(), z9, yourLibraryDecoratedEntity.w().v(), false);
                    if (yourLibraryDecoratedEntity.e().s() == atm1Var) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z5 = z6;
                    uri = uriC;
                    i4 = 3;
                    if (num == null) {
                        if (yourLibraryDecoratedEntity.s() == gtm1.d) {
                            strO = yourLibraryDecoratedEntity.e().o();
                            if (strO != null) {
                                r12 = 0;
                                z8 = true;
                                if (nhc1.Y(strO, "S:", false)) {
                                    strO = ihc1.l0(2, strO);
                                }
                            } else {
                                z8 = true;
                                r12 = 0;
                            }
                            if (strO != null) {
                                Locale localeB3 = yoi1.A(context.getResources().getConfiguration()).b((int) r12);
                                SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyyMMdd", localeB3);
                                simpleDateFormat = new SimpleDateFormat("MMMM yyyy", localeB3);
                                date = simpleDateFormat4.parse(strO, new ParsePosition(2));
                                if (date != null) {
                                    strO = simpleDateFormat.format(date);
                                } else {
                                    strO = null;
                                }
                            }
                        } else {
                            str = null;
                        }
                        u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    } else {
                        strO = context.getString(num.intValue());
                    }
                    str = strO;
                    u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    break;
                case 4:
                    strA = zwm1Var.g(yourLibraryDecoratedEntity.y().n(), Long.valueOf(yourLibraryDecoratedEntity.y().getPublishDate()), z9);
                    if (yourLibraryDecoratedEntity.e().s() == atm1Var) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z5 = z7;
                    uri = uriC;
                    i4 = 2;
                    if (num == null) {
                        if (yourLibraryDecoratedEntity.s() == gtm1.d) {
                            strO = yourLibraryDecoratedEntity.e().o();
                            if (strO != null) {
                                r12 = 0;
                                z8 = true;
                                if (nhc1.Y(strO, "S:", false)) {
                                    strO = ihc1.l0(2, strO);
                                }
                            } else {
                                z8 = true;
                                r12 = 0;
                            }
                            if (strO != null) {
                                Locale localeB4 = yoi1.A(context.getResources().getConfiguration()).b((int) r12);
                                SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("yyyyMMdd", localeB4);
                                simpleDateFormat = new SimpleDateFormat("MMMM yyyy", localeB4);
                                date = simpleDateFormat5.parse(strO, new ParsePosition(2));
                                if (date != null) {
                                    strO = simpleDateFormat.format(date);
                                } else {
                                    strO = null;
                                }
                            }
                        } else {
                            str = null;
                        }
                        u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    } else {
                        strO = context.getString(num.intValue());
                    }
                    str = strO;
                    u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    break;
                case 5:
                    YourLibraryDecoratedEntityOuterClass.YourLibraryFolderExtraInfo yourLibraryFolderExtraInfoU = yourLibraryDecoratedEntity.u();
                    strA = zwm1Var.b(yourLibraryFolderExtraInfoU.p(), yourLibraryFolderExtraInfoU.o());
                    uriC = kno1.q(context, 2131233207);
                    uri = uriC;
                    z5 = false;
                    i4 = 3;
                    if (num == null) {
                        if (yourLibraryDecoratedEntity.s() == gtm1.d) {
                            strO = yourLibraryDecoratedEntity.e().o();
                            if (strO != null) {
                                r12 = 0;
                                z8 = true;
                                if (nhc1.Y(strO, "S:", false)) {
                                    strO = ihc1.l0(2, strO);
                                }
                            } else {
                                z8 = true;
                                r12 = 0;
                            }
                            if (strO != null) {
                                Locale localeB5 = yoi1.A(context.getResources().getConfiguration()).b((int) r12);
                                SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("yyyyMMdd", localeB5);
                                simpleDateFormat = new SimpleDateFormat("MMMM yyyy", localeB5);
                                date = simpleDateFormat6.parse(strO, new ParsePosition(2));
                                if (date != null) {
                                    strO = simpleDateFormat.format(date);
                                } else {
                                    strO = null;
                                }
                            }
                        } else {
                            str = null;
                        }
                        u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    } else {
                        strO = context.getString(num.intValue());
                    }
                    str = strO;
                    u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    break;
                case 6:
                    strA = zwm1Var.a.j(yourLibraryDecoratedEntity.v().getPublishDate());
                    uri = uriC;
                    z5 = false;
                    i4 = 3;
                    if (num == null) {
                        if (yourLibraryDecoratedEntity.s() == gtm1.d) {
                            strO = yourLibraryDecoratedEntity.e().o();
                            if (strO != null) {
                                r12 = 0;
                                z8 = true;
                                if (nhc1.Y(strO, "S:", false)) {
                                    strO = ihc1.l0(2, strO);
                                }
                            } else {
                                z8 = true;
                                r12 = 0;
                            }
                            if (strO != null) {
                                Locale localeB6 = yoi1.A(context.getResources().getConfiguration()).b((int) r12);
                                SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat("yyyyMMdd", localeB6);
                                simpleDateFormat = new SimpleDateFormat("MMMM yyyy", localeB6);
                                date = simpleDateFormat7.parse(strO, new ParsePosition(2));
                                if (date != null) {
                                    strO = simpleDateFormat.format(date);
                                } else {
                                    strO = null;
                                }
                            }
                        } else {
                            str = null;
                        }
                        u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    } else {
                        strO = context.getString(num.intValue());
                    }
                    str = strO;
                    u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    break;
                case 7:
                    if (yourLibraryDecoratedEntity.p().n() == ctm1.c) {
                        String strO2 = yourLibraryDecoratedEntity.p().o();
                        strA = (strO2 == null || strO2.length() == 0) ? context.getResources().getString(2131957663) : context.getResources().getString(2131957662, yourLibraryDecoratedEntity.p().o());
                    } else {
                        strA = yourLibraryDecoratedEntity.p().o();
                        if (z9) {
                            strA = (strA == null || strA.length() == 0) ? resources.getString(2131956840) : resources.getString(2131956839, strA);
                        }
                    }
                    if (yourLibraryDecoratedEntity.e().s() == atm1Var) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z5 = z7;
                    uri = uriC;
                    i4 = 2;
                    if (num == null) {
                        if (yourLibraryDecoratedEntity.s() == gtm1.d) {
                            strO = yourLibraryDecoratedEntity.e().o();
                            if (strO != null) {
                                r12 = 0;
                                z8 = true;
                                if (nhc1.Y(strO, "S:", false)) {
                                    strO = ihc1.l0(2, strO);
                                }
                            } else {
                                z8 = true;
                                r12 = 0;
                            }
                            if (strO != null) {
                                Locale localeB7 = yoi1.A(context.getResources().getConfiguration()).b((int) r12);
                                SimpleDateFormat simpleDateFormat8 = new SimpleDateFormat("yyyyMMdd", localeB7);
                                simpleDateFormat = new SimpleDateFormat("MMMM yyyy", localeB7);
                                date = simpleDateFormat8.parse(strO, new ParsePosition(2));
                                if (date != null) {
                                    strO = simpleDateFormat.format(date);
                                } else {
                                    strO = null;
                                }
                            }
                        } else {
                            str = null;
                        }
                        u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    } else {
                        strO = context.getString(num.intValue());
                    }
                    str = strO;
                    u310Var = new u310(uri2, (String) null, name, strA, uri, (Uri) null, uri3, uri3, uri3, (Uri) null, (Uri) null, i3, z5, false, false, false, i4, 4, (Double) null, (Integer) null, (Integer) null, zU, strD, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
                    break;
                default:
                    u310Var = null;
                    break;
            }
            if (u310Var != null) {
                arrayList2.add(u310Var);
            }
            e821Var2 = e821Var;
            i5 = 1;
        }
        return arrayList2;
    }

    public static String i(Object obj, mma0 mma0Var) {
        String str;
        if (obj != null) {
            str = rc11.a.b(obj.getClass()).o() + '.';
        } else {
            str = "";
        }
        return str + mma0Var.getName();
    }

    public static e821 n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626221, viewGroup, false);
        int i = 2131429075;
        View viewT = m5n1.t(constraintLayoutInflate, 2131429075);
        if (viewT != null) {
            i = 2131429085;
            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131429085);
            if (frameLayout != null) {
                i = 2131429143;
                View viewT2 = m5n1.t(constraintLayoutInflate, 2131429143);
                if (viewT2 != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    i = 2131431178;
                    RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131431178);
                    if (recyclerViewT != null) {
                        return new e821(constraintLayout, viewT, (View) frameLayout, viewT2, (ViewGroup) constraintLayout, (View) recyclerViewT);
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static void o(rhk1 rhk1Var) {
        yv71 sharedValues = ConstraintLayout.getSharedValues();
        int i = rhk1Var.u;
        nfb nfbVar = new nfb((byte) 29, false);
        HashMap map = sharedValues.a;
        HashSet hashSet = (HashSet) map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(nfbVar));
    }

    public nbn1 A() {
        if (((nbn1) this.d) == null) {
            nbn1 nbn1Var = new nbn1((emo1) this.b, (String) this.c);
            this.d = nbn1Var;
            nbn1Var.b(1);
        }
        return (nbn1) this.d;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void B() {
        int i;
        long jLongValue;
        int i2;
        nbn1 nbn1Var = (nbn1) this.d;
        if (nbn1Var != null) {
            b4e b4eVar = nbn1Var.j;
            if (b4eVar != null) {
                b4eVar.l = null;
                nbn1Var.j = null;
            }
            long j = nbn1Var.i;
            q4p1 q4p1VarN = t4p1.n();
            q4p1VarN.a();
            ((t4p1) q4p1VarN.b).p(j);
            String str = nbn1Var.l;
            if (str != null) {
                q4p1VarN.a();
                ((t4p1) q4p1VarN.b).u(str);
            }
            cdp1 cdp1VarM = edp1.m();
            if (!TextUtils.isEmpty(nbn1Var.n)) {
                String str2 = nbn1Var.n;
                q4p1VarN.a();
                ((t4p1) q4p1VarN.b).q(str2);
                String str3 = nbn1Var.n;
                cdp1VarM.a();
                ((edp1) cdp1VarM.b).n(str3);
            }
            if (!TextUtils.isEmpty(nbn1Var.o)) {
                String str4 = nbn1Var.o;
                cdp1VarM.a();
                ((edp1) cdp1VarM.b).o(str4);
            }
            if (!TextUtils.isEmpty(nbn1Var.f24p)) {
                String str5 = nbn1Var.f24p;
                cdp1VarM.a();
                ((edp1) cdp1VarM.b).p(str5);
            }
            if (!TextUtils.isEmpty(nbn1Var.q)) {
                String str6 = nbn1Var.q;
                cdp1VarM.a();
                ((edp1) cdp1VarM.b).q(str6);
            }
            if (!TextUtils.isEmpty(nbn1Var.r)) {
                String str7 = nbn1Var.r;
                cdp1VarM.a();
                ((edp1) cdp1VarM.b).r(str7);
            }
            if (!TextUtils.isEmpty(nbn1Var.s)) {
                String str8 = nbn1Var.s;
                cdp1VarM.a();
                ((edp1) cdp1VarM.b).s(str8);
            }
            int i3 = nbn1Var.t;
            int i4 = 1;
            if (i3 == 1) {
                i = 2;
            } else if (i3 == 2) {
                i = 3;
            } else if (i3 == 3) {
                i = 4;
            } else if (i3 != 4) {
                i = i3 != 5 ? 1 : 6;
            } else {
                i = 5;
            }
            cdp1VarM.a();
            ((edp1) cdp1VarM.b).t(i);
            edp1 edp1Var = (edp1) cdp1VarM.b();
            q4p1VarN.a();
            ((t4p1) q4p1VarN.b).A(edp1Var);
            h3p1 h3p1VarM = k3p1.m();
            h3p1VarM.e(nbn1.w);
            h3p1VarM.d(nbn1Var.g);
            k3p1 k3p1Var = (k3p1) h3p1VarM.b();
            q4p1VarN.a();
            ((t4p1) q4p1VarN.b).y(k3p1Var);
            pin1 pin1Var = nbn1Var.a;
            j5p1 j5p1VarM = m5p1.m();
            String str9 = (String) pin1Var.zza();
            if (str9 != null) {
                y6p1 y6p1VarM = b7p1.m();
                y6p1VarM.a();
                ((b7p1) y6p1VarM.b).n(str9);
                b7p1 b7p1Var = (b7p1) y6p1VarM.b();
                j5p1VarM.a();
                ((m5p1) j5p1VarM.b).n(b7p1Var);
            }
            String str10 = nbn1Var.k;
            int i5 = 16;
            if (str10 != null) {
                try {
                    String strReplace = str10.replace("-", "");
                    jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
                } catch (NumberFormatException unused) {
                    nbn1.v.c("receiverSessionId %s is not valid for hash", new Object[]{str10});
                    jLongValue = 0;
                }
                j5p1VarM.a();
                ((m5p1) j5p1VarM.b).o(jLongValue);
            }
            List list = nbn1Var.b;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dwn1 dwn1Var = (dwn1) it.next();
                    dwn1Var.getClass();
                    e5p1 e5p1VarM = g5p1.m();
                    byte b = dwn1Var.e;
                    e5p1VarM.a();
                    ((g5p1) e5p1VarM.b).r(b);
                    Iterator it2 = it;
                    int i6 = (int) (dwn1Var.b - dwn1Var.d);
                    e5p1VarM.a();
                    ((g5p1) e5p1VarM.b).q(i6);
                    e5p1VarM.a();
                    ((g5p1) e5p1VarM.b).n(i6);
                    Integer num = dwn1Var.a;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        e5p1VarM.a();
                        ((g5p1) e5p1VarM.b).o(iIntValue);
                    }
                    Boolean bool = dwn1Var.c;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        e5p1VarM.a();
                        ((g5p1) e5p1VarM.b).p(zBooleanValue);
                    }
                    arrayList.add((g5p1) e5p1VarM.b());
                    it = it2;
                }
                j5p1VarM.a();
                ((m5p1) j5p1VarM.b).p(arrayList);
            }
            List list2 = nbn1Var.c;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
                if (it3.hasNext()) {
                    throw pze0.g(it3);
                }
                j5p1VarM.a();
                ((m5p1) j5p1VarM.b).r(arrayList2);
            }
            List<zvn1> list3 = nbn1Var.d;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (zvn1 zvn1Var : list3) {
                    String str11 = zvn1Var.a;
                    w4p1 w4p1VarM = y4p1.m();
                    switch (str11.hashCode()) {
                        case -1189611734:
                            if (str11.equals("queueInsert")) {
                                i4 = 13;
                            }
                            break;
                        case -1109843021:
                            if (str11.equals("launch")) {
                                i4 = 22;
                            }
                            break;
                        case -940430091:
                            if (str11.equals("queueRemove")) {
                                i4 = 15;
                            }
                            break;
                        case -936597225:
                            if (str11.equals("queueFetchItems")) {
                                i4 = 19;
                            }
                            break;
                        case -930425472:
                            if (str11.equals("setPlaybackDevices")) {
                                i4 = 23;
                            }
                            break;
                        case -921113364:
                            if (str11.equals("volume-mute")) {
                                i4 = 9;
                            }
                            break;
                        case -900560382:
                            if (str11.equals("skipAd")) {
                                i4 = 21;
                            }
                            break;
                        case -892481550:
                            if (str11.equals("status")) {
                                i4 = 10;
                            }
                            break;
                        case -844665542:
                            if (str11.equals("queueUpdate")) {
                                i4 = 14;
                            }
                            break;
                        case -810883302:
                            if (str11.equals("volume")) {
                                i4 = 7;
                            }
                            break;
                        case -402284771:
                            if (str11.equals("setPlaybackRate")) {
                                i4 = 20;
                            }
                            break;
                        case 3327206:
                            if (str11.equals("load")) {
                                i4 = 2;
                            }
                            break;
                        case 3363353:
                            if (str11.equals("mute")) {
                                i4 = 8;
                            }
                            break;
                        case 3443508:
                            if (str11.equals("play")) {
                                i4 = 3;
                            }
                            break;
                        case 3526264:
                            if (str11.equals("seek")) {
                                i4 = 6;
                            }
                            break;
                        case 3540994:
                            if (str11.equals("stop")) {
                                i4 = 5;
                            }
                            break;
                        case 106440182:
                            if (str11.equals("pause")) {
                                i4 = 4;
                            }
                            break;
                        case 525402049:
                            if (str11.equals("queueFetchItemRange")) {
                                i4 = 18;
                            }
                            break;
                        case 913357482:
                            if (str11.equals("queueReorder")) {
                                i4 = i5;
                            }
                            break;
                        case 1148867366:
                            if (str11.equals("trackStyle")) {
                                i4 = 12;
                            }
                            break;
                        case 1451542318:
                            if (str11.equals("activeTracks")) {
                                i4 = 11;
                            }
                            break;
                        case 1873161788:
                            if (str11.equals("queueFetchItemIds")) {
                                i4 = 17;
                            }
                            break;
                        default:
                            break;
                    }
                    w4p1VarM.a();
                    ((y4p1) w4p1VarM.b).r(i4);
                    int i7 = (int) zvn1Var.b;
                    w4p1VarM.a();
                    ((y4p1) w4p1VarM.b).n(i7);
                    int i8 = zvn1Var.c;
                    w4p1VarM.a();
                    ((y4p1) w4p1VarM.b).o(i8);
                    int i9 = (int) (zvn1Var.d - zvn1Var.f);
                    w4p1VarM.a();
                    ((y4p1) w4p1VarM.b).p(i9);
                    int i10 = (int) (zvn1Var.e - zvn1Var.f);
                    w4p1VarM.a();
                    ((y4p1) w4p1VarM.b).q(i10);
                    arrayList3.add((y4p1) w4p1VarM.b());
                    i5 = 16;
                }
                j5p1VarM.a();
                ((m5p1) j5p1VarM.b).q(arrayList3);
            }
            if (nbn1Var.m != null) {
                ArrayList arrayList4 = new ArrayList();
                vua vuaVar = nbn1Var.m;
                int i11 = vuaVar.a;
                a5p1 a5p1VarM = c5p1.m();
                if (i11 == 1) {
                    i2 = 2;
                } else if (i11 == 2) {
                    i2 = 3;
                } else if (i11 != 3) {
                    i2 = i11 != 4 ? 1 : 5;
                } else {
                    i2 = 4;
                }
                a5p1VarM.a();
                ((c5p1) a5p1VarM.b).o(i2);
                int i12 = (int) (vuaVar.b - vuaVar.c);
                a5p1VarM.a();
                ((c5p1) a5p1VarM.b).n(i12);
                arrayList4.add((c5p1) a5p1VarM.b());
                j5p1VarM.a();
                ((m5p1) j5p1VarM.b).t(arrayList4);
            }
            Map map = nbn1Var.e;
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (sen1 sen1Var : map.values()) {
                    sen1Var.getClass();
                    v5p1 v5p1VarM = y5p1.m();
                    byte b2 = sen1Var.e;
                    v5p1VarM.a();
                    ((y5p1) v5p1VarM.b).q(b2);
                    int i13 = sen1Var.d.get();
                    v5p1VarM.a();
                    ((y5p1) v5p1VarM.b).n(i13);
                    int i14 = (int) (sen1Var.a - sen1Var.c);
                    v5p1VarM.a();
                    ((y5p1) v5p1VarM.b).o(i14);
                    int i15 = (int) (sen1Var.b - sen1Var.c);
                    v5p1VarM.a();
                    ((y5p1) v5p1VarM.b).p(i15);
                    arrayList5.add((y5p1) v5p1VarM.b());
                }
                j5p1VarM.a();
                ((m5p1) j5p1VarM.b).s(arrayList5);
            }
            int i16 = nbn1Var.u;
            j5p1VarM.a();
            ((m5p1) j5p1VarM.b).u(i16);
            m5p1 m5p1Var = (m5p1) j5p1VarM.b();
            q4p1VarN.a();
            ((t4p1) q4p1VarN.b).x(m5p1Var);
            nbn1Var.f.a((t4p1) q4p1VarN.b(), 233);
            this.d = null;
        }
    }

    public int a(long j) {
        long[] jArr = (long[]) this.a;
        int iB = zoi1.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        ((t45) this.b).g("detect-login");
        ((a77) ((tp7) this.e).h).d(th, new VoiceAssistantLoggingContext((String) this.a, (String) this.c, (String) this.d, (String) null));
        return Observable.error(th);
    }

    public List b(long j) {
        zwg1 zwg1Var = (zwg1) this.b;
        Map map = (Map) this.c;
        HashMap map2 = (HashMap) this.d;
        HashMap map3 = (HashMap) this.e;
        ArrayList<Pair> arrayList = new ArrayList();
        zwg1Var.g(j, zwg1Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        zwg1Var.i(j, false, zwg1Var.h, treeMap);
        zwg1Var.h(j, map, map2, zwg1Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                bxg1 bxg1Var = (bxg1) map2.get(pair.first);
                bxg1Var.getClass();
                arrayList2.add(new feo((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, bitmapDecodeByteArray, bxg1Var.c, 0, bxg1Var.e, bxg1Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, bxg1Var.f, bxg1Var.g, false, -16777216, bxg1Var.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            bxg1 bxg1Var2 = (bxg1) map2.get(entry.getKey());
            bxg1Var2.getClass();
            eeo eeoVar = (eeo) entry.getValue();
            CharSequence charSequence = eeoVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (h9t h9tVar : (h9t[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h9t.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(h9tVar), spannableStringBuilder.getSpanEnd(h9tVar), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = bxg1Var2.c;
            int i9 = bxg1Var2.d;
            eeoVar.e = f;
            eeoVar.f = i9;
            eeoVar.g = bxg1Var2.e;
            eeoVar.h = bxg1Var2.b;
            eeoVar.l = bxg1Var2.f;
            float f2 = bxg1Var2.i;
            int i10 = bxg1Var2.h;
            eeoVar.k = f2;
            eeoVar.j = i10;
            eeoVar.p = bxg1Var2.j;
            arrayList2.add(eeoVar.a());
        }
        return arrayList2;
    }

    public long c(int i) {
        return ((long[]) this.a)[i];
    }

    public int d() {
        return ((long[]) this.a).length;
    }

    public jhm g(String str, String str2, String str3, xwp0 xwp0Var) {
        return new jhm("remove_from_playlist", bpx.c, (fhm) null, 2131954424, (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(i021.Z0, new os(str2, str, (byte) 28)), new tjf0(str, xwp0Var, this, str2, str3, (byte) 13)), 244);
    }

    public tyq h(hxo1 hxo1Var) {
        tyq m231Var;
        try {
            if (hxo1Var instanceof d271) {
                m231Var = y(((d271) hxo1Var).c);
                if (m231Var == null) {
                    m231Var = k(((d271) hxo1Var).p());
                }
            } else if (hxo1Var instanceof f271) {
                m231Var = k(((f271) hxo1Var).c);
            } else if (hxo1Var instanceof c271) {
                m231Var = j(((c271) hxo1Var).c, ((c271) hxo1Var).d);
            } else {
                if (!(hxo1Var instanceof e271)) {
                    throw new NoWhenBranchMatchedException();
                }
                m231Var = y(((e271) hxo1Var).d);
                if (m231Var == null) {
                    m231Var = j(((e271) hxo1Var).c, ((e271) hxo1Var).e);
                }
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.d("Failed to create share card for param: " + hxo1Var, new Object[]{thA});
            hxo1Var.p();
            m231Var = new fos((byte) 0);
            a071[] a071VarArr = a071.a;
        }
        return m231Var;
    }

    public xzq j(String str, oz61 oz61Var) {
        ThreadLocal threadLocal = szq.a;
        rhf rhfVar = (rhf) szq.b((d0r) this.d, new qv61(this, (byte) 3));
        xzq xzqVar = new xzq(new xzq(((i271) rhfVar).a, new q961(rhfVar, (byte) 19)), new c861(str, oz61Var, (byte) 8));
        a071[] a071VarArr = a071.a;
        return xzqVar;
    }

    public tyq k(String str) {
        Function0 function0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.a;
        if (linkedHashMap2.isEmpty() && linkedHashMap.isEmpty()) {
            fos fosVar = new fos((byte) 0);
            a071[] a071VarArr = a071.a;
            return fosVar;
        }
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if ((v5b1Var == null || (function0 = (Function0) linkedHashMap.get(v5b1Var.getType())) == null) && (function0 = (Function0) linkedHashMap2.get(s4b1VarX.c)) == null) {
            fos fosVar2 = new fos((byte) 0);
            a071[] a071VarArr2 = a071.a;
            return fosVar2;
        }
        ThreadLocal threadLocal = szq.a;
        i271 i271Var = (i271) szq.b((d0r) this.d, new pt61(function0, (byte) 2));
        xzq xzqVar = new xzq(new xzq(i271Var.a, new q961(i271Var, (byte) 19)), new pg61(str, (byte) 5));
        a071[] a071VarArr3 = a071.a;
        return xzqVar;
    }

    public ys11 l(d0r d0rVar) {
        zs11 zs11Var = (zs11) this.b;
        mpc1 mpc1Var = new mpc1(2131820880, je30.a);
        vhc vhcVar = (vhc) this.a;
        jd11 jd11Var = rc11.a;
        l4r l4rVar = new l4r(new xv00(jd11Var.b(jo70.class)), 2, lcl1.a1, new j4r(owl1.c), lcl1.b1);
        l4r l4rVar2 = new l4r(new xv00(jd11Var.b(xkk1.class)), 2, lcl1.c1, new j4r(new yvf1(1, (byte) 17)), lcl1.d1);
        xv00 xv00Var = new xv00(jd11Var.b(xkk1.class));
        ppa0 ppa0Var = lo70.b;
        o3r o3rVarM = w3p1.m(l4rVar, l4rVar2, new l4r(xv00Var, 2, lcl1.e1, new k4r(new yvf1(1, (byte) 18), ppa0Var), owl1.b), rre1.Y0);
        return zs11Var.a(d0rVar, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, new hvy(new xzq(((d2q) this.d).a(igu.a, d0rVar), new tak1(this, (byte) 24)), (byte) 4), (iu30) null, (qrk) null, (iu30) null, (iu30) null, (z311) this.c, vhcVar, 2, (o27) null, (gye1) null, mpc1Var, (sb2) null, (rru) null, false, (o3r) null, (o3r) null, (o3r) null, (o3r) null, o3rVarM, (o3r) null, (cv11) null, (y5z) null, (bnw0) null, (bt11) null, 0, (o3r) null, -33574417, 511), (nu11) null);
    }

    public Object m(Object obj, mma0 mma0Var) {
        Object objInvoke;
        oe41 oe41Var = (oe41) this.b;
        Object obj2 = this.e;
        if (obj2 == null) {
            String strI = i(obj, mma0Var);
            oe41Var.c(strI, new tku(this, (byte) 5));
            Bundle bundleA = oe41Var.a(strI);
            if (bundleA != null) {
                objInvoke = new ce41(bundleA, (ae41) this.c).Y((nma0) this.a);
            } else {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = ((Function0) this.d).invoke();
            }
            obj2 = objInvoke;
            this.e = obj2;
        }
        if (obj2 != null) {
            return obj2;
        }
        u890.C("value");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable p(String str, onm onmVar) {
        mc71 mc71Var;
        String m231Var;
        if (onmVar instanceof mc71) {
            mc71Var = (mc71) onmVar;
            int i = mc71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mc71Var.c = i - Integer.MIN_VALUE;
            } else {
                mc71Var = new mc71(this, onmVar);
            }
        } else {
            mc71Var = new mc71(this, onmVar);
        }
        Object objJ = mc71Var.a;
        int i2 = mc71Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleFirstOrError = ((v5n) this.b).b(str).firstOrError();
                mc71Var.c = 1;
                objJ = fc11.j(singleFirstOrError, mc71Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            eww0 eww0Var = (eww0) ((spq0) objJ).h();
            if (eww0Var != null) {
                m231Var = eww0Var.b;
                if (ihc1.y0(m231Var)) {
                    m231Var = null;
                }
            } else {
                m231Var = null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, String str2, onm onmVar) {
        nc71 nc71Var;
        if (onmVar instanceof nc71) {
            nc71Var = (nc71) onmVar;
            int i = nc71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nc71Var.d = i - Integer.MIN_VALUE;
            } else {
                nc71Var = new nc71(this, onmVar);
            }
        } else {
            nc71Var = new nc71(this, onmVar);
        }
        Object objP = nc71Var.b;
        int i2 = nc71Var.d;
        if (i2 == 0) {
            hm5.M(objP);
            nc71Var.a = str;
            nc71Var.d = 1;
            objP = p(str2, nc71Var);
            Object obj = d9n.a;
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = nc71Var.a;
            hm5.M(objP);
        }
        String str3 = (String) objP;
        Context context = (Context) this.d;
        return str3 != null ? context.getString(2131962298, str3, str) : context.getString(2131962297, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r8 == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.oc71
            if (r0 == 0) goto L13
            r0 = r8
            p.oc71 r0 = (p.oc71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.oc71 r0 = new p.oc71
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            goto L72
        L2b:
            r7 = move-exception
            goto L77
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L33:
            int r7 = r0.b
            p.e821 r1 = r0.a
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r6 = r1
            r1 = r7
            r7 = r6
            goto L5f
        L3e:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.a     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            p.gw70 r8 = (p.gw70) r8     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            java.lang.String r1 = "https://cdn-spotify-gen-alpha.spotifycdn.com/account-linking/LinkPreview.webp"
            p.ixg r8 = r8.f(r1)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r1 = 0
            r8.g = r1     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            io.reactivex.rxjava3.core.Single r8 = r8.i()     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r0.a = r7     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r0.b = r1     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r0.e = r3     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            java.lang.Object r8 = p.fc11.j(r8, r0)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            if (r8 != r5) goto L5f
            goto L71
        L5f:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            java.lang.Object r7 = r7.c     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            p.zxa r7 = (p.zxa) r7     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r0.a = r4     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r0.b = r1     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            r0.e = r2     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            java.lang.Object r8 = p.zxa.d(r7, r8, r0)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            if (r8 != r5) goto L72
        L71:
            return r5
        L72:
            android.net.Uri r8 = (android.net.Uri) r8     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L75
            goto L7c
        L75:
            r7 = move-exception
            goto L83
        L77:
            p.m231 r8 = new p.m231
            r8.<init>(r7)
        L7c:
            boolean r7 = r8 instanceof p.m231
            if (r7 == 0) goto L81
            goto L82
        L81:
            r4 = r8
        L82:
            return r4
        L83:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e821.r(p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object s(String str, String str2, c9n c9nVar, onm onmVar) throws AbortFlowException {
        twb1 twb1Var;
        c9n c9nVar2;
        String str3;
        String str4;
        r091 r091VarR;
        bpb1 bpb1Var = (bpb1) this.c;
        zau0 zau0Var = (zau0) this.a;
        if (onmVar instanceof twb1) {
            twb1Var = (twb1) onmVar;
            int i = twb1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                twb1Var.e = i - Integer.MIN_VALUE;
            } else {
                twb1Var = new twb1(this, onmVar);
            }
        } else {
            twb1Var = new twb1(this, onmVar);
        }
        Object obj = twb1Var.c;
        int i2 = twb1Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            xab1 xab1Var = (xab1) this.e;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            ((bpb1) this.d).l(str2);
            if (((Boolean) zau0Var.b.getValue()).booleanValue()) {
                c9nVar2 = c9nVar;
                str3 = str;
            } else {
                ((ttm0) this.b).a(zau0Var);
                bpb1 bpb1Var2 = zau0Var.b;
                yy11 yy11Var = new yy11(2, (lnm) null, (byte) 4);
                twb1Var.a = str;
                twb1Var.b = c9nVar;
                twb1Var.e = 1;
                Object objJ = b5p1.j(bpb1Var2, yy11Var, twb1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                str4 = str;
                c9nVar2 = c9nVar;
            }
            r091VarR = q3p1.r(zau0Var, (r091) bpb1Var.getValue());
            bpb1Var.l(r091VarR);
            if (r091VarR != null) {
                r091VarR.b(new lsm0(str3, new ksm0(fec1.c, (String) null, (String) null, "StickerPreview", (String) null, (String) null, 502), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
                r091VarR.k();
                r091.f(r091VarR, (tv80) null, (Long) null, tky0.a, 7);
            }
            this.e = fn31.T(c9nVar2, (o8n) null, 0, new xba1(this, (lnm) null, (byte) 12), 3);
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c9nVar2 = twb1Var.b;
        str4 = twb1Var.a;
        hm5.M(obj);
        str3 = str4;
        r091VarR = q3p1.r(zau0Var, (r091) bpb1Var.getValue());
        bpb1Var.l(r091VarR);
        if (r091VarR != null) {
            r091VarR.b(new lsm0(str3, new ksm0(fec1.c, (String) null, (String) null, "StickerPreview", (String) null, (String) null, 502), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
            r091VarR.k();
            r091.f(r091VarR, (tv80) null, (Long) null, tky0.a, 7);
        }
        this.e = fn31.T(c9nVar2, (o8n) null, 0, new xba1(this, (lnm) null, (byte) 12), 3);
        return rih1.a;
    }

    public void t(String str, String str2, String str3, tv80 tv80Var) {
        dg30 dg30Var = (dg30) this.b;
        fn31.T(cto1.q(dg30Var), (o8n) null, 0, new sew0(this, str, str3, tv80Var, (lnm) null, (byte) 12), 3);
        fn31.T(cto1.q(dg30Var), (o8n) null, 0, new d821(this, str2, (lnm) null, (byte) 0), 3);
    }

    public Object u(huu huuVar) {
        return fn31.Y((q8n) this.e, new fkj1(this, (lnm) null, (byte) 0), huuVar);
    }

    public void v(mma0 mma0Var, Object obj, Object obj2) {
        if (this.e == null) {
            ((oe41) this.b).c(i(obj, mma0Var), new tku(this, (byte) 5));
        }
        this.e = obj2;
    }

    public void w() {
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) this.e;
        if (toolbarSearchFieldView.g.getVisibility() == 0) {
            toolbarSearchFieldView.d.getText().clear();
        } else {
            e((ObjectAnimator) this.d, (AnimatorSet) this.b);
        }
    }

    public void x() {
        xab1 xab1Var = (xab1) this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        r091 r091Var = (r091) ((bpb1) this.c).getValue();
        if (r091Var != null) {
            r091Var.c();
        }
        ((bpb1) this.d).l((Object) null);
        ((ttm0) this.b).b((zau0) this.a);
    }

    public xzq y(qz61 qz61Var) {
        if (qz61Var.b.z() == null) {
            return null;
        }
        blc0 blc0Var = qz61Var.a.a.c;
        Function0 function0 = (Function0) ((xkg0) this.b).get(new mmr0(blc0Var, rc11.a.b(qz61Var.c.getClass())));
        if (function0 == null) {
            return null;
        }
        ThreadLocal threadLocal = szq.a;
        i271 i271Var = (i271) szq.b((d0r) this.d, new pt61(function0, (byte) 3));
        xzq xzqVar = new xzq(new xzq(i271Var.a, new q961(i271Var, (byte) 19)), new q961(qz61Var, (byte) 18));
        a071[] a071VarArr = a071.a;
        return xzqVar;
    }

    public void z(dwn1 dwn1Var) {
        nbn1 nbn1Var;
        String str = (String) this.c;
        emo1 emo1Var = (emo1) this.b;
        byte b = dwn1Var.e;
        if (b == 2 && ((nbn1) this.d) != null) {
            B();
        }
        if (b == 2) {
            nbn1Var = new nbn1(emo1Var, str);
            this.d = nbn1Var;
        } else {
            if (((nbn1) this.d) == null) {
                nbn1 nbn1Var2 = new nbn1(emo1Var, str);
                this.d = nbn1Var2;
                nbn1Var2.b(1);
            }
            nbn1Var = (nbn1) this.d;
            this.d = nbn1Var;
        }
        zod.s(nbn1Var);
        dwn1Var.d = nbn1Var.h;
        nbn1Var.b.add(dwn1Var);
    }

    public /* synthetic */ e821(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ e821(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public e821(zs11 zs11Var, uic uicVar, vhc vhcVar, z311 z311Var, d2q d2qVar, lik1 lik1Var) {
        this.b = zs11Var;
        this.a = vhcVar;
        this.c = z311Var;
        this.d = d2qVar;
        this.e = lik1Var;
    }

    public /* synthetic */ e821(ConstraintLayout constraintLayout, View view, View view2, View view3, ViewGroup viewGroup, View view4) {
        this.b = view;
        this.a = view2;
        this.c = view3;
        this.d = viewGroup;
        this.e = view4;
    }

    public e821(s4b1 s4b1Var, ych1 ych1Var, Scheduler scheduler, tun0 tun0Var) {
        this.b = s4b1Var;
        this.a = ych1Var;
        this.c = scheduler;
        this.d = tun0Var;
        this.e = new idd1(new z9k1(this));
    }
}
