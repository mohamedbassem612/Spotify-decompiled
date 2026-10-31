package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import j$.util.Base64;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u9x0 implements Function, BiFunction, Init, com.spotify.mobius.functions.Function, vq8 {
    public final /* synthetic */ byte a;
    public static final u9x0 b = new u9x0((byte) 0);
    public static final u9x0 c = new u9x0((byte) 1);
    public static final u9x0 d = new u9x0((byte) 2);
    public static final u9x0 e = new u9x0((byte) 3);
    public static final u9x0 f = new u9x0((byte) 4);
    public static final u9x0 g = new u9x0((byte) 5);
    public static final u9x0 h = new u9x0((byte) 6);
    public static final u9x0 i = new u9x0((byte) 8);
    public static final u9x0 t = new u9x0((byte) 9);
    public static final u9x0 X = new u9x0((byte) 10);
    public static final u9x0 Y = new u9x0((byte) 11);
    public static final u9x0 Z = new u9x0((byte) 12);
    public static final u9x0 N0 = new u9x0((byte) 13);
    public static final u9x0 O0 = new u9x0((byte) 14);
    public static final u9x0 P0 = new u9x0((byte) 15);
    public static final u9x0 Q0 = new u9x0((byte) 16);
    public static final u9x0 R0 = new u9x0((byte) 17);
    public static final u9x0 S0 = new u9x0((byte) 18);
    public static final u9x0 T0 = new u9x0((byte) 19);
    public static final u9x0 U0 = new u9x0((byte) 20);
    public static final u9x0 V0 = new u9x0((byte) 21);
    public static final u9x0 W0 = new u9x0((byte) 22);
    public static final u9x0 X0 = new u9x0((byte) 23);
    public static final u9x0 Y0 = new u9x0((byte) 24);
    public static final u9x0 Z0 = new u9x0((byte) 25);
    public static final u9x0 a1 = new u9x0((byte) 26);

    public u9x0(lw0 lw0Var) {
        this.a = (byte) 27;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean g(wb41 wb41Var) {
        yb41 yb41Var = wb41Var.r;
        List list = wb41Var.p;
        if (yb41Var != yb41.X) {
            return false;
        }
        if (!list.contains(yb41.i) || u890.j(wb41Var.e, wb41Var.i)) {
            return ((list.contains(yb41.e) || list.contains(yb41.h)) && u890.j(wb41Var.f, wb41Var.h)) ? false : true;
        }
        return false;
    }

    public static km3 i(Context context, String[] strArr, String str, vyq0 vyq0Var) {
        String[] strArrL = l(context);
        int length = strArrL.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = strArrL[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            String string = sb.toString();
                            vyq0Var.k("Looking for %s in APK %s...", new Object[]{string, str2});
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                km3 km3Var = new km3((byte) 8);
                                km3Var.b = zipFile;
                                km3Var.c = entry;
                                return km3Var;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static String[] j(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c2 = File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : l(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static Next k(wb41 wb41Var, Set set) {
        yb41 yb41Var;
        w7x w7xVarSingleton;
        wb41 wb41VarA = wb41Var;
        Set setO1 = o7h.o1(set);
        yb41 yb41Var2 = wb41VarA.r;
        String str = wb41VarA.c;
        List listO0 = wb41VarA.q;
        yb41 yb41Var3 = yb41.Y;
        if (yb41Var2 != yb41Var3) {
            listO0 = o7h.O0(yb41Var2, listO0);
        }
        List list = listO0;
        List list2 = wb41VarA.p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!list.contains((yb41) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            wb41VarA = wb41.a(wb41VarA, 1, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (List) null, (yb41) null, 67108862);
            yb41Var = yb41Var3;
        } else {
            yb41 yb41Var4 = (yb41) arrayList.get(0);
            switch (yb41Var4.ordinal()) {
                case 0:
                    w7xVarSingleton = Collections.singleton(ra41.c);
                    break;
                case 1:
                    w7xVarSingleton = Collections.singleton(new qa41(str, false));
                    break;
                case 2:
                    w7xVarSingleton = Collections.singleton(new ya41(wb41VarA.j));
                    break;
                case 3:
                    w7xVarSingleton = Collections.singleton(new ua41(str, wb41VarA.d));
                    break;
                case 4:
                    Integer num = wb41VarA.k;
                    num.getClass();
                    w7xVarSingleton = Collections.singleton(new wa41(str, num.intValue()));
                    break;
                case 5:
                    String str2 = wb41VarA.l;
                    str2.getClass();
                    w7xVarSingleton = Collections.singleton(new va41(str, str2));
                    break;
                case 6:
                    w7xVarSingleton = Collections.singleton(new sa41(str));
                    break;
                case 7:
                    w7xVarSingleton = Collections.singleton(new ta41(str, wb41VarA.i));
                    break;
                case 8:
                    w7xVarSingleton = Collections.singleton(new xa41(str, wb41VarA.m, wb41VarA.n, wb41VarA.o));
                    break;
                case 9:
                    w7xVarSingleton = f46.S0(new ha71[]{new qa41(str, true), new pa41(true)});
                    break;
                case 10:
                    w7xVarSingleton = w7x.a;
                    break;
                default:
                    eg.o();
                    return null;
            }
            setO1.addAll((Collection) w7xVarSingleton);
            yb41Var = yb41Var4;
        }
        return Next.i(m(wb41.a(wb41VarA, 0, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, list, yb41Var, 16777215), 0.0f), setO1);
    }

    public static String[] l(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static wb41 m(wb41 wb41Var, float f2) {
        List list = wb41Var.p;
        float fW = y1a1.W(wb41Var.q) / y1a1.W(list);
        yb41 yb41Var = wb41Var.r;
        if (yb41Var != yb41.Y) {
            fW += (yb41Var.a / y1a1.W(list)) * f2;
        }
        return wb41.a(wb41Var, 0, fW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (List) null, (yb41) null, 67108861);
    }

    public spq0 a(Uri uri, br8 br8Var) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String str = br8Var.c;
        if (str != null) {
            builderBuildUpon.appendQueryParameter("state", str);
        }
        builderBuildUpon.appendQueryParameter("code", br8Var.a);
        return spq0.d(builderBuildUpon.build());
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new z9x0((Throwable) obj);
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
                return z6x.a;
            case 3:
                return GetRecentlyPlayedTracksResponse.p().build();
            case 4:
            case 5:
            case 7:
            case 12:
            case 18:
            case 22:
            case 23:
            default:
                spq0 spq0Var = (spq0) obj;
                SeekToCommand.Builder builder = SeekToCommand.builder(-15000L);
                CommandOptions.Builder builder2 = CommandOptions.builder();
                if (spq0Var.c()) {
                    builder2.onlyForPlaybackId((String) spq0Var.b());
                }
                return new j9u0(builder.options(builder2.build()).relative(SeekToCommand.Relative.CURRENT).build());
            case 6:
                return (hq3) obj;
            case 8:
                long j = ((Boolean) obj).booleanValue() ? 3000L : 0L;
                int i2 = Flowable.a;
                return Flowable.a0(j, TimeUnit.MILLISECONDS, Schedulers.b);
            case 9:
                return new sp61(((Integer) obj).intValue());
            case 10:
                return j5.a;
            case 11:
                return new go81((cg2) obj);
            case 13:
                return new to91(Boolean.valueOf(((sm81) obj).c));
            case 14:
                e5a0 e5a0Var = (e5a0) obj;
                return new b4a1(new f5a0(e5a0Var.a, e5a0Var.b, e5a0Var.c));
            case 15:
                return Boolean.valueOf(((nta1) obj) instanceof mta1);
            case 16:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return StatusResponseOuterClass.StatusResponse.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass.StatusResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 17:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport error";
                }
                return new y0f1(message);
            case 19:
                return tbg1.a;
            case 20:
                Boolean bool = (Boolean) o7h.s0(((CollectionPlatformEsperantoContainsResponse) obj).o().p());
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 21:
                return Boolean.TRUE;
            case 24:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return YourLibraryDecorateResponse.q(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryDecorateResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
        }
    }

    public Bundle c(String str, String str2, int i2, String str3) {
        Logger.d("Url V1 doesn't support token response type", new Object[0]);
        throw new UnsupportedOperationException("Url V1 doesn't support token response");
    }

    public Intent d(nhz nhzVar, String str, String str2) {
        return null;
    }

    public Bundle e(String str, String str2, String str3) {
        return null;
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 5:
                return First.b((vb21) obj);
            default:
                return First.b((jqk1) obj);
        }
    }

    public Intent f(Bundle bundle) {
        return null;
    }

    public spq0 h(Uri uri, nhz nhzVar, String str) {
        String str2 = nhzVar.a;
        TextUtils.isEmpty(str);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        return spq0.d(builderBuildUpon.appendQueryParameter("error", builderBuildUpon.toString()).build());
    }

    public /* synthetic */ u9x0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return ((Boolean) obj2).booleanValue() ? new hvq0(ivq0.b, false) : (hvq0) obj;
            case 18:
                return new mmr0((PlayerState) obj, (Boolean) obj2);
            default:
                return new mmr0(((mmr0) obj).b, Double.valueOf(((Number) obj2).doubleValue()));
        }
    }
}
