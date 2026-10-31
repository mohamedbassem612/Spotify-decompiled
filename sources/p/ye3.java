package p;

import android.widget.TextView;
import com.spotify.userinteractivityservice.usercomments.v1.proto.AuthorMetadata;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ye3 implements iu30 {
    public final /* synthetic */ byte a;
    public static final ye3 b = new ye3(0);
    public static final ye3 c = new ye3(1);
    public static final ye3 d = new ye3(2);
    public static final ye3 e = new ye3(3);
    public static final ye3 f = new ye3(4);
    public static final ye3 g = new ye3(5);
    public static final ye3 h = new ye3(6);
    public static final ye3 i = new ye3(7);
    public static final ye3 t = new ye3(8);
    public static final ye3 X = new ye3(9);
    public static final ye3 Y = new ye3(10);
    public static final ye3 Z = new ye3(11);
    public static final ye3 N0 = new ye3(12);
    public static final ye3 O0 = new ye3(13);
    public static final ye3 P0 = new ye3(14);
    public static final ye3 Q0 = new ye3(15);
    public static final ye3 R0 = new ye3(16);
    public static final ye3 S0 = new ye3(17);
    public static final ye3 T0 = new ye3(18);
    public static final ye3 U0 = new ye3(19);
    public static final ye3 V0 = new ye3(20);
    public static final ye3 W0 = new ye3(21);
    public static final ye3 X0 = new ye3(22);
    public static final ye3 Y0 = new ye3(23);
    public static final ye3 Z0 = new ye3(24);
    public static final ye3 a1 = new ye3(25);
    public static final ye3 b1 = new ye3(26);
    public static final ye3 c1 = new ye3(27);
    public static final ye3 d1 = new ye3(28);
    public static final ye3 e1 = new ye3(29);

    public /* synthetic */ ye3(byte b2) {
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String string;
        Class<?> declaringClass;
        List listM;
        byte b2 = this.a;
        z6x z6xVar = z6x.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof eer0);
            case 1:
                return rih1Var;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                } else {
                    string = value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
                }
                return str + '=' + string;
            case 3:
                int i2 = dcc.l;
                return Boolean.valueOf(o7h.i0(koa1.f, h0p1.n((jyc) obj)));
            case 4:
                jyc jycVar = (jyc) obj;
                if (jycVar instanceof ov30) {
                    int i3 = dcc.l;
                    if (o7h.i0(koa1.f, h0p1.n(jycVar))) {
                        z = true;
                    }
                } else {
                    int i4 = dcc.l;
                }
                return Boolean.valueOf(z);
            case 5:
                rm5 rm5Var = guc.a;
                return new bla0((Class) obj);
            case 6:
                rm5 rm5Var2 = guc.a;
                return new ema0((Class) obj);
            case 7:
                return anm1.v((bla0) guc.a.q((Class) obj), z6xVar, false, z6xVar, (tka0) null);
            case 8:
                return anm1.v((bla0) guc.a.q((Class) obj), z6xVar, true, z6xVar, (tka0) null);
            case 9:
                rm5 rm5Var3 = guc.a;
                return new ConcurrentHashMap();
            case 10:
                wdg wdgVar = (tka0) obj;
                if (!wdgVar.j() || (declaringClass = wdgVar.n().getDeclaringClass()) == null) {
                    return null;
                }
                return rc11.a.b(declaringClass);
            case 11:
                return ((tka0) obj).getTypeParameters();
            case 12:
                gmh1 gmh1Var = (gmh1) obj;
                gmh1Var.getClass();
                return Boolean.valueOf(gmh1Var.t0() instanceof sod);
            case 13:
                return null;
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                return Boolean.valueOf(zzo1.j((jyc) obj));
            case 17:
                qkh qkhVar = (qkh) obj;
                h290 h290Var = qkhVar.a;
                Comment comment = (Comment) o7h.s0(h290Var);
                if (comment != null && comment.y()) {
                    return Collections.singletonList(jkh.b);
                }
                ArrayList<Comment> arrayList = new ArrayList();
                for (Object obj2 : h290Var) {
                    if (!((Comment) obj2).y()) {
                        arrayList.add(obj2);
                    }
                }
                int i5 = qkhVar.c;
                boolean z2 = qkhVar.d;
                uwe1 uwe1Var = qkhVar.e;
                ArrayList arrayList2 = new ArrayList();
                for (Comment comment2 : arrayList) {
                    int iZ = comment2.z();
                    if (iZ == 0) {
                        listM = Collections.singletonList(new ekh(comment2, i5, z2 && !comment2.w(), uwe1Var));
                    } else {
                        h290<AuthorMetadata> h290VarD = comment2.D();
                        ArrayList arrayList3 = new ArrayList();
                        for (AuthorMetadata authorMetadata : h290VarD) {
                            authorMetadata.getClass();
                            phx phxVarB = j7p1.B(authorMetadata);
                            if (phxVarB != null) {
                                arrayList3.add(phxVarB);
                            }
                        }
                        listM = p7h.M(new pkh[]{new ekh(comment2, i5, z2 && !comment2.w(), uwe1Var), new ikh(iZ, comment2.r(), mqo1.A(arrayList3))});
                    }
                    r7h.W(listM, arrayList2);
                }
                return arrayList2;
            case 18:
                return j7p1.z((tkh) obj);
            case 19:
                return new i46((fg5) obj, (byte) 1);
            case 20:
                Object objJ0 = f46.j0(((TypeVariable) obj).getBounds());
                if (objJ0 instanceof TypeVariable) {
                    return (TypeVariable) objJ0;
                }
                return null;
            case 21:
                Class cls = (Class) obj;
                if (Modifier.isStatic(cls.getModifiers())) {
                    return null;
                }
                return cls.getDeclaringClass();
            case 22:
                return f46.I(((Class) obj).getTypeParameters());
            case 23:
                Type ownerType = ((ParameterizedType) obj).getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 24:
                return f46.Q0(((ParameterizedType) obj).getActualTypeArguments());
            case 25:
                return ((y3b0) obj).e;
            case 26:
                return ((y3b0) obj).c;
            case 27:
                float[] fArr = ((kch0) obj).a;
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                float[] fArr2 = ((kch0) obj).a;
                return rih1Var;
            default:
                return Boolean.valueOf(obj instanceof TextView);
        }
    }
}
