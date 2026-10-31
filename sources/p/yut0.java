package p;

import android.content.Context;
import android.net.Uri;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yut0 implements rhh0 {
    public final /* synthetic */ byte a = 1;
    public final Context b;
    public final Object c;
    public final Object d;

    public yut0(Context context, sut0 sut0Var, zr00 zr00Var, o3e0 o3e0Var) {
        this.b = context;
        this.c = sut0Var;
        this.d = zr00Var;
    }

    public final Observable a(r9c r9cVar) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                sut0 sut0Var = (sut0) this.c;
                return Observable.combineLatest(((stk) sut0Var.b.get()).a().distinctUntilChanged().switchMap(new rut0(sut0Var, (byte) 0)).subscribeOn(sut0Var.c), yoi1.i(((zr00) obj).a, o6x.a), new jxp0(this, (byte) 7));
            default:
                return ((Observable) obj).map(new ssk1(r9cVar, this)).switchMap(new zxl1(this, r9cVar, (byte) 9));
        }
    }

    public final Single b(r9c r9cVar) {
        switch (this.a) {
            case 0:
                return a(r9cVar).firstOrError();
            default:
                return ((Observable) this.d).map(new ssk1(r9cVar, this)).switchMap(new ezb1(this, (byte) 24)).takeUntil(kcx0.Z0).takeLast(1).singleOrError().map(new qpj1(this, r9cVar, (byte) 29));
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r3v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 ??, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 ??, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 android.content.res.Resources, new type: android.content.res.Resources
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    public ArrayList c(YourLibraryResponse yourLibraryResponse, r9c r9cVar) {
        Map mapE;
        String quantityString;
        String quantityString2;
        String quantityString3;
        String quantityString4;
        String quantityString5;
        ArrayList arrayList = new ArrayList();
        d290 d290VarQ = yourLibraryResponse.q().n().q();
        boolean z = r9cVar.g;
        ksm1 ksm1Var = ksm1.DOWNLOADED;
        ksm1 ksm1Var2 = ksm1.SHOW;
        ksm1 ksm1Var3 = ksm1.PLAYLIST;
        ksm1 ksm1Var4 = ksm1.BOOK;
        ksm1 ksm1Var5 = ksm1.ARTIST;
        ksm1 ksm1Var6 = ksm1.ALBUM;
        if (!z) {
            h290<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> h290VarN = yourLibraryResponse.n();
            mapE = zno1.E(new LinkedHashMap());
            for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : h290VarN) {
                if (!yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.B()) {
                    break;
                }
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.hasAlbum()) {
                    mapE.put(ksm1Var6, Integer.valueOf(((Number) sqg0.G(ksm1Var6, mapE)).intValue() + 1));
                }
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.hasArtist()) {
                    mapE.put(ksm1Var5, Integer.valueOf(((Number) sqg0.G(ksm1Var5, mapE)).intValue() + 1));
                }
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.A()) {
                    mapE.put(ksm1Var4, Integer.valueOf(((Number) sqg0.G(ksm1Var4, mapE)).intValue() + 1));
                }
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.hasPlaylist() || yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.C()) {
                    mapE.put(ksm1Var3, Integer.valueOf(((Number) sqg0.G(ksm1Var3, mapE)).intValue() + 1));
                }
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.hasShow() || yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.D()) {
                    mapE.put(ksm1Var2, Integer.valueOf(((Number) sqg0.G(ksm1Var2, mapE)).intValue() + 1));
                }
                if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().s() == atm1.YES) {
                    mapE.put(ksm1Var, Integer.valueOf(((Number) sqg0.G(ksm1Var, mapE)).intValue() + 1));
                }
            }
        } else {
            mapE = b7x.a;
        }
        boolean zContains = d290VarQ.contains(ksm1Var3);
        String quantityString6 = null;
        Context context = this.b;
        if (zContains) {
            String string = context.getString(2131954015);
            Integer num = (Integer) mapE.get(ksm1Var3);
            if (num != null) {
                int iIntValue = num.intValue();
                quantityString5 = context.getResources().getQuantityString(2131820767, iIntValue, Integer.valueOf(iIntValue));
            } else {
                quantityString5 = null;
            }
            arrayList.add(new u310("com.spotify.your-playlists", (String) null, string, quantityString5, kno1.q(context, 2131233211), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, 2, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -2078, 15));
        }
        if (d290VarQ.contains(ksm1Var6)) {
            String string2 = context.getString(2131954012);
            Integer num2 = (Integer) mapE.get(ksm1Var6);
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                quantityString4 = context.getResources().getQuantityString(2131820767, iIntValue2, Integer.valueOf(iIntValue2));
            } else {
                quantityString4 = null;
            }
            arrayList.add(new u310("com.spotify.your-albums", (String) null, string2, quantityString4, kno1.q(context, 2131233201), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, 2, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -2078, 15));
        }
        if (d290VarQ.contains(ksm1Var5)) {
            String string3 = context.getString(2131954013);
            Integer num3 = (Integer) mapE.get(ksm1Var5);
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                quantityString3 = context.getResources().getQuantityString(r10, iIntValue3, Integer.valueOf(iIntValue3));
            } else {
                quantityString3 = null;
            }
            arrayList.add(new u310("com.spotify.your-artists", (String) null, string3, quantityString3, kno1.q(context, 2131233202), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, 2, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -2078, 15));
        }
        if (d290VarQ.contains(ksm1Var2)) {
            String string4 = context.getString(2131954017);
            Integer num4 = (Integer) mapE.get(ksm1Var2);
            if (num4 != null) {
                int iIntValue4 = num4.intValue();
                quantityString2 = context.getResources().getQuantityString(r10, iIntValue4, Integer.valueOf(iIntValue4));
            } else {
                quantityString2 = null;
            }
            arrayList.add(new u310("com.spotify.your-podcasts", (String) null, string4, quantityString2, kno1.q(context, 2131233212), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, 2, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -2078, 15));
        }
        if (d290VarQ.contains(ksm1Var4)) {
            String string5 = context.getString(2131953980);
            Integer num5 = (Integer) mapE.get(ksm1Var4);
            if (num5 != null) {
                int iIntValue5 = num5.intValue();
                quantityString = context.getResources().getQuantityString(r10, iIntValue5, Integer.valueOf(iIntValue5));
            } else {
                quantityString = null;
            }
            arrayList.add(new u310("com.spotify.your-audiobooks", (String) null, string5, quantityString, kno1.q(context, 2131233203), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, 2, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -2078, 15));
        }
        if (d290VarQ.contains(ksm1Var)) {
            String string6 = context.getString(2131953991);
            Integer num6 = (Integer) mapE.get(ksm1Var);
            if (num6 != null) {
                int iIntValue6 = num6.intValue();
                quantityString6 = context.getResources().getQuantityString(r10, iIntValue6, Integer.valueOf(iIntValue6));
            }
            arrayList.add(new u310("com.spotify.downloaded", (String) null, string6, quantityString6, kno1.q(context, 2131233205), (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, 2, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -2078, 15));
        }
        return arrayList;
    }

    public yut0(Context context, mwm1 mwm1Var, Observable observable) {
        this.b = context;
        this.c = mwm1Var;
        this.d = observable;
    }
}
