package p;

import android.R;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class r8 implements r2j0 {
    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = l290.a;
        iterable.getClass();
        if (iterable instanceof nvb0) {
            List listA = ((nvb0) iterable).a();
            nvb0 nvb0Var = (nvb0) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String strE = gvg.e(nvb0Var.size() - size, "Element at index ", " is null.");
                    for (int size2 = nvb0Var.size() - 1; size2 >= size; size2--) {
                        nvb0Var.remove(size2);
                    }
                    bhn0.i(strE);
                    return;
                }
                if (obj instanceof phc) {
                    nvb0Var.g0((phc) obj);
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    nvb0Var.g0(phc.e(0, bArr, bArr.length));
                } else {
                    nvb0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof onw0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof siy0) {
                siy0 siy0Var = (siy0) list;
                int i = siy0Var.c + size3;
                Object[] objArr = siy0Var.b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        siy0Var.b = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = f4i1.a(length, 3, 2, 1, 10);
                        }
                        siy0Var.b = Arrays.copyOf(siy0Var.b, length);
                    }
                }
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    l(size4, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i2 = 0; i2 < size5; i2++) {
            R.bool boolVar = (Object) list2.get(i2);
            if (boolVar == null) {
                l(size4, list);
                throw null;
            }
            list.add(boolVar);
        }
    }

    public static void l(int i, List list) {
        String strE = gvg.e(list.size() - i, "Element at index ", " is null.");
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(strE);
    }

    public static UninitializedMessageException newUninitializedMessageException(s2j0 s2j0Var) {
        return new UninitializedMessageException();
    }

    public abstract r8 internalMergeFrom(s8 s8Var);

    public final String k() {
        return f4i1.f("Reading ", getClass().getName(), " from a ByteString threw an IOException (should never happen).");
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, uz00 uz00Var) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mergeFrom((InputStream) new q8(inputStream, lwg.s(inputStream, i), (byte) 1), uz00Var);
        return true;
    }

    @Override // p.r2j0
    public abstract r8 mergeFrom(lwg lwgVar, uz00 uz00Var);

    @Override // p.r2j0
    public r8 mergeFrom(s2j0 s2j0Var) {
        if (getDefaultInstanceForType().getClass().isInstance(s2j0Var)) {
            return internalMergeFrom((s8) s2j0Var);
        }
        hhg1.n("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    /* JADX INFO: renamed from: mergeFrom */
    public abstract r8 mo4mergeFrom(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract r8 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, uz00.a());
    }

    @Override // 
    public r8 mergeFrom(lwg lwgVar) {
        return mergeFrom(lwgVar, uz00.a());
    }

    @Override // 
    public r8 mergeFrom(phc phcVar) throws InvalidProtocolBufferException {
        try {
            lwg lwgVarP = phcVar.p();
            mergeFrom(lwgVarP);
            lwgVarP.a(0);
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            bhn0.o(k(), e2);
            return null;
        }
    }

    @Override // 
    public r8 mergeFrom(phc phcVar, uz00 uz00Var) throws InvalidProtocolBufferException {
        try {
            lwg lwgVarP = phcVar.p();
            mergeFrom(lwgVarP, uz00Var);
            lwgVarP.a(0);
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            bhn0.o(k(), e2);
            return null;
        }
    }

    @Override // 
    public r8 mergeFrom(byte[] bArr) {
        return mo4mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    public r8 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return mo5mergeFrom(bArr, 0, bArr.length, uz00Var);
    }

    @Override // 
    public r8 mergeFrom(InputStream inputStream) {
        lwg lwgVarG = lwg.g(inputStream);
        mergeFrom(lwgVarG);
        lwgVarG.a(0);
        return this;
    }

    @Override // 
    public r8 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        lwg lwgVarG = lwg.g(inputStream);
        mergeFrom(lwgVarG, uz00Var);
        lwgVarG.a(0);
        return this;
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }
}
